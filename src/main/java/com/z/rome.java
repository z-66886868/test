package com.z;
/**
* @athor Fly
* @data 2022/10/6 17:33
* @Version 1.0
*/
public class rome {

    public static void main(String[] args) {
        /*
        将阿拉伯数字转换成罗马数字
         */
        String str = "123456";
        String[] strings = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        StringBuilder stringBuilder = new StringBuilder();

        if (checkStr(str)){
            for (int i = 0; i < str.length(); i++) {
                int c = (int)str.charAt(i) - 48;
                stringBuilder.append(strings[c]);
            }
        }

        System.out.println(stringBuilder);

    }

    public static boolean checkStr(String s){
        if (s.length() > 9){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9' ){
                return false;
            }
        }
        return true;
    }

}
