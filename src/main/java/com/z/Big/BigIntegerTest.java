package com.z.Big;

import java.math.BigInteger;
import java.util.Random;

/**
 * @athor Fly
 * @data 2022/10/12 16:20
 * @Version 1.0
 */
public class BigIntegerTest {

    public static void main(String[] args) {
        //new BigInteger(int num,Random random)   获取一个0~2 num次方 -1 的 随机大整数
        Random random = new Random();
        System.out.println(new BigInteger(4, random));

        //new BigInteger(String str) 获取一个指定的大整数
        BigInteger bigInteger = new BigInteger("100");
        System.out.println(bigInteger);

        //new BigInteger(String str,int val) 将指定进制的数转换为大整数
        System.out.println(new BigInteger("111110", 2));

    }

}
