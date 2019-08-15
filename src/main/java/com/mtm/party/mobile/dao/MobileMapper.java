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
import java.util.Map;

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

  List<HomeImgEntity> getHomeImg(String openId);

  List<ImgDetailEntity> getDetailImage(@Param("id") String id);

  List<BlessInfoDto> getblessInfo();

  List<CommentDto> getcomment();

  void doComment(CommentDto commentDto);

  void doPraise(String openId);

  int check(String openId);

  Map<String,String> getMapInfo();

  void saveHomeImg(HomeImgEntity homeImgEntity);

  void saveImgDetail(ImgDetailEntity imgDetailEntity);

  void updateDesc(ImgDetailEntity imgDetailEntity);
}
