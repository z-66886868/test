package com.z;
/**
* @athor Fly
* @data 2022/10/8 23:04
* @Version 1.0
*/
public class SystemTest{

    public static void main(String[] args) {
        //System.exit(0);
        System.out.println("aaa");

        //获取时间
        System.out.println(System.currentTimeMillis());


        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[5];
        System.arraycopy(arr1,0,arr2,1,3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }

}
