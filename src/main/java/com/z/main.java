package com.z;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        //数组冒泡排序
        /**
         int arr[] = {1,4,125,567,789,8,9,344};

         int temp = 0;

         for (int i = 0; i < arr.length-1; i++) {
         for (int j = 0; j < arr.length-1-i; j++) {
         if(arr[j+1] < arr[j]){
         temp = arr[j];
         arr[j] = arr[j+1];
         arr[j+1] = temp;
         }
         }
         System.out.println(Arrays.toString(arr));
         }
         */

        int i , index , k , n = 10 , temp;

        int a[] = {0,1,2,3,4,5,6,7,8,9};
        for (k = 0; k < n-1; k++) {
            index = k;
            for (i = k+1; i < n; i++) {
                if(a[i] > a[index]){index = i;}
            }
            temp = a[index];
            a[index] = a[k];
            a[k] = temp;
            System.out.println(Arrays.toString(a));
        }

        System.out.println("hello world");

    }

}
