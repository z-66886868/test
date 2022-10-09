package com.z.AbstractAndInterface;
/**
* @athor Fly
* @data 2022/10/8 16:46
* @Version 1.0
*/
public class PingPongStudent extends PingPong implements Study{

    public PingPongStudent() {
    }

    public PingPongStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

}
