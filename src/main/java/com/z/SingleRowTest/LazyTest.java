package com.z.SingleRowTest;

/**
 * @athor Fly
 * @data 2022/10/31 12:04
 * @Version 1.0
 * 懒汉模式
 */
public class LazyTest {

    private static LazyTest lazyTest = null;
    private LazyTest(){}
    static LazyTest getInstance(){
        if (lazyTest == null){
            return lazyTest = new LazyTest();
        }
        return lazyTest;
    }

}
