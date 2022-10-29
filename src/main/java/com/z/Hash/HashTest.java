package com.z.Hash;

import javax.xml.crypto.Data;

/**
 * @athor Fly
 * @data 2022/10/28 21:01
 * @Version 1.0
 */
public class HashTest {

    public static void main(String[] args) {

        int[] source = {2,3,4,11,5,77,88,455,78,55,12,99,189,718};

        HashTable hashTable = new HashTable(source.length);

//        for(int i =0 ;i <source.length ;i++){
//            hashTable.add(source[i]);
//        }

        hashTable.add(4);
        hashTable.add(32);
        hashTable.add(88);


        //查询数据
        hashTable.search(88);

        //查找指定下标链表下的数据
        hashTable.searchAll(4);


    }

}
