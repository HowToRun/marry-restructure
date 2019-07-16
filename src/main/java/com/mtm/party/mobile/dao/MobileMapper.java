/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MobileMapper
 * Author:   yihan.hu
 * Date:     2019/7/3 13:02
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.dao;

import com.mtm.party.mobile.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/7/3
 * @since 1.0.0
 */
@Mapper
public interface MobileMapper {

  List listByNickName(@Param("nickImage") String nickImage);

  List listById(@Param("openId") String openId, @Param("userId") String userId);

  List getBlessUserByOpenId(@Param("openId")String openId);

  List getAllBlessUser(@Param("openId")String openId);

  List<BlessComment> getAllBlessComment(@Param("openId")String openId);

  void saveUser(BlessUser blessUser);

  void saveComment(BlessComment blessUser);

  List getUserImageById(@Param("id") String id);

  List getMapInfoByOpenId(@Param("id") String id);

  List getUserImageByName(@Param("imageName") String imageName);

  List getShareInfoByUserId(@Param("userId") String userId);

  List<ImageHomeBean> getHostUserImgs(@Param("openId")String openId);

  List getDetailImages(@Param("userId") String userId);

  List getDetailImagesById(@Param("id") String id);

  List getUserLogoByUserId(@Param("userId") String userId);

  List getDetailImagesByBannerId(@Param("bannerId") String bannerId);

  void saveImageHomeBean(ImageHomeBean bean);

  void updateImageHomeBean(ImageHomeBean bean);

  void saveMapInfo(MapInfo bean);

  void updateMapInfo(MapInfo bean);

  void saveShareInfo(ShareInfo bean);

  void updateShareInfo(ShareInfo bean);

  void saveDetailImages(DetailImages bean);

  void updateDetailImages(DetailImages bean);

  void saveUserLogo(UserLogo bean);

  void updateUserLogo(UserLogo bean);
}
