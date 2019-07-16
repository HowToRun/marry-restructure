package com.mtm.party.mobile.exception;

import org.springframework.http.HttpStatus;

/**
 *
 *  自定义异常
 *
 * @author: yihan.hu
 * <p>
 * create: 2019-01-02 13:49
 * @version: 1.0
 **/
public class RRException extends RuntimeException {
    private String msg;
    private HttpStatus statusCode = HttpStatus.INTERNAL_SERVER_ERROR;

    public RRException(String msg){
        super(msg);
        this.msg = msg;
    }
    public RRException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public RRException(String msg, HttpStatus statusCode) {
        super(msg);
        this.msg = msg;
        this.statusCode = statusCode;
    }

    public RRException(String msg, HttpStatus statusCode, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

}
