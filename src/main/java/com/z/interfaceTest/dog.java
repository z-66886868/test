package com.z.interfaceTest;

/**
* @athor Fly
* @data 2022/10/8 13:50
* @Version 1.0
*/
public class dog extends Animal implements swimInterface {
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗在游泳");
    }
}
