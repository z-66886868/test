package com.z.Sort;

/**
 * @athor Fly
 * @data 2022/10/29 18:11
 * @Version 1.0
 * ιζ©ζεΊ
 */
public class ChooseTest {

    public static void main(String[] args) {

        int[] arr = {3,1,4,2,5};
        int tmp;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
