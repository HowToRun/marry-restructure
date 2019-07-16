/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: MobileServiceImpl
 * Author:   yihan.hu
 * Date:     2019/7/2 14:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.service.impl;

import com.google.gson.Gson;
import com.mtm.party.mobile.controller.MobileController;
import com.mtm.party.mobile.dao.MobileMapper;
import com.mtm.party.mobile.model.*;
import com.mtm.party.mobile.service.MobileService;
import com.mtm.party.mobile.util.MobileUtils;
import com.mtm.party.util.FileUtils;
import com.mtm.party.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
public class MobileServiceImpl implements MobileService {
  protected static Logger logger = LoggerFactory.getLogger(MobileServiceImpl.class);
  @Resource
  private MobileMapper dao;
  @Override
  public List getBlessUserByNickImage(String nickImage){
    List obj = dao.listByNickName(nickImage);
    if (null !=obj && obj.size()>0) {
      return obj;
    }else{
      return null;
    }
  }

/**
 * 功能描述: <br>
 * 〈〉
 *
 * @param openId
 * @param userId
 * @return:java.util.List
 * @since: 1.0.0
 * @Author:yihan.hu
 * @Date: 2019/7/3 13:14
 */
@Override
  public List getBlessUserByOpenId(String openId,String userId){
    List obj = dao.listById(openId,userId);
    if (null !=obj && obj.size()>0) {
      return obj;
    }else{
      return null;
    }
  }
  /**
   * 功能描述: <br>
   * 〈〉
   *
   * @param openId
   * @return:java.util.List
   * @since: 1.0.0
   * @Author:yihan.hu
   * @Date: 2019/7/3 13:18
   */
  @Override
  public List getBlessUserByOpenId(String openId){
    List obj = dao.getBlessUserByOpenId(openId);
    if (null !=obj && obj.size()>0) {
      return obj;
    }else{
      return null;
    }
  }
  /**
   * 功能描述: <br>
   * 〈〉
   *
   * @param openId
   * @return:java.util.List
   * @since: 1.0.0
   * @Author:yihan.hu
   * @Date: 2019/7/3 13:21
   */
  @Override
  public List<BlessUser> getAllBlessUser(String openId){
    List<BlessUser> list = dao.getAllBlessUser(openId);
    if (null !=list) {
      return list;
    }else{
      return null;
    }
  }
  @Override
  public List<BlessUser> getAllBlessUser(){
    List list = dao.getAllBlessUser(null);
    if (null !=list) {
      return list;
    }else{
      return null;
    }
  }
  @Override
  public List<BlessComment> getAllBlessComment(String openId){
    List<BlessComment> list = dao.getAllBlessComment(openId);
    if (null !=list) {
      return list;
    }else{
      return null;
    }
  }
  @Override
  public List<BlessComment> getAllBlessComment(){
    List<BlessComment> list = dao.getAllBlessComment(null);
    if (null !=list) {
      return list;
    }else{
      return null;
    }
  }
  @Override
  public void save(BlessUser blessUser) {
    dao.saveUser(blessUser);
  }
  @Override
  public void save(BlessComment blessUser) {
    dao.saveComment(blessUser);
  }


  //------------------------------- 用户模块 --------------------------------
  /**
   * 获取用户图片
   * @param id
   * @return
   */
  @Override
  public List getUserImageById(String id){
    List obj = dao.getUserImageById(id);
    if (null !=obj && obj.size()>0) {
      return obj;
    }else{
      return null;
    }
  }
  /**
   * 获取地图信息
   * @param id
   * @return
   */
  @Override
  public List getMapInfoByOpenId(String id){
    List obj = dao.getMapInfoByOpenId(id);
    if (null !=obj && obj.size()>0) {
      return obj;
    }else{
      return null;
    }
  }
  /**
   * 获取用户图片
   * @param  imageName
   * @return
   */
  @Override
  public List getUserImageByName(String imageName){
    List obj = dao.getUserImageByName(imageName);
    if (null !=obj && obj.size()>0) {
      return obj;
    }else{
      return null;
    }
  }
  /**
   * 获取用户图片
   * @param userId
   * @return
   */
  @Override
  public List getShareInfoByUserId(String userId){
    List obj = dao.getShareInfoByUserId(userId);
    if (null !=obj && obj.size()>0) {
      return obj;
    }else{
      return null;
    }
  }
  /**
   * 根据openid获取imgs
   * @param openId
   * @return
   */
  @Override
  public List<ImageHomeBean> getHostUserImgs(String openId){
    List<ImageHomeBean> list = dao.getHostUserImgs(openId);
    if (null !=list && list.size()>0) {

      return list;
    }else{
      return null;
    }
  }

