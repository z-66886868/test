package com.z.Date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @athor Fly
 * @data 2022/10/24 16:27
 * @Version 1.0
 */
public class ChronoUnitTest {

    public static void main(String[] args) {
        //获取当前时间对象
        LocalDateTime now = LocalDateTime.now();

        //自定义时间
        LocalDateTime birthDate = LocalDateTime.of(2000, 1, 1, 0, 0, 0);

        System.out.println(ChronoUnit.YEARS.between(birthDate, now)); //计算相差年数

    }

}
