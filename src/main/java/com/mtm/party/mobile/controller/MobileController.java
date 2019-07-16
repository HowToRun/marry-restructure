package com.mtm.party.mobile.controller;

//import cn.mtm2000.common.util.ValidUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mtm.party.mobile.model.*;
import com.mtm.party.mobile.service.MobileService;
import com.mtm.party.mobile.util.HttpHeaderUtils;
import com.mtm.party.mobile.service.UserService;
import com.mtm.party.mobile.util.MobileUtils;
import com.mtm.party.util.FileUtils;
import com.mtm.party.util.HttpRequestor;
import com.mtm.party.util.StringUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 中文参数接收方式:URLDecoder.decode(request.getParameter("body"), "UTF-8");
 * <p>
 * 微信小程序对接
 */

@Controller
@RequestMapping("/party/mobile")
public class MobileController {
  protected static Logger logger = LoggerFactory.getLogger(MobileController.class);
  // 用户注册
  private final String SAVE_USER = "SAVE_USER";
  // 支付申请订单
  private final String GET_OPENID = "GET_OPENID";
  // 登录
  private final String LOGIN_IN = "LOGIN_IN";
  // 获取图片
  private final String GET_IMAGE = "GET_IMAGE";

  private final String SAVE_IMAGE_HOME = "SAVE_IMAGE_HOME";
  // 获取赞列表
  private final String GET_PRAISE = "GET_PRAISE";
  // 保存赞
  private final String SAVE_PRAISE = "SAVE_PRAISE";
  // 获取评论列表
  private final String GET_COMMENT = "GET_COMMENT";
  // 保存评论
  private final String SAVE_COMMENT = "SAVE_COMMENT";
  // 创建小程序的用户
  private final String SAVE_HOST_USER = "SAVE_HOST_USER";
  // COPY_FILE
  private final String COPY_FILE = "COPY_FILE";
  // GET_HOME_IMAGES
  private final String GET_HOME_IMAGES = "GET_HOME_IMAGES";
  // 保存地图页信息
  private final String SAVE_MAP_INFO = "SAVE_MAP_INFO";
  // GET_MAP_INFO
  private final String GET_MAP_INFO = "GET_MAP_INFO";
  // SAVE_SHARE_INFO
  private final String SAVE_SHARE_INFO = "SAVE_SHARE_INFO";
  // GET_SHARE_INFO
  private final String GET_SHARE_INFO = "GET_SHARE_INFO";
  // SAVE_DETAIL_IMAGES
  private final String SAVE_DETAIL_IMAGES = "SAVE_DETAIL_IMAGES";
  // GET_DETAIL_IMAGES
  private final String GET_DETAIL_IMAGES = "GET_DETAIL_IMAGES";
  // 获取宿主用户
  private final String GET_HOST_USER = "GET_HOST_USER";
  // SAVE_IMAGE_LOGO
  private final String SAVE_IMAGE_LOGO = "SAVE_IMAGE_LOGO";
  // GET_IMAGE_LOGO
  private final String GET_IMAGE_LOGO = "GET_IMAGE_LOGO";


  private JSONArray jsonArray = new JSONArray();
  @Resource
  private MobileService mobileService;
  @Autowired
  private UserService userService;

