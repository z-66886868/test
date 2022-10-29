package com.z.FindTest;

/**
 * @athor Fly
 * @data 2022/10/25 21:19
 * @Version 1.0
 */
public class ErFenTest {

    public static void main(String[] args) {

        int[] arr = new int[]{11,22,33,44,55,66,77,88,99};

        System.out.println(erfen(arr,88));

//        int [] arr= {1,3,9,12,14,17,24,28,29};
        int low = 0;
        int high = arr.length-1;
        int index = interpolationSearch(arr,low,high,55);
        System.out.print("所查找元素的位置为：" + index);

    }

    private static int erfen(int[] arr,int flag) {
        int min = 0;
        int max = arr.length - 1;
        int mid;

        while (true){
            if (min > max){
                return -1;
            }
            mid = (min + max) /2;
            if(flag == arr[mid]){
                return mid;
            }else if (arr[mid] > flag){
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }

    }

    public static int interpolationSearch(int[] arr, int low, int high, int key) {

        if (low > high) {
            return -1;
        }
        int mid = low + (int) (1.0 * (key - arr[low]) / (arr[high] - arr[low]) * (high - low));
        if (mid < low || mid > high) {
            return -1;
        }
        if (arr[mid] == key) {
            return mid;
        } else if (key < arr[mid] ) {
            return interpolationSearch(arr,low,mid - 1,key);
        } else {
            return interpolationSearch(arr,mid + 1, high,key);
        }
    }


}
