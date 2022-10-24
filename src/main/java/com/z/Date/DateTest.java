package com.z.Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * @athor Fly
 * @data 2022/10/19 16:24
 * @Version 1.0
 */
public class DateTest {

    public static void main(String[] args) {
        //获取所有时区
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);

        //获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //根据指定的时区
        ZoneId of = ZoneId.of("Asia/Pontianak");
        System.out.println(of);

        //获取当前时间（标准时间）
//        Instant now = Instant.now();
//        System.out.println(now);

        //根据计算机时间原点（秒/毫秒/纳秒）获取Instant对象
        System.out.println(Instant.ofEpochMilli(0l));
        System.out.println(Instant.ofEpochSecond(1l));
        System.out.println(Instant.ofEpochSecond(1L,1000000000L));

        //根据时区获取时间
        System.out.println(Instant.now().atZone(ZoneId.of("Asia/Shanghai")));

        //判断
        Instant instant = Instant.ofEpochMilli(0L);
        Instant instant1 = Instant.ofEpochMilli(1000L);

        System.out.println(instant.isBefore(instant1));
        System.out.println(instant.isAfter(instant1));

        //减少时间
        Instant instant2 = Instant.ofEpochMilli(1000l);
        System.out.println(instant2.minusMillis(100l));

        //增加时间
        Instant instant3 = Instant.ofEpochMilli(1000l);
        System.out.println(instant3.plusMillis(100l));

        //年月日时分秒纳秒方式指定
        ZonedDateTime of1 = ZonedDateTime.of(2023, 10, 1, 11, 12, 12, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(of1);

        //通过Instant + 时区的方式获取时间对象
        Instant instant4 = Instant.ofEpochMilli(0l);
        ZoneId of2 = ZoneId.of("Asia/Shanghai");
        System.out.println(ZonedDateTime.ofInstant(instant4, of2));

        //withXXX修改时间
        ZonedDateTime zonedDateTime = of1.withYear(2022);
        System.out.println(zonedDateTime);

    }

}
