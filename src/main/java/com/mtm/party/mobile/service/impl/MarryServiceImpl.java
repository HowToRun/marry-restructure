/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: MarryServiceImpl
 * Author:   yihan.hu
 * Date:     2019/7/31 16:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.service.impl;

import com.alibaba.fastjson.JSON;
import com.mtm.party.mobile.dao.MobileMapper;
import com.mtm.party.mobile.dao.UserMapper;
import com.mtm.party.mobile.model.*;
import com.mtm.party.mobile.service.MarryService;
import com.mtm.party.mobile.utils.R;
import com.mtm.party.util.HttpRequestor;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能简述 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/7/31
 * @since 1.0.0
 */
@Service
public class MarryServiceImpl implements MarryService {
  protected static Logger logger = LoggerFactory.getLogger(MarryServiceImpl.class);

  @Resource
  UserMapper userMapper;
  @Resource
  MobileMapper mobileMapper;

  @Override
  public R getOpenId(String appid, String secret, String code, String grantType) {
    logger.info("code======>"+code);
    logger.info("appid======>"+appid);
    logger.info("secret======>"+secret);
//    拼接get请求地址，请求微信接口获取openid
    String requestUrl = new StringBuilder().
        append("https://api.weixin.qq.com/sns/jscode2session?appid=")
        .append(appid)
        .append("&secret=")
        .append(secret)
        .append("&js_code=")
        .append(code)
        .append("&grant_type=authorization_code")
        .toString();
    // 第一次请求 获取access_token 和 openid
    String oppid;
    try {
      oppid = new HttpRequestor().doGet(requestUrl);
      JSONObject oppidObj = JSONObject.fromObject(oppid);
      logger.info("oppidObj======>"+oppidObj);
      String openid = (String) oppidObj.get("openid");
      if (openid != null && !"".equals(openid)) {
        Map<String,String> data = new HashMap<>();
        data.put("openid",openid);
        return new R().ok(data);
      } else {
        return new R().error("获取openID失败！请重试！");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return new R().error("获取openID失败！请重试！");
  }

  @Override
  @Transactional
  public R saveUser(String openId, String userInfo) {
    logger.info("openId======>"+openId);
    logger.info("userInfo======>"+userInfo);
    if(StringUtils.isEmpty(userInfo)){
      return new R().error("获取用户信息失败");
    }
    if(StringUtils.isEmpty(openId)){
      return new R().error("openId为空！请重试");
    }
//    逻辑分为两部分。
//    一、记录当前用户的登录记录。录入user_record_info表
//    二、判断当前用户是否为曾经登录过的用户，
//    true：更新用户表记录为当前数据；false：新增用户表一条记录

//    记录用户登录记录
    UserRecordInfo userRecordInfo = new UserRecordInfo();
    userRecordInfo.setUserOpenId(openId);
    userMapper.saveRecord(userRecordInfo);
//    记录之后开始判断当前用户是否是二次登录
    UserInfo userInfoEntity = JSON.parseObject(userInfo, UserInfo.class);
    UserEntity user = userMapper.getUserByOpenId(openId);
    logger.info("查询结果======>"+user);
    if(user==null){
//      user为空，说明用户首次登录
      user = new UserEntity();
      setUserData(openId, userInfoEntity, user);
      logger.info("保存用户======>"+user);
      userMapper.saveUserInfo(user);
      return new R().ok("用户保存成功");
    } else {
//      user不为空，说明用户不是首次登录
//      更新用户信息
      setUserData(openId,userInfoEntity,user);
      userMapper.updateUserInfo(user);
      logger.info("更新用户======>"+user);
      return new R().ok("用户更新成功");
    }

  }

  @Override
  public R getHomeImg(String openId) {
    List<HomeImgEntity> list = mobileMapper.getHomeImg(openId);

    return new R().ok(list);
  }

  @Override
  public R getDetailImage(String openId, String id) {
//    home页点击预览大图，进入单节详情页时所需的数据
//    通过id查询所属于预览大图下所有的详情数据
//    再循环取出详情图片地址单独存放一个list，返回前端用于图片预览
//    此处应该可以前端实现，可进一步调研优化
    logger.info("获取详情======>"+id);
    List<ImgDetailEntity> list = mobileMapper.getDetailImage(id);
    logger.info("查询成功，数据集容量======>"+list.size());
    List<String> srcList = new ArrayList<>();
//    数据由map封装返回
    Map<String,List> data = new HashMap<>();
    data.put("list",list);
    data.put("srcList",srcList);
    for (ImgDetailEntity entity : list) {
      srcList.add(entity.getImgUrl());
    }
    return new R().ok(data);
  }

  @Override
  public R getPraise() {
    logger.info("===>查询点赞列表<===");
    List<BlessInfoDto> list = mobileMapper.getblessInfo();
    logger.info("查询成功，结果集容量===>"+list.size()+"条数据");
    return new R().ok(list);
  }

  @Override
  public R getComment() {
    logger.info("===>查询评论列表<===");
    List<CommentDto> list = mobileMapper.getcomment();
    logger.info("查询成功，结果集容量===>"+list.size()+"条数据");
    return new R().ok(list);
  }

  @Override
  @Transactional
  public R doComment(CommentDto commentDto) {
    logger.info("===>记录评论内容<===");
    mobileMapper.doComment(commentDto);
    return new R().ok("评论成功");
  }

  @Override
  public R doPraise(String openId) {
//    执行点赞前先判断当前用户是否已经点过赞了
    logger.info("用户点赞======>"+openId);
    int exit = mobileMapper.check(openId);
    if(exit>0){
      //    如果点过赞，返回信息不增加点赞
      logger.info("===>重复点赞，回执请求<===");
      return new R().ok("您已经点过赞了");
    }else {
      //    未点赞的增加点赞，点赞表里新增一条记录
      logger.info("===>更新点赞数据<===");
      mobileMapper.doPraise(openId);
    }


    return new R().ok("点赞成功");
  }

  private void setUserData(String openId, UserInfo userInfoEntity, UserEntity user) {
    user.setAvatarUrl(userInfoEntity.getAvatarUrl());
    user.setCity(userInfoEntity.getCity());
    user.setNickName(userInfoEntity.getNickName());
    user.setOpenId(openId);
    user.setProvince(userInfoEntity.getProvince());
  }
}
