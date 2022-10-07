package com.z.ArrayList;

import com.z.pojo.Student;

import java.util.ArrayList;

/**
* @athor Fly
* @data 2022/10/6 21:31
* @Version 1.0
*/
public class arrayList2 {

    public static void main(String[] args) {

        // 创建集合
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student(1,"张三", 19);
        Student s2 = new Student(2,"李四", 20);
        Student s3 = new Student(3,"王五", 21);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            if (4 == list.get(i).getId()){
                System.out.println(i);
                return;
            }
        }

        System.out.println("-1");

    }

}
