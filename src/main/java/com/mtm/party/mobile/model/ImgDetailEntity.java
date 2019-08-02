/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: ImgDetailEntity
 * Author:   yihan.hu
 * Date:     2019/8/2 10:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.model;

import java.sql.Timestamp;

/**
 * 功能简述 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/8/2
 * @since 1.0.0
 */
public class ImgDetailEntity {
  private Integer id;
  private String code;
  private String imgUrl;
  private String userOpenId;
  private String bannerCode;
  private String desc;
  private Timestamp createTime;
  private Timestamp updateTime;

  @Override
  public String toString() {
    return "ImgDetailEntity{" +
        "id=" + id +
        ", code='" + code + '\'' +
        ", imgUrl='" + imgUrl + '\'' +
        ", userOpenId='" + userOpenId + '\'' +
        ", bannerCode='" + bannerCode + '\'' +
        ", desc='" + desc + '\'' +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public String getUserOpenId() {
    return userOpenId;
  }

  public void setUserOpenId(String userOpenId) {
    this.userOpenId = userOpenId;
  }

  public String getBannerCode() {
    return bannerCode;
  }

  public void setBannerCode(String bannerCode) {
    this.bannerCode = bannerCode;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
  }
}
