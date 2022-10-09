package com.z.abstractTest;

/**
* @athor Fly
* @data 2022/10/8 13:51
* @Version 1.0
*/
public class Test {


    public static void main(String[] args) {
        dog d = new dog("张三", 20);

        System.out.println(d.getName()+","+d.getAge());
        d.drink();
        d.eat();

        new Thread(()->{

        });


    }

}
