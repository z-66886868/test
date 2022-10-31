package com.z.Sort;

import java.util.Random;

/**
 * @athor Fly
 * @data 2022/10/31 21:35
 * @Version 1.0
 */
public class FastTest {

    public static void main(String[] args) {

        int[] arr = {5,2,9,4,2,6,7,1,3};

//        Random random = new Random();
//        int[] arrs = new int[1000000];
//
//        for (int i = 0; i < arrs.length; i++) {
//            arrs[i] = random.nextInt();
//        }

        quickSort(arr,0,arr.length-1);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void quickSort(int[] arr,int i,int j){

        int start = i;
        int end = j;
        int temp;

        if (start > end){
            return;
        }

        int baseNumber = arr[i];

        while (start != end){
            while (true){
                if (end <= start || arr[end] < baseNumber) break; //arr[end] > baseNumber 升序
                end--;
            }
            while (true){
                if (end <= start || arr[start] > baseNumber) break; //arr[start] < baseNumber 升序
                start++;
            }
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }

        temp = arr[start];
        arr[start] = baseNumber;
        arr[i] = temp;

        quickSort(arr,i,end-1);
        quickSort(arr,start+1,j);

    }

}
