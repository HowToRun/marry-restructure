/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserService
 * Author:   yihan.hu
 * Date:     2019/7/2 14:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.service;

import com.mtm.party.mobile.model.HostUser;
import com.mtm.party.mobile.model.User;
import com.mtm.party.mobile.model.UserRecord;
import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/7/2
 * @since 1.0.0
 */
public interface UserService {


  /**
   * 保存用户
   * @param user
   */
  public void saveUser(User user);
  /**
   * 保存用户
   * @param userRecord
   */
  public String saveUserRecord(HttpServletRequest request, UserRecord userRecord);
  /**
   * 关联用户
   * @param user
   */
  public void updateUser(User user);
  /**
   * 宿主用户
   * @param user
   */
  public void updateUser(HostUser user);
  /**
   * 宿主用户
   * @param user
   */
  public void saveUser(HostUser user);


  /**
   * 根据ID获取user
   * @param openId
   * @return
   */
  public Object getUserById(String openId);
  /**
   * 根据ID获取ostUser
   * @param openId
   * @return
   */
  public HostUser getHostUserById(String openId);
  /**
   * 获取所有用户信息
   * @return
   */
  public Object getUsers();
  /**
   * 根据openid获取user
   * @return
   */
  public User getUserByOpenId(String openId);


  String getOpenId(HttpServletRequest request);

  String login(HttpServletRequest request);

  String saveHostUser(HttpServletRequest request, HttpServletResponse response);

  String getHomeImages(HttpServletRequest request, HttpServletResponse response);
}
