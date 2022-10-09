package com.z.interfaceTest;

/**
* @athor Fly
* @data 2022/10/8 13:50
* @Version 1.0
*/
public class sheep extends Animal {
    public sheep() {
    }

    public sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("羊在吃草");
    }
}
