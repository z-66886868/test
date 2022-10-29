package com.z.Sort;

/**
 * @athor Fly
 * @data 2022/10/29 18:11
 * @Version 1.0
 * 选择排序
 */
public class ChooseTest {

    public static void main(String[] args) {

        int[] arr = {3,1,4,2,5};
        int tmp;
        int sum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
                sum++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(sum);

    }

}
