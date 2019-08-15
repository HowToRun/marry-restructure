/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: imgServiceImpl
 * Author:   yihan.hu
 * Date:     2019/8/13 14:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.service.impl;

import com.mtm.party.mobile.dao.MobileMapper;
import com.mtm.party.mobile.model.HomeImgEntity;
import com.mtm.party.mobile.model.ImgDetailEntity;
import com.mtm.party.mobile.service.ImgService;
import com.mtm.party.mobile.util.ImageUtils;
import com.mtm.party.mobile.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * 功能简述 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/8/13
 * @since 1.0.0
 */
@Service
public class imgServiceImpl implements ImgService {
  protected static Logger logger = LoggerFactory.getLogger(imgServiceImpl.class);
  @Resource
  MobileMapper mobileMapper;

  @Value("${service.imgUploadPath}")
  private String imgUploadPath;
  @Value("${service.imgNetPath}")
  private String imgNetPath;

  @Override
  public R imgUpload(MultipartFile file, Integer flag, String bannerCode) {
    long startTime = System.currentTimeMillis();
    logger.info("上传路径 target======>"+imgUploadPath);
    String fileRealPath = ImageUtils.imgUpload(file, imgUploadPath,imgNetPath);
    if ("上传失败".equals(fileRealPath)){
      return new R().error("上传失败");
    }
    // TODO: 2019/8/13 根据返回的网络路径存储信息
    HomeImgEntity homeImgEntity = new HomeImgEntity();
    ImgDetailEntity imgDetailEntity = new ImgDetailEntity();
    if (flag != null && flag ==0){
//      flag 不为空且为0时，说明该图片为图集第一张图，为图集封面
      homeImgEntity.setCode(UUID.randomUUID().toString());
      homeImgEntity.setImgUrl(fileRealPath);
      homeImgEntity.setTitle("点点滴滴");
      mobileMapper.saveHomeImg(homeImgEntity);
    }else{
//       其他情况下均是上传详情页面的图片
      imgDetailEntity.setBannerCode(bannerCode);
      imgDetailEntity.setCode(UUID.randomUUID().toString());
      imgDetailEntity.setImgUrl(fileRealPath);
      mobileMapper.saveImgDetail(imgDetailEntity);
    }
    logger.info("上传后的网络路径======>"+fileRealPath);
    long endTime = System.currentTimeMillis();
    logger.info("图片上传耗时======>"+(startTime-endTime)/1000+"秒");
    return new R().ok(
        homeImgEntity.getCode()==null?
            imgDetailEntity.getCode():
            homeImgEntity.getCode(),"上传成功");
  }

  @Override
  public R updateDesc(ImgDetailEntity imgDetailEntity) {
    mobileMapper.updateDesc(imgDetailEntity);
    return new R().ok("修改描述成功，刷新生效");
  }
}
