package com.z.Sort.Test;

/**
 * @athor Fly
 * @data 2022/11/1 16:31
 * @Version 1.0
 * 上台阶
 */
public class Step {

    public static void main(String[] args) {
        System.out.println(UpTwoStep(4));
    }

    //一次可上1，2个台阶 1层台阶 1种爬法，2层台阶 2种爬法   n层台阶 n-1种爬法 + n-2种爬法
    public static int UpTwoStep(int step){
        if (step == 1) return 1;
        if (step == 2) return 2;
        return UpTwoStep(step - 1) + UpTwoStep(step - 2);
    }

    //一次可上1，2，3个台阶 1层台阶 1种爬法，2层台阶 2种爬法 3层台阶 4种爬法  n层台阶 n-1种爬法 + n-2种爬法 + n-3种爬法
    public static int UpThreeStep(int step){
        if (step == 1) return 1;
        if (step == 2) return 2;
        if (step == 3) return 4;
        return UpThreeStep(step - 1) + UpThreeStep(step - 2) + UpThreeStep(step-3);
    }

}
