package com.z.Sort;

import java.util.Random;

/**
 * @athor Fly
 * @data 2022/10/29 17:42
 * @Version 1.0
 * 冒泡排序
 */
public class BubbleTest {

    public static void main(String[] args) {

        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }

        int tmp;

//        for (int i = arr.length; i > 0; i--) { // 5 4 3 2 1
//            for (int j = 0; j < i-1; j++) { // 5-1 4 4-1 3
//                if (arr[j] > arr[j+1]){
//                    tmp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);



//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


    }

}
