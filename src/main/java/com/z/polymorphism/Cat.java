package com.z.polymorphism;

/**
 * @athor Fly
 * @data 2022/10/7 22:29
 * @Version 1.0
 */
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat(String something) {
        System.out.println(this.name + "::" + this.age + "岁猫正在吃:" + something);
    }
}
