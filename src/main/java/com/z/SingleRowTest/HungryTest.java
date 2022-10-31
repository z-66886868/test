package com.z.SingleRowTest;

/**
 * @athor Fly
 * @data 2022/10/31 11:51
 * @Version 1.0
 * 饿汉模式
 */
public class HungryTest {

    static HungryTest hungryTest = new HungryTest();  //静态只会被执行一次
    private HungryTest(){}
    public static HungryTest getInstance(){
        return hungryTest;
    }

}
