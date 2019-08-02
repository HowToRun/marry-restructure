/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: UserRecordInfo
 * Author:   yihan.hu
 * Date:     2019/8/1 10:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.model;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * 功能简述 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/8/1
 * @since 1.0.0
 */
public class UserRecordInfo {
  private Integer id;
  private String userOpenId;
  private Timestamp createTime;

  @Override
  public String toString() {
    return "UserRecordInfo{" +
        "id=" + id +
        ", userOpenId='" + userOpenId + '\'' +
        ", createTime=" + createTime +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserOpenId() {
    return userOpenId;
  }

  public void setUserOpenId(String userOpenId) {
    this.userOpenId = userOpenId;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }
}
