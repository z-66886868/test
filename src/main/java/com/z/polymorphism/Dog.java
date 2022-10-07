package com.z.polymorphism;
/**
* @athor Fly
* @data 2022/10/7 22:27
* @Version 1.0
*/
public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat(String something) {
        System.out.println(this.name+"::"+this.age+"岁狗正在吃:"+something);
    }
}
