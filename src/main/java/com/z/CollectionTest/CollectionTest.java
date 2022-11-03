package com.z.CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @athor Fly
 * @data 2022/11/2 11:01
 * @Version 1.0
 */
public class CollectionTest {

    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();


        // 添加元素
        coll.add("aaa");
        coll.add("ddd");
        coll.add("ccc");
        coll.add("aaa");
        System.out.println(coll);

        // 清空
        //coll.clear();

        // 删除
        // coll.remove("aaa"); //仅删除第一个
        //System.out.println(coll);
        Collection<String> remove = new ArrayList<>();
        remove.add("aaa");
        coll.removeAll(remove);
        System.out.println(coll);

        // 判断元素是否存在
        boolean result = coll.contains("aaa");
        System.out.println(result);

        // 判断集合是否为空
        System.out.println(coll.isEmpty());

        // 判断集合长度
        System.out.println(coll.size());

        //迭代器
        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        //增加for循环
        for (String s:coll) {
            System.out.print(s + "  ");
        }

        System.out.println();

        //foreach
        coll.forEach(s -> System.out.print(s + " "));

    }

}
