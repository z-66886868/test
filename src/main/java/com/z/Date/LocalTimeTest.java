package com.z.Date;

import java.time.LocalTime;

/**
 * @athor Fly
 * @data 2022/10/24 16:09
 * @Version 1.0
 */
public class LocalTimeTest {

    public static void main(String[] args) {
        //获取本地时间的日历对象 包括时分秒
        LocalTime now = LocalTime.now();
        System.out.println(now);

        //获取时
        System.out.println(now.getHour());

        //获取分
        System.out.println(now.getMinute());

        //获取秒
        System.out.println(now.getSecond());

        //获取纳秒
        System.out.println(now.getNano());

    }

}
