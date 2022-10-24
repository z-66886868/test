package com.z.reptile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @athor Fly
 * @data 2022/10/14 20:54
 * @Version 1.0
 */
public class ReptileTest {

    public static void main(String[] args) {
        String str = "Java自从95年问世来，经历了很多版本，目前企业中用的最多的是Java8和Java11,因为这两个版本是长期支持版本,下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";
        //Pattern：表示正则表达式
        Pattern compile = Pattern.compile("Java\\d{0,2}");
        //Matcher：文本匹配器
        Matcher matcher = compile.matcher(str);

//        //判断是否有符合条件的文本 会对符合的字符串进行索引
//        boolean b = matcher.find();
//        //打印匹配的字符串，得在find之后使用
//        System.out.println(matcher.group());

        //使用循环截取
        while (matcher.find()){
            //matcher.group()  == str.substring(matcher.start(), matcher.end())
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }




    }

}
