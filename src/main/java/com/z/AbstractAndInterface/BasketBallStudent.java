package com.z.AbstractAndInterface;
/**
* @athor Fly
* @data 2022/10/8 16:49
* @Version 1.0
*/
public class BasketBallStudent extends BasketBall implements Study{

    public BasketBallStudent() {
    }

    public BasketBallStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打篮球");
    }
}
