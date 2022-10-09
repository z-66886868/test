package com.z.RuntimeTest;

import java.io.IOException;

/**
* @athor Fly
* @data 2022/10/9 13:42
* @Version 1.0
*/
public class RunTime {

    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        //获取cpu线程数
        System.out.println(runtime.availableProcessors());
        //获取jvm能获取的总内存大小,byte
        System.out.println(runtime.maxMemory()/1024/1024);
        //jvm已经获取的总内存大小,byte
        System.out.println(runtime.totalMemory() / 1024 / 1024);
        //甚于的内存大小
        System.out.println(runtime.freeMemory() / 1024 / 1024);
        //运行cmd命令
        //runtime.exec("shutdown -s -t 3600");
        runtime.exec("shutdown -a");
    }

}