  /**
   * 接口方法总入口
   *
   * @return
   * @throws Exception
   * @author wangpeng
   */
  // http://localhost:8080/party//mobile/mobileIn.do
  // http://localhost:8080/party/wechat/image/arrow_chart.png
  @RequestMapping("/mobileIn")
  public String mobileIn(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {
    response.setContentType("application/json; charset=UTF-8");
    HttpHeaderInfoBean headerInfoBean = HttpHeaderUtils
        .getHeaderInfos(request);
    String method = headerInfoBean.getMethod();
    String json = "";
    logger.info(new StringBuilder().append("method======>").append(method).toString());
    logger.info(new StringBuilder().append("get=======>").append(response.getWriter()).toString());
    logger.info("json======>" + json);
    try {
      request.setCharacterEncoding("UTF-8");
      if (SAVE_USER.equals(method)) {
        // 用户注册接口
        json = saveUser(request, response);
      } else if (GET_OPENID.equals(method)) {
        // 获取openiD接口
        json = getOpenID(request, response);
      } else if (LOGIN_IN.equals(method)) {
        // 用户登录方法
        json = loginin(request, response);
      } else if (GET_IMAGE.equals(method)) {
        // 获取图片
        json = getImages(request, response);
      } else if (GET_PRAISE.equals(method)) {
        // 获取赞列表
        json = getPraiseList(request, response);
      } else if (SAVE_PRAISE.equals(method)) {
        // 点赞
        json = savePraise(request, response);
      } else if (SAVE_COMMENT.equals(method)) {
        // 保存评论
        json = saveComment(request, response);
      } else if (GET_COMMENT.equals(method)) {
        // 获取评论列表
        json = getCommentList(request, response);
      } else if (SAVE_IMAGE_HOME.equals(method)) {
        // 保存首页图片
        json = saveHomeImage(request, response);
      } else if (SAVE_HOST_USER.equals(method)) {
        // 创建小程序的用户
        json = saveHostUser(request, response);
      } else if (COPY_FILE.equals(method)) {
        json = copyFile(request, response);
      } else if (GET_HOME_IMAGES.equals(method)) {
        json = getHomeImages(request, response);
      } else if (SAVE_MAP_INFO.equals(method)) {
        // 保存地图页信息
        json = saveMapInfo(request, response);
      } else if (GET_MAP_INFO.equals(method)) {
        // 获取地图页信息
        json = getMapInfo(request, response);
      } else if (SAVE_SHARE_INFO.equals(method)) {
        // 保存分享图片
        json = saveShareInfo(request, response);
      } else if (GET_SHARE_INFO.equals(method)) {
        // 获取分享信息
        json = getShareInfo(request, response);
      } else if (SAVE_DETAIL_IMAGES.equals(method)) {
        // 保存图片详情
        json = saveDetailImages(request, response);
      } else if (GET_DETAIL_IMAGES.equals(method)) {
        // 获取图片详情
        json = getDetailImages(request, response);
      } else if (GET_HOST_USER.equals(method)) {
        // 获取宿主用户
        json = getHostUser(request, response);
      } else if (SAVE_IMAGE_LOGO.equals(method)) {
        // 保存用户头像
        json = saveImageLogo(request, response);
      } else if (GET_IMAGE_LOGO.equals(method)) {
        // 获取用户头像
        json = getImageLogo(request, response);
      } else {
        json = "yes";
      }

    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    try {
      logger.info("执行完毕");
      response.getWriter().write(json);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * 获取用户头像
   *
   * @param request
   * @param response
   * @return
   */
  private String getImageLogo(HttpServletRequest request,
                              HttpServletResponse response) {

    String userId = request.getParameter("userId");

    if (null != userId) {

      List<UserLogo> detailImages = mobileService.getUserLogoByUserId(userId);

      return new Gson().toJson(detailImages);

    }
    return "";
  }

  /**
   * 保存用户头像
   *
   * @param request
   * @param response
   * @return
   */
  private String saveImageLogo(HttpServletRequest request,
                               HttpServletResponse response) {
    return mobileService.saveImageLogo(request,response);
  }

  /**
   * 获取宿主用户
   *
   * @param request
   * @param response
   * @return
   */
  private String getHostUser(HttpServletRequest request,
                             HttpServletResponse response) {

    String openId = request.getParameter("openId");

    Object hostUserById = userService.getHostUserById(openId);

    if (null != hostUserById) {
      return new Gson().toJson(hostUserById);
    }

    return "";
  }

  /**
   * 获取图片详情
   *
   * @param request
   * @param response
   * @return
   */
  private String getDetailImages(HttpServletRequest request,
                                 HttpServletResponse response) {

    String bannerId = request.getParameter("bannerId");

    List<DetailImages> detailImages = mobileService
        .getDetailImagesByBannerId(bannerId);

    return new Gson().toJson(detailImages);
  }

  /**
   * 保存图片详情
   *
   * @param request
   * @param response
   * @return
   */
  private String saveDetailImages(HttpServletRequest request,
                                  HttpServletResponse response) {
    return mobileService.saveDetailImages(request,response);
  }

  /**
   * 获取分享信息
   *
   * @param request
   * @param response
   * @return
   */
  private String getShareInfo(HttpServletRequest request,
                              HttpServletResponse response) {

    String userId = request.getParameter("userId");

    List hostObj = mobileService.getShareInfoByUserId(userId);

    return new Gson().toJson(hostObj);

  }

  /**
   * 保存分享图片
   *
   * @param request
   * @param response
   * @return
   */
  private String saveShareInfo(HttpServletRequest request,
                               HttpServletResponse response) {
    return mobileService.saveShareInfo(request,response);
  }

  /**
   * 获取地图页信息
   *
   * @param request
   * @param response
   * @return
   */
  private String getMapInfo(HttpServletRequest request,
                            HttpServletResponse response) {

    return mobileService.getMapInfo(request,response);
  }

  /**
   * 保存地图页信息
   *
   * @param request
   * @param response
   * @return
   */
  private String saveMapInfo(HttpServletRequest request,
                             HttpServletResponse response) {
   return mobileService.saveMapInfo(request,response);
  }

  /**
   * 获取首页图片
   *
   * @param request
   * @param response
   * @return
   */
  private String getHomeImages(HttpServletRequest request,
                               HttpServletResponse response) {

    return userService.getHomeImages(request,response);
  }

  /**
   * 保存首页图片
   *
   * @param request
   * @param response
   * @return
   */
  private String saveHomeImage(HttpServletRequest request,
                               HttpServletResponse response) {
    return mobileService.saveHomeImage(request,response);
  }

  /**
   * 图片文件复制
   *
   * @param request
   * @param response
   * @return
   */
  public String copyFile(HttpServletRequest request,
                         HttpServletResponse response) {

    return mobileService.copyFile(request,response);

  }

  /**
   * 图片文件复制
   *
   * @param request
   * @return
   */
  public String copyFile(HttpServletRequest request, String openId) {

    return mobileService.copyFile(request,openId);

  }

  /**
   * 保存赞
   *
   * @param request
   * @param response
   * @return
   */
  private String savePraise(HttpServletRequest request,
                            HttpServletResponse response) {
    return mobileService.savePraise(request, response);
  }

  /**
   * 保存评论
   *
   * @param request
   * @param response
   * @return
   */
  private String saveComment(HttpServletRequest request,
                             HttpServletResponse response) {

    return mobileService.saveComment(request,response);
  }

  /**
   * 获取赞列表
   *
   * @param request
   * @param response
   * @return
   */
  private String getPraiseList(HttpServletRequest request,
                               HttpServletResponse response) {

    return mobileService.getPraiseList(request, response);

  }

  /**
   * 获取评论列表
   *
   * @param request
   * @param response
   * @return
   */
  private String getCommentList(HttpServletRequest request,
                                HttpServletResponse response) {

    return mobileService.getCommentList(request,response);
  }

  /**
   * 获取图片
   *
   * @param request
   * @param response
   * @return
   */
  public String getImages(HttpServletRequest request,
                          HttpServletResponse response) {

    return mobileService.getImages(request, response);
  }

  /**
   * 用户注册
   *
   * @return
   * @author wp
   */
  public String saveUser(HttpServletRequest request,
                         HttpServletResponse response) {
    try {
      // 用户操作记录
      UserRecord userRecord = new UserRecord();
      return userService.saveUserRecord(request, userRecord);
    } catch (Exception e) {
      e.printStackTrace();
      return "保存失败";
    }
  }

  /**
   * 保存创建自己小程序的用户
   *
   * @param request
   * @param response
   * @return
   */
  public String saveHostUser(HttpServletRequest request,
                             HttpServletResponse response) {

    return userService.saveHostUser(request,response);
  }

  /**
   * 用户登录
   *
   * @param request
   * @param response
   * @return
   */
  public String loginin(HttpServletRequest request,
                        HttpServletResponse response) {
    String resJson = userService.login(request);
    return resJson;
  }


  /**
   * 获取openid
   *
   * @param request
   * @param response
   * @return
   */
  protected String getOpenID(HttpServletRequest request,
                             HttpServletResponse response) {
    return userService.getOpenId(request);
  }



}
