/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: BlessInfoDto
 * Author:   yihan.hu
 * Date:     2019/8/2 12:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.model;

/**
 * 功能简述 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/8/2
 * @since 1.0.0
 */
public class BlessInfoDto {
  private String blessUser;
  private String blessTo;
  private String createTime;
  private String avatarUrl;
  private String nickName;
  private String province;
  private String city;

  @Override
  public String toString() {
    return "BlessInfoDto{" +
        "blessUser='" + blessUser + '\'' +
        ", blessTo='" + blessTo + '\'' +
        ", createTime='" + createTime + '\'' +
        ", avatarUrl='" + avatarUrl + '\'' +
        ", nickName='" + nickName + '\'' +
        ", province='" + province + '\'' +
        ", city='" + city + '\'' +
        '}';
  }

  public String getBlessUser() {
    return blessUser;
  }

  public void setBlessUser(String blessUser) {
    this.blessUser = blessUser;
  }

  public String getBlessTo() {
    return blessTo;
  }

  public void setBlessTo(String blessTo) {
    this.blessTo = blessTo;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
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
}
