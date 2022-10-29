package com.z.Hash;

/**
 * @athor Fly
 * @data 2022/10/28 20:54
 * @Version 1.0
 */
public class HashTable {

    HashNode[] nodeLists;
    int size;

    public HashTable(int size) {
        this.size = size;
        nodeLists = new HashNode[size];
        for (int i = 0; i < size; i++) {
            nodeLists[i] = new HashNode();

        }
    }

    public void add(int value) {
        Entry entry = new Entry(value);
        int hashIndex = hash(value);
        nodeLists[hashIndex].add(entry);
    }

    public void search(int value){
        int hashIndex = hash(value);
        Entry node = nodeLists[hashIndex].search(value);
        if (node != null){
            System.out.println("在第" + (hashIndex + 1) + "条链表中第" + HashNode.size + "数组中找到:" + value);
        }else{
            System.out.println("未找到数据");
        }
    }

    public void searchAll(int Index){
        nodeLists[Index].searchAll();
    }

    //散列函数（哈希函数）
    private int hash(int value) {
        return value % size;
    }

}
