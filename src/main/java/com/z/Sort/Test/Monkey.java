package com.z.Sort.Test;

/**
 * @athor Fly
 * @data 2022/11/1 16:13
 * @Version 1.0
 * 猴子吃桃问题
 */
public class Monkey {

    public static void main(String[] args) {
        System.out.println(eatMonkey(1,10));


    }

    public static int eatMonkey(int day,int endDay){
        if (day <= 0 || day > endDay) return -1;
        if (day == endDay) return 1;
        return (eatMonkey(day + 1,endDay) + 1)  * 2;
    }

}
