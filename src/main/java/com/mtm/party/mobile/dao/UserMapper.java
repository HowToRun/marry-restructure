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

import com.mtm.party.mobile.model.HostUser;
import com.mtm.party.mobile.model.User;
import com.mtm.party.mobile.model.UserRecord;
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


  void saveUser(User user);
  void saveUserRecord(UserRecord user);

  void updateUser(User user);

  void updateHostUser(HostUser user);

  void saveHostUser(HostUser user);

  List<Object> getUserById(@Param("openId") String openId);

  HostUser getHostUserById(@Param("openId")String openId);

  List<User> getUsers();
}
