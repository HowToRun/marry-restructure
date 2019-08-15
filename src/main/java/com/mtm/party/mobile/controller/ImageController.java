/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: ImageController
 * Author:   yihan.hu
 * Date:     2019/8/13 14:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.controller;

import com.mtm.party.mobile.model.ImgDetailEntity;
import com.mtm.party.mobile.service.ImgService;
import com.mtm.party.mobile.utils.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 功能简述 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/8/13
 * @since 1.0.0
 */
@RestController
@RequestMapping("/image")
public class ImageController {

  @Autowired
  ImgService imgService;

  @ApiOperation(value = "上传图片", notes = "")
  @RequestMapping(value = "/imgUpload",method = RequestMethod.POST)
  public R imgUpload(MultipartFile file,
                     @RequestParam(value = "flag",required = false) Integer flag,
                     @RequestParam(value = "bannerCode",required = false) String bannerCode){
    return imgService.imgUpload(file,flag,bannerCode);
  }
  @ApiOperation(value = "上传图片", notes = "")
  @RequestMapping(value = "/updateDesc",method = RequestMethod.POST)
  public R updateDesc(@RequestBody ImgDetailEntity imgDetailEntity){
    return imgService.updateDesc(imgDetailEntity);
  }

}
