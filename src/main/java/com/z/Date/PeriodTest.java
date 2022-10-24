package com.z.Date;

import java.time.LocalDate;
import java.time.Period;

/**
 * @athor Fly
 * @data 2022/10/24 16:16
 * @Version 1.0
 */
public class PeriodTest {

    public static void main(String[] args) {
        //获取年月日
        LocalDate now = LocalDate.now();
        System.out.println(now);

        //自定义年月日
        LocalDate birthDate = LocalDate.of(2000, 1, 1);

        Period between = Period.between(birthDate, now);//now - birthDate

        System.out.println(between);
        System.out.print(between.getYears() + " "); // 年
        System.out.print(between.getMonths() + " "); // 月
        System.out.println(between.getDays()); // 日

        System.out.println(between.toTotalMonths()); //所有月

    }

}
