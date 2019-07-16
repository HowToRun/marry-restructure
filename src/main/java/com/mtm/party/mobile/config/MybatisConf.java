/**
 * Copyright (C), 2015-2019, 百分点信息科技有限公司
 * FileName: MybatiaConf
 * Author:   yihan.hu
 * Date:     2019/1/15 17:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 功能简述 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/1/15
 * @since 1.0.0
 */
@Configuration
public class MybatisConf {
  @Bean
  public PageHelper pageHelper() {
    PageHelper pageHelper = new PageHelper();
    Properties p = new Properties();
    p.setProperty("offsetAsPageNum", "true");
    p.setProperty("rowBoundsWithCount", "true");
    p.setProperty("reasonable", "true");
    pageHelper.setProperties(p);
    return pageHelper;
  }
}