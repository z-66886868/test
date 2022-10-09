package com.z.abstractTest;
/**
* @athor Fly
* @data 2022/10/8 13:49
* @Version 1.0
*/
public class frog extends Animal{
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
}
