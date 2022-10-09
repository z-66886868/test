package com.z.abstractTest;
/**
* @athor Fly
* @data 2022/10/8 13:50
* @Version 1.0
*/
public class dog extends Animal{
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }
}
