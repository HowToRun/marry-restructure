package com.mtm.party.mobile.utils;

import com.alibaba.druid.util.StringUtils;

/**
 * @author: yihan.hu
 * <p>
 * create: 2019-01-03 11:54
 * @version: 1.0
 **/
public class TimeUtil {
    /**
     *
     * @param time 2018-12-30 22:33:88
     * @return   2018-12-30  或者 time
     */
    public static String getTime(String time) {
        if(!StringUtils.isEmpty(time)){
            String [] times = time.split(" ");
            if(2==times.length){
                time = times[0];
            }
        }
        return time;
    }
}
