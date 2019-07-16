package com.mtm.party.mobile.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.http.HttpStatus;

@ApiModel(value = "R")
public class R<T> {

  @ApiModelProperty(value = "状态", required = true)
  private String code;
  @ApiModelProperty(value = "主体")
  private T data;
  @ApiModelProperty(value = "信息")
  private String message;

  public R() {
  }

  ;

  public R(HttpStatus statusCode, T data, String message) {
    if(statusCode.value()==200){
      this.code = "000000";
    }
    else{
      this.code = String.valueOf(statusCode.value());
    }

    this.data = data;
    this.message = message;
  }

  public R(HttpStatus statusCode, String message) {
    this.code = String.valueOf(statusCode.value());
    this.message = message;
  }


  public R error(String message) {
    return this.error(null, message);
  }

  public R error(T data, String message) {
    return new R(HttpStatus.INTERNAL_SERVER_ERROR, data, message);
  }

  public R ok() {
    return this.ok(null, null);
  }

  public R ok(T data) {
    return this.ok(data, null);
  }

  public R ok(String message) {
    return this.ok(null, message);
  }

  public R ok(T data, String message) {
    return new R(HttpStatus.OK, data, message);
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
