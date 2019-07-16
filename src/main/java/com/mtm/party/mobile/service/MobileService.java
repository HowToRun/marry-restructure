/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MobileService
 * Author:   yihan.hu
 * Date:     2019/7/2 13:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.service;

import com.mtm.party.mobile.model.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/7/2
 * @since 1.0.0
 */
public interface MobileService {


  public List getBlessUserByNickImage(String nickImage);

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
  public List getBlessUserByOpenId(String openId,String userId);
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
  public List getBlessUserByOpenId(String openId);
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
  public List<BlessUser> getAllBlessUser(String openId);
  public List<BlessUser> getAllBlessUser();

  public List<BlessComment> getAllBlessComment(String openId);
  public List<BlessComment> getAllBlessComment();

  public void save(BlessUser blessUser);

  public void save(BlessComment blessUser);


  //------------------------------- 用户模块 --------------------------------
  /**
   * 获取用户图片
   * @param id
   * @return
   */
  public List getUserImageById(String id);
  /**
   * 获取地图信息
   * @param id
   * @return
   */
  public List getMapInfoByOpenId(String id);
  /**
   * 获取用户图片
   * @param  imageName
   * @return
   */
  public List getUserImageByName(String imageName);
  /**
   * 获取用户图片
   * @param userId
   * @return
   */
  public List getShareInfoByUserId(String userId);
  /**
   * 根据openid获取imgs
   * @param openId
   * @return
   */
  public List<ImageHomeBean> getHostUserImgs(String openId);

  /**
   * 根据userId获取imgs
   * @param userId
   * @return
   */
  public List<DetailImages> getDetailImages(String userId);

  /**
   * 根据id获取imgs
   * @param id
   * @return
   */
  public List<DetailImages> getDetailImagesById(String id);
  /**
   * 根据id获取imgs
   * @param userId
   * @return
   */
  public List<UserLogo> getUserLogoByUserId(String userId);
  /**
   * 根据bannerId获取imgs
   * @param bannerId
   * @return
   */
  public List<DetailImages> getDetailImagesByBannerId(String bannerId);
  /**
   * 保存用户图片
   * @param bean
   */
  public void save(ImageHomeBean bean);

  /**
   * 更新用户图片
   * @param bean
   */
  public void update(ImageHomeBean bean);
  /**
   * 保地圖图片
   * @param bean
   */
  public void save(MapInfo bean);
  /**
   * 更新地图图片
   * @param bean
   */
  public void update(MapInfo bean);
  /**
   * 保存分享图片
   * @param bean
   */
  public void save(ShareInfo bean);

  /**
   * 更新分享图片
   * @param bean
   */
  public void update(ShareInfo bean);


  public void save(DetailImages bean);


  public void update(DetailImages bean);

  public void save(UserLogo bean);


  public void update(UserLogo bean);

  String getImages(HttpServletRequest request, HttpServletResponse response);

  String getPraiseList(HttpServletRequest request, HttpServletResponse response);

  String savePraise(HttpServletRequest request, HttpServletResponse response);

  String saveComment(HttpServletRequest request, HttpServletResponse response);

  String getCommentList(HttpServletRequest request, HttpServletResponse response);

  String saveHomeImage(HttpServletRequest request, HttpServletResponse response);

  String copyFile(HttpServletRequest request, HttpServletResponse response);
  String copyFile(HttpServletRequest request, String openId);

  String saveMapInfo(HttpServletRequest request, HttpServletResponse response);

  String getMapInfo(HttpServletRequest request, HttpServletResponse response);

  String saveShareInfo(HttpServletRequest request, HttpServletResponse response);

  String saveDetailImages(HttpServletRequest request, HttpServletResponse response);

  String saveImageLogo(HttpServletRequest request, HttpServletResponse response);
}
