/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: CommentDto
 * Author:   yihan.hu
 * Date:     2019/8/2 12:57
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
public class CommentDto {
  private String userOpenId;
  private String comment;
  private String createTime;
  private String nickName;
  private String province;
  private String avatarUrl;

  @Override
  public String toString() {
    return "CommentDto{" +
        "userOpenId='" + userOpenId + '\'' +
        ", comment='" + comment + '\'' +
        ", createTime='" + createTime + '\'' +
        ", nickName='" + nickName + '\'' +
        ", province='" + province + '\'' +
        ", avatarUrl='" + avatarUrl + '\'' +
        '}';
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public String getUserOpenId() {
    return userOpenId;
  }

  public void setUserOpenId(String userOpenId) {
    this.userOpenId = userOpenId;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
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
}