  /**
   * 根据userId获取imgs
   * @param userId
   * @return
   */
  @Override
  public List<DetailImages> getDetailImages(String userId){
    List obj = dao.getDetailImages(userId);
    if (null !=obj && obj.size()>0) {
      List<DetailImages> list = new ArrayList<DetailImages>();
      for(int i=0;i<obj.size();i++){
        if (null!=obj.get(i)) {
          DetailImages iBean = new DetailImages();
          Object[] objects = (Object[])obj.get(i);
          iBean.setId(objects[0]+"");
          iBean.setCreateTime(objects[1]+"");
          iBean.setUpdateTime(objects[2]+"");
          iBean.setUserId(objects[3]+"");
          iBean.setBannerId(objects[4]+"");
          iBean.setDesc(objects[5]+"");
          iBean.setImgUrl(objects[6]+"");

          list.add(iBean);
        }
      }
      return list;
    }else{
      return null;
    }
  }

  /**
   * 根据id获取imgs
   * @param id
   * @return
   */
  @Override
  public List<DetailImages> getDetailImagesById(String id){
    List obj = dao.getDetailImagesById(id);
    if (null !=obj && obj.size()>0) {
      List<DetailImages> list = new ArrayList<DetailImages>();
      for(int i=0;i<obj.size();i++){
        if (null!=obj.get(i)) {
          DetailImages iBean = new DetailImages();
          Object[] objects = (Object[])obj.get(i);
          iBean.setId(objects[0]+"");
          iBean.setCreateTime(objects[1]+"");
          iBean.setUpdateTime(objects[2]+"");
          iBean.setUserId(objects[3]+"");
          iBean.setBannerId(objects[4]+"");
          iBean.setDesc(objects[5]+"");
          iBean.setImgUrl(objects[6]+"");

          list.add(iBean);
        }
      }
      return list;
    }else{
      return null;
    }
  }
  /**
   * 根据id获取imgs
   * @param userId
   * @return
   */
  @Override
  public List<UserLogo> getUserLogoByUserId(String userId){
    List obj = dao.getUserLogoByUserId(userId);
    if (null !=obj && obj.size()>0) {
      List<UserLogo> list = new ArrayList<UserLogo>();
      for(int i=0;i<obj.size();i++){
        if (null!=obj.get(i)) {
          UserLogo iBean = new UserLogo();
          Object[] objects = (Object[])obj.get(i);
          iBean.setId(objects[0]+"");
          iBean.setCreateTime(objects[2]+"");
          iBean.setUpdateTime(objects[3]+"");
          iBean.setUserId(objects[4]+"");
          iBean.setImgUrl(objects[1]+"");

          list.add(iBean);
        }
      }
      return list;
    }else{
      return null;
    }
  }
  /**
   * 根据bannerId获取imgs
   * @param bannerId
   * @return
   */
  @Override
  public List<DetailImages> getDetailImagesByBannerId(String bannerId){
    List obj = dao.getDetailImagesByBannerId(bannerId);
    if (null !=obj && obj.size()>0) {
      List<DetailImages> list = new ArrayList<DetailImages>();
      for(int i=0;i<obj.size();i++){
        if (null!=obj.get(i)) {
          DetailImages iBean = new DetailImages();
          Object[] objects = (Object[])obj.get(i);
          iBean.setId(objects[0]+"");
          iBean.setCreateTime(objects[2]+"");
          iBean.setUpdateTime(objects[3]+"");
          iBean.setUserId(objects[4]+"");
          iBean.setBannerId(objects[5]+"");
          iBean.setDesc(objects[6]+"");
          iBean.setImgUrl(objects[1]+"");

          list.add(iBean);
        }
      }
      return list;
    }else{
      return null;
    }
  }
  /**
   * 保存用户图片
   * @param bean
   */
  @Override
  public void save(ImageHomeBean bean) {
    dao.saveImageHomeBean(bean);
  }

