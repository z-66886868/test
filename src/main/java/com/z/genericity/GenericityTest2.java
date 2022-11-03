package com.z.genericity;

import java.util.ArrayList;

/**
 * @athor Fly
 * @data 2022/11/3 10:29
 * @Version 1.0
 */
public class GenericityTest2 {

    public<E> void addAll(ArrayList<E> arrayList,E...e){
        for (E element : e) {
            arrayList.add(element);
        }
    }

}
