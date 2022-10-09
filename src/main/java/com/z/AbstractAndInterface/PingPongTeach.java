package com.z.AbstractAndInterface;
/**
* @athor Fly
* @data 2022/10/8 16:45
* @Version 1.0
*/
public class PingPongTeach extends PingPong implements Teach {

    public PingPongTeach() {
    }

    public PingPongTeach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

}
