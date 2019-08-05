/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: MapInfoEntity
 * Author:   yihan.hu
 * Date:     2019/8/5 15:18
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
 * @create 2019/8/5
 * @since 1.0.0
 */
public class MapInfoEntity {

  private Integer id;
  private String nameTitle;
  private String solarCalendar;
  private String lunarCalendar;
  private String address;
  private String longitude;
  private String latitude;
  private String bgImgUrl;
  private int del;

  @Override
  public String toString() {
    return "MapInfoEntity{" +
        "id=" + id +
        ", nameTitle='" + nameTitle + '\'' +
        ", solarCalendar='" + solarCalendar + '\'' +
        ", lunarCalendar='" + lunarCalendar + '\'' +
        ", address='" + address + '\'' +
        ", longitude='" + longitude + '\'' +
        ", latitude='" + latitude + '\'' +
        ", bgImgUrl='" + bgImgUrl + '\'' +
        ", del=" + del +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNameTitle() {
    return nameTitle;
  }

  public void setNameTitle(String nameTitle) {
    this.nameTitle = nameTitle;
  }

  public String getSolarCalendar() {
    return solarCalendar;
  }

  public void setSolarCalendar(String solarCalendar) {
    this.solarCalendar = solarCalendar;
  }

  public String getLunarCalendar() {
    return lunarCalendar;
  }

  public void setLunarCalendar(String lunarCalendar) {
    this.lunarCalendar = lunarCalendar;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getBgImgUrl() {
    return bgImgUrl;
  }

  public void setBgImgUrl(String bgImgUrl) {
    this.bgImgUrl = bgImgUrl;
  }

  public int getDel() {
    return del;
  }

  public void setDel(int del) {
    this.del = del;
  }
}
