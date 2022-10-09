package com.z;
/**
* @athor Fly
* @data 2022/10/8 22:10
* @Version 1.0
*/
public class MathTest {

    public static void main(String[] args) {

        for (int i = 10; i <= 99; i++){
            int ge = i % 10;
            int shi = i / 10 % 10;

            if(i == Math.pow(ge,2)+Math.pow(shi,2)){
                System.out.println(i);
            }

        }
    }

}
