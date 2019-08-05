/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: MarryController
 * Author:   yihan.hu
 * Date:     2019/7/31 16:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.controller;

import com.mtm.party.mobile.model.CommentDto;
import com.mtm.party.mobile.model.UserInfo;
import com.mtm.party.mobile.service.MarryService;
import com.mtm.party.mobile.utils.R;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能简述 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/7/31
 * @since 1.0.0
 */
@RestController
@RequestMapping("/marry/")
public class MarryController {
  @Autowired
  MarryService marryService;

  @ApiOperation(value = "获取openId", notes = "")
  @ApiImplicitParams({
      @ApiImplicitParam( paramType = "query",dataType = "String", name = "appid"),
      @ApiImplicitParam( paramType = "query",dataType = "String", name = "secret"),
      @ApiImplicitParam( paramType = "query",dataType = "String", name = "code"),
      @ApiImplicitParam( paramType = "query",dataType = "String", name = "grantType")
  })
  @RequestMapping(value = "/getOpenId",method = RequestMethod.GET)
  public R getOpenId(String appid, String secret, String code, String grantType){
    return marryService.getOpenId(appid,secret,code,grantType);
  }
  @ApiOperation(value = "保存用户", notes = "")
  @ApiImplicitParams({
      @ApiImplicitParam( paramType = "query",dataType = "String", name = "openId"),
      @ApiImplicitParam( paramType = "query",dataType = "String", name = "userInfo"),
  })
  @RequestMapping(value = "/saveUser",method = RequestMethod.GET)
  public R saveUser(@RequestParam("openId") String openId, @RequestParam("userInfo") String userInfo){
    return marryService.saveUser(openId,userInfo);
  }
  @ApiOperation(value = "获取home页图片tab", notes = "")
  @ApiImplicitParams({
      @ApiImplicitParam( paramType = "query",dataType = "String", name = "openId")
  })
  @RequestMapping(value = "/getHomeImg",method = RequestMethod.GET)
  public R getHomeImg(@RequestParam("openId") String openId){
    return marryService.getHomeImg(openId);
  }
  @ApiOperation(value = "获取图片详情的数据", notes = "")
  @ApiImplicitParams({
      @ApiImplicitParam( paramType = "query",dataType = "String", name = "openId"),
      @ApiImplicitParam( paramType = "query",dataType = "String", name = "id")
  })
  @RequestMapping(value = "/getDetailImage",method = RequestMethod.GET)
  public R getDetailImage(@RequestParam("openId") String openId,@RequestParam("id")String id){
    return marryService.getDetailImage(openId,id);
  }
  @ApiOperation(value = "获取点赞详情的数据", notes = "")
  @RequestMapping(value = "/getPraise",method = RequestMethod.GET)
  public R getPraise(){
    return marryService.getPraise();
  }
  @ApiOperation(value = "获取评论详情的数据", notes = "")
  @RequestMapping(value = "/getComment",method = RequestMethod.GET)
  public R getComment(){
    return marryService.getComment();
  }
  @ApiOperation(value = "评论", notes = "")
  @RequestMapping(value = "/doComment",method = RequestMethod.POST)
  public R doComment(@RequestBody CommentDto commentDto){
    return marryService.doComment(commentDto);
  }
  @ApiOperation(value = "评论", notes = "")
  @RequestMapping(value = "/doPraise",method = RequestMethod.GET)
  public R doPraise(String openId){
    return marryService.doPraise(openId);
  }

  @ApiOperation(value = "获取地图信息", notes = "")
  @RequestMapping(value = "/getMapInfo",method = RequestMethod.GET)
  public R getMapInfo(){
    return marryService.getMapInfo();
  }

}
