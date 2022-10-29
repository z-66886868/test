package com.z.Hash;

/**
 * @athor Fly
 * @data 2022/10/28 20:41
 * @Version 1.0
 */
public class Entry {

    int value; //值
    Entry next; //线性链表


    public Entry() {
    }

    public Entry(int value) {
        this.value = value;
        this.next = null;
    }

}