  /**
   * 更新用户图片
   * @param bean
   */
  @Override
  public void update(ImageHomeBean bean) {
    dao.updateImageHomeBean(bean);
  }
  /**
   * 保地圖图片
   * @param bean
   */
  @Override
  public void save(MapInfo bean) {
    dao.saveMapInfo(bean);
  }

  /**
   * 更新地图图片
   * @param bean
   */
  @Override
  public void update(MapInfo bean) {
    dao.updateMapInfo(bean);
  }
  /**
   * 保存分享图片
   * @param bean
   */
  @Override
  public void save(ShareInfo bean) {
    dao.saveShareInfo(bean);
  }

  /**
   * 更新分享图片
   * @param bean
   */
  @Override
  public void update(ShareInfo bean) {
    dao.updateShareInfo(bean);
  }

  @Override
  public void save(DetailImages bean) {
    dao.saveDetailImages(bean);
  }

  @Override
  public void update(DetailImages bean) {
    dao.updateDetailImages(bean);
  }
  @Override
  public void save(UserLogo bean) {
    dao.saveUserLogo(bean);
  }


  @Override
  public void update(UserLogo bean) {
    dao.updateUserLogo(bean);
  }

  @Override
  public String getImages(HttpServletRequest request, HttpServletResponse response) {
    // banner detail
    String type = request.getParameter("homeType");
    String moduleId = request.getParameter("moduleId");

    List<ImageList> imageList = new ArrayList<ImageList>();
    String baseUrl = "";
    try {

      String path = "";
      if ("banner".equals(type)) {
        path = request.getSession().getServletContext().getRealPath(
            "/wechat")
            + "/marry/banner/";
        baseUrl = "https://pengmaster.com/party/wechat/marry/banner/";
      } else {
        path = request.getSession().getServletContext().getRealPath(
            "/wechat")
            + "/marry/" + moduleId + "/";
        baseUrl = "https://pengmaster.com/party/wechat" + "/marry/"
            + moduleId + "/";
      }
      System.out.println("path:" + path);
      File file = new File(path);
      File[] tempList = file.listFiles();
      if (null == tempList) {
        return "数据为空";
      }
      for (int i = 0; i < tempList.length; i++) {
        String name = tempList[i].getName();
        String orientation = "";
        File picture = new File(path + name);
        BufferedImage sourceImg = ImageIO.read(new FileInputStream(
            picture));
        if (sourceImg.getWidth() > sourceImg.getHeight()) {
          orientation = "horizontal";
        } else {
          orientation = "vertical";
        }
        String nameType = "";
        if (null != name) {
          nameType = name.substring(0, name.indexOf("."));
        }
        imageList.add(new ImageList(StringUtils.generateRefID(),
            baseUrl + name, nameType, orientation));
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    return new Gson().toJson(imageList);
  }

  @Override
  public String getPraiseList(HttpServletRequest request, HttpServletResponse response) {
    String userId = request.getParameter("userId");
    List<BlessUser> allBlessUser;
    try {
      if (null != userId) {
        allBlessUser = getAllBlessUser(userId);
      } else {
        allBlessUser = getAllBlessUser();
      }
      List<List<String>> blessData = new ArrayList<>();
      for (BlessUser bc : allBlessUser) {
        List<String> bless = new ArrayList<>();
        bless.add(bc.getId());
        bless.add(bc.getCreate_time());
        bless.add(bc.getOpen_id());
        bless.add(bc.getNick_image());
        bless.add(bc.getNick_name());
        bless.add(bc.getUser_id());
        blessData.add(bless);
      }


      return new Gson().toJson(blessData);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "";
  }

  @Override
  public String savePraise(HttpServletRequest request, HttpServletResponse response) {
    String nickName = request.getParameter("nickName");
    String nickImage = request.getParameter("nickImage");
    String openId = request.getParameter("openId");
    String hostUserId = request.getParameter("hostUserId");
    try {
      List obj = null;
      if (null != openId && !"".equals(openId)) {
        if (null != hostUserId && !"".equals(hostUserId)) {
          obj = getBlessUserByOpenId(openId, hostUserId);
        } else {
          obj = getBlessUserByOpenId(openId);
        }

      } else {
        if (null != nickImage && !"".equals(nickImage)) {
          obj = getBlessUserByNickImage(nickImage);
        } else {
          return "点赞失败";
        }

      }
      if (null != obj && obj.size() > 0) {
        return "你已经点过赞了";
      }
      BlessUser blessUser = new BlessUser();
      blessUser.setNick_image(nickImage + "");
      blessUser.setNick_name(MobileUtils.filter(nickName) + "");
      blessUser.setCreate_time(System.currentTimeMillis() + "");
      blessUser.setId(System.currentTimeMillis() + "");
      blessUser.setOpen_id(openId);
      blessUser.setUser_id(hostUserId);
      save(blessUser);
      return "点赞成功";
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "点赞失败";
  }

  @Override
  public String saveComment(HttpServletRequest request, HttpServletResponse response) {
    String nickName = request.getParameter("nickName");
    String nickImage = request.getParameter("nickImage");
    String comment = request.getParameter("comment");
    String time = request.getParameter("time");
    String openId = request.getParameter("openId");
    String hostUserId = request.getParameter("hostUserId");

    try {
      if (null != hostUserId && !"".equals(hostUserId)) {
        BlessComment blessComment = new BlessComment();
        blessComment.setNick_image(nickImage + "");
        blessComment.setNick_name(MobileUtils.filter(nickName) + "");
        blessComment.setComment(comment + "");
        blessComment.setOpen_id(openId + "");
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分");
        blessComment.setCreate_time(df.format(new Date()));
        blessComment.setId(System.currentTimeMillis() + "");
        blessComment.setUser_id(hostUserId);
        save(blessComment);
        return "评论成功";
      } else {
        return "评论失败";
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    return "评论失败";
  }

  @Override
  public String getCommentList(HttpServletRequest request, HttpServletResponse response) {
    String userId = request.getParameter("userId");
    List object;
    try {
      List<BlessComment> allBlessComment;
      if (org.apache.commons.lang.StringUtils.isNotEmpty(userId)) {
        allBlessComment = getAllBlessComment(userId);
      } else {
        allBlessComment = getAllBlessComment();
      }
      List<List<String>> commentData = new ArrayList<>();
      for (BlessComment bc : allBlessComment) {
        List<String> comment = new ArrayList<>();
        comment.add(bc.getId());
        comment.add(bc.getNick_name());
        comment.add(bc.getNick_image());
        comment.add(bc.getComment());
        comment.add(bc.getCreate_time());
        comment.add(bc.getOpen_id());
        comment.add(bc.getUser_id());
        commentData.add(comment);
      }

      return new Gson().toJson(commentData);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "";
  }

  @Override
  public String saveHomeImage(HttpServletRequest request, HttpServletResponse response) {
    MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;

    MultipartFile multipartFile = req.getFile("file");

    String userId = request.getParameter("userId");

    String id = request.getParameter("id");

    String title = request.getParameter("title");

    String host = request.getParameter("host");

    String imgPath = System.getProperty("catalina.home") + "/userImg/"
        + userId + "/";

    try {
      File file = new File(imgPath);

      if (!file.exists()) {

        file.mkdirs();
      }

      File fileImg = new File(imgPath, multipartFile
          .getOriginalFilename());

      ImageHomeBean imageHomeBean = new ImageHomeBean();
      imageHomeBean.setId(id);
      imageHomeBean.setImgUrl(host + "/userImg/" + userId + "/"
          + multipartFile.getOriginalFilename());
      imageHomeBean.setTitle(title);
      imageHomeBean.setUserId(userId);
      imageHomeBean.setImageName(multipartFile.getOriginalFilename());

      List userImage = getUserImageById(id);

      if (null == userImage) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分");
        imageHomeBean.setCreateTime(df.format(new Date()));
        save(imageHomeBean);
      } else {
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分");
        imageHomeBean.setUpdateTime(df.format(new Date()));
        update(imageHomeBean);
      }

      multipartFile.transferTo(fileImg);

      copyFile(request, userId);

      return "保存成功";

    } catch (IOException e) {
      e.printStackTrace();
      return "保存失败";
    } catch (IllegalStateException e) {
      e.printStackTrace();
      return "保存失败";
    }
  }

  @Override
  public String copyFile(HttpServletRequest request, HttpServletResponse response) {
    String openId = request.getParameter("openId");

    String copyNewPath = request.getSession().getServletContext()
        .getRealPath("/")
        + "/userImg/" + openId + "/";
    String dirPath = System.getProperty("catalina.home") + "/userImg/"
        + openId + "/";

    try {
      File file = new File(copyNewPath);
      File dir = new File(dirPath);
      if (!dir.exists()) {
        return "未创建";
      }
      if (!file.exists()) {
        FileUtils.copy(dirPath, copyNewPath);
      } else {
        return "已存在";
      }
    } catch (IOException e) {
      e.printStackTrace();
      return "复制失败";
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return "复制成功";
  }

  @Override
  public String copyFile(HttpServletRequest request, String openId) {
    String copyNewPath = request.getSession().getServletContext()
        .getRealPath("/")
        + "/userImg/" + openId + "/";
    String dirPath = System.getProperty("catalina.home") + "/userImg/"
        + openId + "/";

    try {
      FileUtils.copy(dirPath, copyNewPath);
    } catch (IOException e) {
      e.printStackTrace();
      return "复制失败";
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return "复制成功";
  }

  @Override
  public String saveMapInfo(HttpServletRequest request, HttpServletResponse response) {
    MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;

    MultipartFile multipartFile = req.getFile("file");

    String inviteName = request.getParameter("inviteName");

    String inviteDateOne = request.getParameter("inviteDateOne");

    String inviteDateTwo = request.getParameter("inviteDateTwo");

    String inviteAddress = request.getParameter("inviteAddress");

    String inviteLongitude = request.getParameter("inviteLongitude");

    String inviteLatitude = request.getParameter("inviteLatitude");

    String userId = request.getParameter("userId");

    String host = request.getParameter("host");

    String isOriginal = request.getParameter("isOriginal");

    String imgPath = System.getProperty("catalina.home") + "/userImg/"
        + userId + "/map/";

    try {
      File file = new File(imgPath);

      if (!file.exists()) {

        file.mkdirs();
      }

      File fileImg = new File(imgPath, multipartFile
          .getOriginalFilename());

      MapInfo hostUser = new MapInfo();

      List hostObj = getMapInfoByOpenId(userId);

      hostUser.setUserId(userId);
      hostUser.setInviteName(inviteName);
      hostUser.setInviteAddress(inviteAddress);
      hostUser.setInviteDateOne(inviteDateOne);
      hostUser.setInviteDateTwo(inviteDateTwo);
      hostUser.setInviteLatitude(inviteLatitude);
      hostUser.setInviteLongitude(inviteLongitude);

      SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分");

      hostUser.setIsOriginal(isOriginal);
      hostUser.setInviteBgUrl(host + "/userImg/" + userId + "/map/"
          + multipartFile.getOriginalFilename());

      if (null != hostObj) {
        Object[] objs = (Object[]) hostObj.get(0);
        hostUser.setId(objs[0] + "");
        hostUser.setUpdateTime(df.format(new Date()));
        update(hostUser);
      } else {
        hostUser.setId(MobileUtils.getId());
        hostUser.setCreateTime(df.format(new Date()));
        save(hostUser);
      }

      multipartFile.transferTo(fileImg);

      copyFile(request, userId);

      return "保存成功";

    } catch (IOException e) {
      e.printStackTrace();
      return "保存失败";
    } catch (IllegalStateException e) {
      e.printStackTrace();
      return "保存失败";
    }
  }

  @Override
  public String getMapInfo(HttpServletRequest request, HttpServletResponse response) {
    String userId = request.getParameter("userId");
    logger.info("GET_MAP_INFO===>userId===>" + userId);
    List hostObj = getMapInfoByOpenId(userId);
    logger.info("GET_MAP_INFO===>map info===>" + hostObj);

    return new Gson().toJson(hostObj);

  }

  @Override
  public String saveShareInfo(HttpServletRequest request, HttpServletResponse response) {
    MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;

    MultipartFile multipartFile = req.getFile("file");

    String userId = request.getParameter("userId");

    String host = request.getParameter("host");

    String imgPath = System.getProperty("catalina.home") + "/userImg/"
        + userId + "/share/";

    try {
      File file = new File(imgPath);

      if (!file.exists()) {

        file.mkdirs();
      }

      File fileImg = new File(imgPath, multipartFile
          .getOriginalFilename());

      ShareInfo shareBean = new ShareInfo();

      List hostObj = getShareInfoByUserId(userId);

      shareBean.setUserId(userId);

      SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分");

      shareBean.setImgUrl(host + "/userImg/" + userId + "/share/"
          + multipartFile.getOriginalFilename());

      if (null != hostObj) {
        Object[] objs = (Object[]) hostObj.get(0);
        shareBean.setId(objs[0] + "");
        shareBean.setCreateTime(objs[3] + "");
        shareBean.setUpdateTime(df.format(new Date()));
        update(shareBean);
      } else {
        shareBean.setId(MobileUtils.getId());
        shareBean.setCreateTime(df.format(new Date()));
        save(shareBean);
      }

      multipartFile.transferTo(fileImg);

      copyFile(request, userId);

      return "保存成功";

    } catch (IOException e) {
      e.printStackTrace();
      return "保存失败";
    } catch (IllegalStateException e) {
      e.printStackTrace();
      return "保存失败";
    }
  }

  @Override
  public String saveDetailImages(HttpServletRequest request, HttpServletResponse response) {
    MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;

    MultipartFile multipartFile = req.getFile("file");

    String userId = request.getParameter("userId");

    String host = request.getParameter("host");

    String bannerId = request.getParameter("bannerId");

    String id = request.getParameter("id");

    String desc = request.getParameter("desc");

    String imgPath = System.getProperty("catalina.home") + "/userImg/"
        + userId + "/detailImages/" + bannerId + "/";

    try {
      File file = new File(imgPath);

      if (!file.exists()) {

        file.mkdirs();
      }

      File fileImg = new File(imgPath, multipartFile
          .getOriginalFilename());

      List<DetailImages> detailImages = getDetailImagesById(id);

      SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分");

      if (null != detailImages) {
        DetailImages detailImages2 = detailImages.get(0);
        detailImages2.setUpdateTime(df.format(new Date()));
        update(detailImages2);
      } else {
        DetailImages detaImages = new DetailImages();
        detaImages.setId(id);
        detaImages.setImgUrl(host + "/userImg/" + userId
            + "/detailImages/" + bannerId + "/"
            + multipartFile.getOriginalFilename());
        detaImages.setUserId(userId);
        detaImages.setCreateTime(df.format(new Date()));
        detaImages.setBannerId(bannerId);
        detaImages.setDesc(desc);

        save(detaImages);
      }

      multipartFile.transferTo(fileImg);

      copyFile(request, userId);

      return "保存成功";

    } catch (IOException e) {
      e.printStackTrace();
      return "保存失败";
    } catch (IllegalStateException e) {
      e.printStackTrace();
      return "保存失败";
    }
  }

  @Override
  public String saveImageLogo(HttpServletRequest request, HttpServletResponse response) {
    MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;

    MultipartFile multipartFile = req.getFile("file");

    String userId = request.getParameter("userId");

    String host = request.getParameter("host");

    String id = request.getParameter("id");

    String imgPath = System.getProperty("catalina.home") + "/userImg/"
        + userId + "/logo/";

    try {
      File file = new File(imgPath);

      if (!file.exists()) {

        file.mkdirs();
      }

      File fileImg = new File(imgPath, multipartFile
          .getOriginalFilename());

      List<UserLogo> detailImages = getUserLogoByUserId(userId);

      SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分");

      if (null != detailImages) {
        UserLogo detailImages2 = detailImages.get(0);
        detailImages2.setId(detailImages2.getId());
        detailImages2.setImgUrl(host + "/userImg/" + userId + "/logo/"
            + multipartFile.getOriginalFilename());
        detailImages2.setUserId(detailImages2.getUserId());
        detailImages2.setUpdateTime(df.format(new Date()));
        update(detailImages2);
      } else {
        UserLogo detaImages = new UserLogo();
        detaImages.setId(id);
        detaImages.setImgUrl(host + "/userImg/" + userId + "/logo/"
            + multipartFile.getOriginalFilename());
        detaImages.setUserId(userId);
        detaImages.setCreateTime(df.format(new Date()));

        save(detaImages);
      }

      multipartFile.transferTo(fileImg);

      copyFile(request, userId);

      return "保存成功";

    } catch (IOException e) {
      e.printStackTrace();
      return "保存失败";
    } catch (IllegalStateException e) {
      e.printStackTrace();
      return "保存失败";
    }
  }


}
