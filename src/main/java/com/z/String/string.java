package com.z.String;

public class string {

    /**
    * 测试 substring
    */
    public static void main(String[] args) {
        String id = "42011620030618";

        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12);

        System.out.println(year + "\n" + month + "\n" + day);

    }

}
