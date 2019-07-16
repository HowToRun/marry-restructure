/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: ParamUtils
 * Author:   yihan.hu
 * Date:     2019/1/10 16:16
 * Description: 处理post请求参数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.utils;

import com.mtm.party.mobile.exception.RRException;

import java.util.Map;

/**
 * 功能简述 
 * 〈处理post请求参数〉
 *
 * @author yihan.hu
 * @create 2019/1/10
 * @since 1.0.0
 */
public class ParamUtils {

  public static Integer getType(Integer type,Map<String, Object> params){
    if (type==null ){
      if (params.get("type")==null){
        throw new RRException("type is null !!!");
      }
      if (params.get("type").toString()!=null){
        type = Integer.parseInt(params.get("type").toString());
      }else {
        throw new RRException("type is null !!!");
      }
    }
    return type;
  }

}
