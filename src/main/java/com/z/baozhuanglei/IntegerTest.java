package com.z.baozhuanglei;

/**
 * @athor Fly
 * @data 2022/10/24 17:14
 * @Version 1.0
 */
public class IntegerTest {

    public static void main(String[] args) {
        Integer i1 =  10;
        Integer i2 =  10;
        int i = i1 + i2;
        System.out.println(i);

        //进制转换
        System.out.println(Integer.toBinaryString(100)); //二进制
        System.out.println(Integer.toOctalString(100)); //八进制
        System.out.println(Integer.toHexString(100)); //十六进制

        int i3 = Integer.parseInt("123") + 100;
        System.out.println(i3);

    }

}
