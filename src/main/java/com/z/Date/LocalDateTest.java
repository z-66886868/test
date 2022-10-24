package com.z.Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 * @athor Fly
 * @data 2022/10/19 17:19
 * @Version 1.0
 */
public class LocalDateTest {

    public static void main(String[] args) {
        //获取当前时间
        LocalDate now = LocalDate.now();
        System.out.println(now);

        //获取指定时间的日历对象
        LocalDate localDate = LocalDate.of(2023, 1, 1);
        System.out.println(localDate);

        System.out.println("=======================");

        //获取年
        System.out.println(localDate.getYear());

        //获取月
        //方式一：
        Month month = localDate.getMonth();
        System.out.println(month); //英文
        System.out.println(month.getValue()); //数字

        //方式二：
        int monthValue = localDate.getMonthValue();
        System.out.println("month：" + monthValue  );

        //获取日
        System.out.println("日"+now.getDayOfMonth());

        //获取一年的第几天
        System.out.println("天"+now.getDayOfYear());

        //获取星期
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek); //英文
        System.out.println(dayOfWeek.getValue()); //数字


    }

}
