package com.mtm.party.mobile.exception;

import com.mtm.party.mobile.utils.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;


/**
 *
 * 异常统一处理器
 *
 * @author: yihan.hu@foxmail.com
 * <p>
 * create: 2019-01-02 13:49
 * @version: 1.0
 **/
@RestControllerAdvice
public class RRExceptionHandler {

  private Logger logger = LoggerFactory.getLogger(getClass());

  /**
   * 自定义异常
   */
  @ExceptionHandler(RRException.class)
  public R<String> handleRRException(RRException e) {

    return new R(e.getStatusCode(), e.getMsg());
  }

  @ExceptionHandler(DuplicateKeyException.class)
  public R handleDuplicateKeyException(DuplicateKeyException e) {
    logger.error(e.getMessage(), e);
    return new R().error("数据库中已存在该记录");
  }


  @ExceptionHandler(Exception.class)
  public R handleException(Exception e) {
    String message = null;
    if (e.getCause() instanceof SQLException)
    {
      message = analyzeSQLException((SQLException)e.getCause());

    }
    logger.error(e.getMessage(), e);
    return new R().error(message == null?e.getMessage():message);
  }

  private String analyzeSQLException(SQLException e)
  {
    String state = e.getSQLState();
    int errorCode = e.getErrorCode();
    if (errorCode == 1 && "08S01".equals(state))
    {
       return "列名不能重复";
    }
    return null;
  }

}
