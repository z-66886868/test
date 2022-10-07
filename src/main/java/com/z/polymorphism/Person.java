package com.z.polymorphism;
/**
* @athor Fly
* @data 2022/10/7 22:26
* @Version 1.0
*/
public class Person {

    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void keepPet(Animal animal,String something){
        if (animal instanceof Dog){
            System.out.print(age+"岁的饲养员"+name+"正在喂狗");
            animal.eat(something);
        }else{
            System.out.print(age+"岁的饲养员"+name+"正在喂猫");
            animal.eat(something);
        }

    }



}
