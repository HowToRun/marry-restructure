/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MarryService
 * Author:   yihan.hu
 * Date:     2019/7/31 16:54
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.service;

import com.mtm.party.mobile.model.CommentDto;
import com.mtm.party.mobile.model.UserInfo;
import com.mtm.party.mobile.utils.R;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/7/31
 * @since 1.0.0
 */
public interface MarryService {
  R getOpenId(String appid, String secret, String code, String grantType);

  R saveUser(String openId, String userInfo);

  R getHomeImg(String openId);

  R getDetailImage(String openId, String id);

  R getPraise();

  R getComment();

  R doComment(CommentDto commentDto);

  R doPraise(String openId);

  R getMapInfo();

}
