/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: UserEntity
 * Author:   yihan.hu
 * Date:     2019/8/1 10:52
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
 * @create 2019/8/1
 * @since 1.0.0
 */
public class UserEntity {
  private Integer id;
  private String openId;
  private String avatarUrl;
  private String nickName;
  private String province;
  private String city;
  private Timestamp createTime;
  private Timestamp updateTime;

  @Override
  public String toString() {
    return "UserEntity{" +
        "id=" + id +
        ", openId='" + openId + '\'' +
        ", avatarUrl='" + avatarUrl + '\'' +
        ", nickName='" + nickName + '\'' +
        ", province='" + province + '\'' +
        ", city='" + city + '\'' +
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

  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
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
