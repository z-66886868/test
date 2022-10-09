package com.z.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
* @athor Fly
* @data 2022/10/8 20:14
* @Version 1.0
*/
public class Test {

    public static void main(String[] args) {
//        Student student = new Student();
//        student.person("aaa");
//
//        new Student().new Person("aaa");
        Student 张三 = new Student(4, "张三", 18);
        Student 李四 = new Student(2, "李四", 18);

        Student 王五 = new Student(4, "王五", 18);
        Student 赵六 = new Student(2, "赵六", 18);
        Student 小明 = new Student(7, "a4", 18);

        List<Student> list1 = new ArrayList<>();
        list1.add(张三);
        list1.add(李四);
        List<Student> list2 = new ArrayList<>();
        list2.add(王五);
        list2.add(赵六);
        list2.add(小明);

        List<Student> collect = list1.stream().filter(a -> list2.stream().map(Student::getId).anyMatch(c -> Objects.equals(a.getId(), c))).collect(Collectors.toList());
        System.out.println(collect);

        //System.out.println(list1.stream().map(Student::getId).collect(Collectors.toList()));



    }

}
