package com.z.Stream.lambdaTest;

import com.z.interfaceTest.Inter;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/**
 * @athor Fly
 * @data 2022/10/9 22:02
 * @Version 1.0
 */
public class LambdaDemo1 {

    public static void main(String[] args) {
        //匿名内部类
        /*
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程开始执行");
            }
        }).start();
        */

        //lambda表达式
        /*
        new Thread(()->{
            System.out.println("线程开始执行");
        }).start();
        */

        //匿名内部类
        calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left+right;
            }
        });

        //lambda表达式
//        calculateNum((int a,int b)->{
//            return a+b;
//        });

        //匿名内部类
//        printNum(new IntPredicate() {
//            @Override
//            public boolean test(int value) {
//                return value%2==0;
//            }
//        });

        //lambda表达式
//        printNum((value)->{
//            return value % 2 == 0;
//        });

        //匿名内部类
//        typeConver(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.valueOf(s);
//            }
//        });

        //lambda表达式
//        Integer integer = typeConver((String s) -> {
//            return Integer.valueOf(s);
//        });
//        System.out.println(integer);

        //匿名内部类
//        foreachArr(new IntConsumer() {
//            @Override
//            public void accept(int value) {
//                System.out.println(value);
//            }
//        });

        //lambda表达式
//        foreachArr((int i)->{
//            System.out.println(i);
//        });

        //lambda表达式省略
        foreachArr(i -> System.out.println(i));

    }

    public static int calculateNum(IntBinaryOperator operator){
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a,b);
    }

    public static void printNum(IntPredicate predicate){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i : arr){
            if (predicate.test(i)){
                System.out.println(i);
            }
        }
    }

    public static <R> R typeConver(Function<String,R> function){
        String str = "1235";
        R result = function.apply(str);
        return result;
    }

    public static void foreachArr(IntConsumer consumer){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i : arr){
            consumer.accept(i);
        };
    }

}
