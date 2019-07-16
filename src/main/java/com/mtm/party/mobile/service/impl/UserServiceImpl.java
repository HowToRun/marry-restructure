/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: UserServiceImpl
 * Author:   yihan.hu
 * Date:     2019/7/2 14:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.service.impl;

import com.google.gson.Gson;
import com.mtm.party.mobile.controller.MobileController;
import com.mtm.party.mobile.dao.UserMapper;
import com.mtm.party.mobile.model.*;
import com.mtm.party.mobile.service.MobileService;
import com.mtm.party.mobile.service.UserService;
import com.mtm.party.mobile.util.MobileUtils;
import com.mtm.party.util.HttpRequestor;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 功能简述 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/7/2
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
  protected static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

  @Resource
  UserMapper dao;
  @Resource
  MobileService mobileService;


  /**
   * 保存用户
   * @param user
   */
  @Override
  public void saveUser(User user){

    dao.saveUser(user);
  }
  /**
   * 保存用户
   * @param userRecord
   */
  @Override
  @Transactional
  public String saveUserRecord(HttpServletRequest request, UserRecord userRecord){

    String openId = request.getParameter("openId");
    String userInfos = request.getParameter("userInfo");
    Gson gson = new Gson();
    // 格式化到秒
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // 用户操作记录
    userRecord.setId(MobileUtils.getId());
    userRecord.setOpenId(openId);
    UserInfo userInfo = gson.fromJson(userInfos, UserInfo.class);
    userRecord.setAvatraUrl(userInfo.getAvatarUrl());
    userRecord.setCity(userInfo.getCity());
    userRecord.setNickName(MobileUtils.filter(userInfo.getNickName()));
    userRecord.setProvince(userInfo.getProvince());
    userRecord.setCreateTime(formatter.format(new Date()));
    dao.saveUserRecord(userRecord);

    if (null != openId && !"".equals(openId)) {
      List<Object> userOlderList = getUserById(openId);
      if (null != userOlderList) {
        List<Object> list = userOlderList;
        if (list.size() > 0 && null != list.get(0)
            && list.get(0) instanceof Object[]) {
          Object[] listResult = (Object[]) list.get(0);
          User user = new User();
          user.setId(listResult[0].toString());
          user.setOpenId(listResult[1].toString());
          user.setAvatarUrl(listResult[2].toString());
          user.setCity(listResult[3].toString());
          user.setNickName(listResult[4].toString());
          user.setProvince(listResult[5].toString());
          user.setCreateTime(listResult[6].toString());
          user.setUpdateTime(formatter.format(new Date()));
          updateUser(user);
          logger.info("--------------update_user_success------------");
          return "更新成功";
        } else {
          User user = new User();
          user.setId(MobileUtils.getId());
          user.setOpenId(openId);
          user.setAvatarUrl(userInfo.getAvatarUrl());
          user.setCity(userInfo.getCity());
          user.setNickName(MobileUtils.filter(userInfo.getNickName()));
          user.setProvince(userInfo.getProvince());
          user.setCreateTime(formatter.format(new Date()));
          saveUser(user);
          logger.info("--------------save_user_success------------");
          return "保存成功";
        }
      }
    }
      return "保存失败";

  }
  /**
   * 关联用户
   * @param user
   */
  @Override
  public void updateUser(User user){
    dao.updateUser(user);
  }
  /**
   * 宿主用户
   * @param user
   */
  @Override
  public void updateUser(HostUser user){
    dao.updateHostUser(user);
  }
  /**
   * 宿主用户
   * @param user
   */
  @Override
  public void saveUser(HostUser user){
    dao.saveHostUser(user);
  }


  /**
   * 根据ID获取user
   * @param openId
   * @return
   */
  @Override
  public List<Object> getUserById(String openId) {


    List<Object> o = dao.getUserById(openId);
    if (o == null || o.size()==0) {
      return null;
    }
    return o;
  }
  /**
   * 根据ID获取ostUser
   * @param openId
   * @return
   */
  @Override
  public HostUser getHostUserById(String openId) {
    HostUser o = dao.getHostUserById(openId);

    return o;
  }
  /**
   * 获取所有用户信息
   * @return
   */
  @Override
  public Object getUsers() {
    List<User> userList = dao.getUsers();
    return  userList;
  }
  /**
   * 根据openid获取user
   * @return
   */
  @Override
  public User getUserByOpenId(String openId) {
    Object o = dao.getUserById(openId);
    if (o == null) {
      return null;
    }
    return (User)o;
  }

  @Override
  public String getOpenId(HttpServletRequest request) {

    JSONObject JsonObject = new JSONObject();
    try {
      String code = request.getParameter("code");
      String appid = request.getParameter("appid");
      String secret = request.getParameter("secret");
      logger.info(new StringBuilder().append("code======>").append(code).toString());
      logger.info(new StringBuilder().append("appid======>").append(appid).toString());
      logger.info(new StringBuilder().append("secret======>").append(secret).toString());
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
      oppid = new HttpRequestor().doGet(requestUrl);
      JSONObject oppidObj = JSONObject.fromObject(oppid);
      logger.info(new StringBuilder().append("oppidObj======>").append(oppidObj).toString());
      String openid = (String) oppidObj.get("openid");
      if (openid != null && !"".equals(openid)) {
        JsonObject.put("flag", true);
        JsonObject.put("openid", openid);
      } else {
        JsonObject.put("flag", false);
        JsonObject.put("openid", "");
        JsonObject.put("message", "获取openID失败！请重试！");
      }
      return JsonObject.toString();
    } catch (Exception e) {
      JsonObject.put("flag", false);
      JsonObject.put("message", "服务器异常");
      e.printStackTrace();
      return JsonObject.toString();
    }
  }

  @Override
  public String login(HttpServletRequest request) {
    String openId = request.getParameter("openId");
    User user = getUserByOpenId(openId);
    JSONObject JsonObject = new JSONObject();
    if (user!=null) {
      JsonObject.put("result", "该用户已关联！");
      JsonObject.put("success", "200");
      JsonObject.put("user", user);
    } else {
      JsonObject.put("result", "请关联用户！");
      JsonObject.put("success", "202");
    }
    return JsonObject.toString();
  }

  @Override
  public String saveHostUser(HttpServletRequest request, HttpServletResponse response) {
    String openId = request.getParameter("openId");
    String userInfos = request.getParameter("userInfo");
    String isOriginal = request.getParameter("isOriginal");
    String userPhone = request.getParameter("userPhone");
    String userWechat = request.getParameter("userWechat");
    Gson gson = new Gson();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 格式化到秒
    try {

      if (null != openId && !"".equals(openId)) {
        Object userOlderList = getHostUserById(openId);
        if (null != userOlderList) {
          List<Object> list = (List<Object>) userOlderList;
          if (list.size() > 0 && null != list.get(0)
              && list.get(0) instanceof Object[]) {
            Object[] listResult = (Object[]) list.get(0);
            HostUser user = new HostUser();
            user.setId(listResult[0].toString());
            user.setOpenId(listResult[1].toString());
            user.setAvatarUrl(listResult[2].toString());
            user.setCity(listResult[3].toString());
            user.setNickName(listResult[4].toString());
            user.setProvince(listResult[5].toString());
            user.setCreateTime(listResult[6].toString());
            user.setUserPhone(listResult[7].toString());
            user.setUserWechat(listResult[8].toString());
            user.setUpdateTime(formatter.format(new Date()));
            user.setIsOriginal(isOriginal);
            updateUser(user);
            logger.info("--------------update_user_success------------");
            return "更新成功";
          } else {
            UserInfo userInfo = gson.fromJson(userInfos,
                UserInfo.class);
            HostUser user = new HostUser();
            user.setId(MobileUtils.getId());
            user.setOpenId(openId);
            user.setAvatarUrl(userInfo.getAvatarUrl());
            user.setCity(userInfo.getCity());
            user.setNickName(MobileUtils.filter(userInfo.getNickName()));
            user.setProvince(userInfo.getProvince());
            user.setCreateTime(formatter.format(new Date()));
            user.setUserPhone(userPhone);
            user.setUserWechat(userWechat);
            user.setIsOriginal(isOriginal);
            saveUser(user);
            logger.info("--------------save_user_success------------");
            return "保存成功";
          }
        }
      } else {
        return "请重新授权小程序";
      }

    } catch (Exception e) {
      e.printStackTrace();
      return "保存失败";
    }
    return "保存成功";
  }

  @Override
  public String getHomeImages(HttpServletRequest request, HttpServletResponse response) {
    String openId = request.getParameter("openId");
    logger.info("openId======>" + openId);
    HostUser hostUser = getHostUserById(openId);
    if (null != hostUser) {
      // 已制作自己的小程序
      List<ImageHomeBean> hostUserImgs = mobileService.getHostUserImgs(openId);
      System.out.println("hostUserImgs:" + hostUserImgs);
      if (null != hostUserImgs && hostUserImgs.size() > 0) {
        return new Gson().toJson(hostUserImgs);
      }
    }

    return "";
  }


}
