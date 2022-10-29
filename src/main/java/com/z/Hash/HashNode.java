package com.z.Hash;

/**
 * @athor Fly
 * @data 2022/10/28 20:43
 * @Version 1.0
 */
public class HashNode {

    Entry head;
    static int size;

    public void add(Entry entry){
        if (head == null){ //判断头部是否为空，为空则添加到头部
            head = entry;
            return;
        }
        Entry tmp = head;
        //尾插法
        while (tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = entry;
    }

    public Entry search(int value){
        if (head == null){
            return null;
        }

        Entry tmp = head;
        size = 0;
        while (tmp != null){
            if (tmp.value == value){
                return tmp;
            }
            tmp = tmp.next;
            size++;
        }

        return null;
    }

    public void searchAll(){
        if (head == null){
            System.out.println("空链表");
            return;
        }
        Entry tmp = head;
        while (tmp.next != null){
            System.out.print(tmp.value + "    ");
            tmp = tmp.next;
        }
        System.out.println(tmp.value);
    }

}
