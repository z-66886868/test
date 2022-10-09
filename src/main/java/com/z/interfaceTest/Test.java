package com.z.interfaceTest;

import java.util.Scanner;

/**
 * @athor Fly
 * @data 2022/10/8 13:51
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {

//        dog d = new dog("张三", 20);
//
//        System.out.println(d.getName() + "," + d.getAge());
//        d.drink();
//        d.eat();
//        d.swim();

        //InterA.sh();

        Inter inter = new Inter();
        inter.show();

        inter(()->{
            System.out.println("aaa");
        });

    }

    public static void inter(InterA a ){
        a.show();
    }


}
