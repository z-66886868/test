package com.z.Sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @athor Fly
 * @data 2022/10/31 22:17
 * @Version 1.0
 */
public class Array {

    public static void main(String[] args) {

        int[] arr = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }

}
