package com.z.Sort;

/**
 * @athor Fly
 * @data 2022/10/29 18:27
 * @Version 1.0
 * 插入排序
 */
public class InterpositionTest {

    public static void main(String[] args) {

        int[] arr = {1,2,5,4,3,8,9,6,10,7};
        int index = -1;
        int tmp;
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]){
                index = i+1;
                break;
            }
        }

        for (int i = index; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                sum++;
                if (arr[j] < arr[j-1]){
                    tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    continue;
                }
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nsum:" + sum);

    }

}
