package com.z;

/**
 * @athor Fly
 * @data 2022/10/12 21:38
 * @Version 1.0
 */
public class MatchesTest {

    public static void main(String[] args) {
        //正则表达式
        String phone = "13297091418";
        System.out.println(phone.matches("1[3-9]\\d{9}"));

        String phone2 = "027-61592186";
        System.out.println(phone2.matches("0\\d{2,3}-?[1-9]\\d{4,10}"));

        String a = "^[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0\\d|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";

        System.out.println("420116200306180413".matches(a));

    }

}
