package com.z.Date;

import java.time.LocalDateTime;

/**
 * @athor Fly
 * @data 2022/10/24 16:13
 * @Version 1.0
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {
        //获取时间对象，包括时分秒
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }

}
