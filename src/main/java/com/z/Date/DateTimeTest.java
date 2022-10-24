package com.z.Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @athor Fly
 * @data 2022/10/19 17:00
 * @Version 1.0
 */
public class DateTimeTest {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss EE a");

        System.out.println(zonedDateTime);
        System.out.println(dateTimeFormatter.format(zonedDateTime));


    }

}
