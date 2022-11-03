package com.z.genericity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * @athor Fly
 * @data 2022/11/3 10:21
 * @Version 1.0
 */
public class GenericityTest<E> {

    Object[] obj = new Object[10];
    int size;

    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
