package com.z.Sort;

/**
 * @athor Fly
 * @data 2022/10/29 17:42
 * @Version 1.0
 * 冒泡排序
 */
public class BubbleTest {

    public static void main(String[] args) {

        int[] arr = {2,4,5,7,6};
        int tmp;
        boolean flag;
        int sum = 0;
//        for (int i = arr.length; i > 0; i--) { // 5 4 3 2 1
//            for (int j = 0; j < i-1; j++) { // 5-1 4 4-1 3
//                if (arr[j] > arr[j+1]){
//                    tmp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }

        for (int i = 0; i < arr.length-1; i++){
            flag = true;
            for (int j = 0;j < arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    flag = false;
                }
                sum++;
            }
            if (flag) break;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("sum:"+sum);

    }

}
