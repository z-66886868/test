package com.z.Stream.StreamTest;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @athor Fly
 * @data 2022/10/11 21:47
 * @Version 1.0
 */
public class StreamParallel {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //parallel() 并行流     .parallelStream()
        Integer reduce = integerStream.parallel()
                .peek(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer + " " + Thread.currentThread().getName());
                    }
                }).filter(num -> num > 5)
                .reduce((int1, int2) -> int1 + int2)
                .get();
        System.out.println(reduce);
    }

}
