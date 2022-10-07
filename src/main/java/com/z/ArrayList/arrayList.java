package com.z.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
* @athor Fly
* @data 2022/10/6 21:09
* @Version 1.0
*/
public class arrayList {

    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> list = new ArrayList<String>();

        // 添加数据
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 删除数据
        list.remove("aaa");
        System.out.println(list);

        System.out.println(list.remove(1));

        // 修改元素
        list.set(0,"eee");
        System.out.println(list);

        // 查询元素
        System.out.println(list.get(0));

        // 获取长度
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {

        }

    }

}
