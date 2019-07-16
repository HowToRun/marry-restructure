/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: MobileUtils
 * Author:   yihan.hu
 * Date:     2019/7/16 9:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 功能简述 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/7/16
 * @since 1.0.0
 */
public class MobileUtils {

  public static String filter(String content) {
    byte[] conbyte = content.getBytes();
    for (int i = 0; i < conbyte.length; i++) {
      if ((conbyte[i] & 0xF8) == 0xF0) {
        for (int j = 0; j < 4; j++) {
          conbyte[i + j] = 0x30;
        }
        i += 3;
      }
    }
    content = new String(conbyte);
    return content.replaceAll("0000", "");
  }


  /**
   * @描述 java生成流水号 14位时间戳 + 6位随机数
   * @作者 shaomy
   * @时间:2017-1-12 上午10:10:41
   * @参数:@return
   * @返回值：String
   */
  public static String getId() {
    String id = "";
    // 获取当前时间戳
    SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
    String temp = sf.format(new Date());
    // 获取6位随机数
    int random = (int) ((Math.random() + 1) * 100000);
    id = temp + random;
    return id;
  }

}


