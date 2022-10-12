package com.z.Big;

import java.math.BigDecimal;

/**
 * @athor Fly
 * @data 2022/10/12 17:01
 * @Version 1.0
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        //new BigDecimal(num) 会有不可预知的错误，所以不推荐使用
        //System.out.println(new BigDecimal(0.01));

        System.out.println(new BigDecimal("0.01"));

        System.out.println(BigDecimal.valueOf(0.01));

    }

}
