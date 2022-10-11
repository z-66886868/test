package com.z.Stream.StreamTest;

import com.z.Stream.StreamTest.pojo.Author;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

/**
 * @athor Fly
 * @data 2022/10/11 16:15
 * @Version 1.0
 */
public class reduceTest {

    public static void main(String[] args) {
        List<Author> authors = StreamDemo1.getAuthors();
        //求和
//        System.out.println(authors.stream()
//                .map(Author::getAge)
//                .reduce(0, (age1, age2) -> age1 + age2));

        //最大年龄
        System.out.println(authors.stream()
                .map(Author::getAge)
                .reduce(Integer.MIN_VALUE, (age1, age2) -> age1 < age2 ? age2 : age1));
                                                    //min < 33  33 < 56 56
        //最小年龄
        System.out.println(authors.stream()
                .map(Author::getAge)
                .reduce(Integer.MAX_VALUE, (age1, age2) -> age1 < age2 ? age1 : age2));
                                                    // max < 33 33 < 56 33 < 54

        //最大年龄
        Optional<Integer> maxAge = authors.stream()
                .map(Author::getAge)
                .reduce((integer, integer2) -> integer > integer2 ? integer : integer2);
        maxAge.ifPresent(age -> System.out.println(age));

        //最小年龄
        Optional<Integer> minAge = authors.stream()
                .map(Author::getAge)
                .reduce((integer, integer2) -> integer > integer2 ? integer2 : integer);
        minAge.ifPresent(age -> System.out.println(age));

    }

}
