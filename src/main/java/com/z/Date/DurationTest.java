package com.z.Date;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @athor Fly
 * @data 2022/10/24 16:21
 * @Version 1.0
 */
public class DurationTest {

    public static void main(String[] args) {
        //获取本地日期时间对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //自定义时间对象
        LocalDateTime birthDate = LocalDateTime.of(2000, 1, 1, 0, 00, 00);

        Duration between = Duration.between(birthDate, now);//第一个对象减第二个对象

        System.out.println(between.toDays()); //两个时间相差天数
        System.out.println(between.toHours()); //相差小时
        System.out.println(between.toMinutes()); //相差分钟
        System.out.println(between.toMillis()); //相差毫秒
        System.out.println(between.toNanos()); //相差纳秒

    }

}
