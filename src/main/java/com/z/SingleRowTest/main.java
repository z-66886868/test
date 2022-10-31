package com.z.SingleRowTest;

/**
 * @athor Fly
 * @data 2022/10/31 11:51
 * @Version 1.0
 */
public class main {

    public static void main(String[] args) {
        HungryTest instance1 = HungryTest.getInstance();
        HungryTest instance2 = HungryTest.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);

        System.out.println(instance1==instance2);

        LazyTest lazyTest1 = LazyTest.getInstance();
        LazyTest lazyTest2 = LazyTest.getInstance();

        System.out.println(lazyTest1);
        System.out.println(lazyTest2);
        System.out.println(lazyTest1==lazyTest2);

    }

}
