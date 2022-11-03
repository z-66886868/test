package com.z.genericity;

import java.util.ArrayList;

/**
 * @athor Fly
 * @data 2022/11/3 10:27
 * @Version 1.0
 */
public class main {

    public static void main(String[] args) {
        GenericityTest<String> str = new GenericityTest<>();
        str.add("aaa");
        str.add("bbb");
        str.add("ccc");
        System.out.println(str.toString());
        System.out.println(str.get(1));

        GenericityTest2 genericityTest2 = new GenericityTest2();
        ArrayList<Integer> integers = new ArrayList<>();
        genericityTest2.addAll(integers,1,2,3,4,5);
        System.out.println(integers);

    }

}
