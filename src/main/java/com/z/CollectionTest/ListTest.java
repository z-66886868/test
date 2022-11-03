package com.z.CollectionTest;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @athor Fly
 * @data 2022/11/2 16:01
 * @Version 1.0
 */
public class ListTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

//        Integer integer = Integer.valueOf(1);
//        list.remove(integer);
        list.remove(1);

        System.out.println(list);

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (3 == next){
                iterator.add(33);
            }
        }
        System.out.println(list);
    }

}
