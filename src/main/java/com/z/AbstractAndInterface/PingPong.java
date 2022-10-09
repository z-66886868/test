package com.z.AbstractAndInterface;
/**
* @athor Fly
* @data 2022/10/8 16:55
* @Version 1.0
*/
public abstract class PingPong extends Person{

    public PingPong() {
    }

    public PingPong(String name, int age) {
        super(name, age);
    }

    public void English(){
        System.out.println("说英语");
    }

}
