/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserMapper
 * Author:   yihan.hu
 * Date:     2019/7/2 11:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.dao;

import com.mtm.party.mobile.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/7/2
 * @since 1.0.0
 */
@Mapper
public interface UserMapper {

  void saveRecord(UserRecordInfo userRecordInfo);

  UserEntity getUserByOpenId(String openId);

  void saveUserInfo(UserEntity user);

  void updateUserInfo(UserEntity user);
}
