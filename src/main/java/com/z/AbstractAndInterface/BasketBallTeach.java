package com.z.AbstractAndInterface;
/**
* @athor Fly
* @data 2022/10/8 16:49
* @Version 1.0
*/
public class BasketBallTeach extends BasketBall implements Teach{

    public BasketBallTeach() {
    }

    public BasketBallTeach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }

}
