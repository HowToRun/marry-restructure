/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ImgService
 * Author:   yihan.hu
 * Date:     2019/8/13 14:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mtm.party.mobile.service;

import com.mtm.party.mobile.model.ImgDetailEntity;
import com.mtm.party.mobile.utils.R;
import org.springframework.web.multipart.MultipartFile;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yihan.hu
 * @create 2019/8/13
 * @since 1.0.0
 */
public interface ImgService {
  R imgUpload(MultipartFile file, Integer flag, String bannerCode);

  R updateDesc(ImgDetailEntity imgDetailEntity);

}
