package com.z.Sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @athor Fly
 * @data 2022/10/30 21:29
 * @Version 1.0
 * 归并排序
 */
public class RecursionSortTest {

    public static void main(String[] args) {

//        System.out.println(Sum(100));
//
//        System.out.println(Factorial(5));

//        int[] arr = {10,6,7,1,3,9,4,2};
        int[] arrs = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = random.nextInt();
        }
        long start = System.currentTimeMillis();
        mergeSort(arrs,0,arrs.length-1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

    }

    /**
     * 分解数组
     * @param array
     * @param left
     * @param right
     */
    public static void mergeSort(int array[],int left,int right) {
        if (left >= right) { // 此时right=传入进来的mid  0 >= 3 false 0 >= 1 false 0 >= 0 true
            return;
        }
        int mid = (left + right) >> 1; // mid = 3; mid = 1; mid = 0; mid = 5; mid = 4;
        mergeSort(array, left, mid); // left=0 mid=3 步入 left=0 mid=1 步入 left = 0 mid = 0 步入 left=4; mid=5; 步入 left=4;mid=4;
        mergeSort(array, mid + 1, right); // mid=0; left=0+1; right = 1; 步入 mid=1;left=1+1; right=3; 步入 mid=3; left=3+1; right=7; 步入 mid=4 left=4+1 right=5
        merge(array, left, mid, right);//合并
    }

    public static void merge(int[] array,int left,int mid,int right){
        int s1 = left;
        int s2 = mid+1;
        int [] res = new int[right-left+1];
        int i=0;
        while(s1 <= mid && right >=s2){
            /*if(array[s1] <= array[s2]){
                res[i++] = array[s1++];
            }else {
                res[i++] = array[s2++];
            }*/
            //res[i++]= array[s1] <= array[s2] ? array[s1++] :array[s2++];
            if (array[s1] <= array[s2]){
                res[i++] = array[s1++]; // res[i++] = array[s2++]; 升序
                res[i++] = array[s2++]; // res[i++] = array[s1++];
            }else {
                res[i++] = array[s2++]; // res[i++] = array[s1++]; 升序
                res[i++] = array[s1++]; // res[i++] = array[s2++];
            }
        }
//        while(s1 <= mid){
//            res[i++] = array[s1++];
//        }
//        while(s2 <= right){
//            res[i++] = array[s2++];
//        }
        System.arraycopy(res,0,array,left,res.length);
    }

}
