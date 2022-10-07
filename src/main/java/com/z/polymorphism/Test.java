package com.z.polymorphism;
/**
* @athor Fly
* @data 2022/10/7 22:32
* @Version 1.0
*/
public class Test {

    public static void main(String[] args) {
        Animal animal = new Cat("cc", 12);

        Person zs = new Person("张三", 20);

        zs.keepPet(animal,"骨头");


    }

}
