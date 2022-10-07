package com.z.myStatic.demo2;
/**
* @athor Fly
* @data 2022/10/6 22:33
* @Version 1.0
*/
public class ArrayUtil {

    private ArrayUtil(){}

    public static String printArr(int[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                stringBuilder.append(arr[i]).append("]");
            }else{
                stringBuilder.append(arr[i]).append(",");
            }
        }
        return stringBuilder.toString();
    }

    public static double getAverage(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/ arr.length;
    }

}
