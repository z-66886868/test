package com.z.String;

import java.util.StringJoiner;

/**
* @athor Fly
* @data 2022/10/6 16:52
* @Version 1.0
*/
public class stringJoiner {

    public static void main(String[] args) {
        // 创建StringJoiner对象  StringJoiner(间隔符合，开始符号，结束符号);
        StringJoiner stringJoiner = new StringJoiner("-", "[", "]");

        // 添加元素
        stringJoiner.add("ajunit").add("b").add("c");

        // 元素长度
        int length = stringJoiner.length();

        // 打印
        System.out.println(stringJoiner);
        System.out.println(length);


    }

}
