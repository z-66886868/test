package com.z.String;

import java.util.Scanner;

public class stringBuilder {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        //添加元素
        stringBuilder.append("a");
        stringBuilder.append("b");
        stringBuilder.append("c");

        //元素反转
        stringBuilder.reverse();

        System.out.println(stringBuilder);


        //判断是否为反转字符串
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.next();
//
//        String s = new StringBuilder(next).reverse().toString();
//
//        if (s.equals(next)){
//            System.out.println("是反转字符串");
//        }else {
//            System.out.println("不是反转字符串");
//        }

        int[] nums = {1,2,3};
        String s1 = nums.toString();

        System.out.println(s1);

    }

}
