package com.z.extendsTest;
/**
* @athor Fly
* @data 2022/10/7 20:36
* @Version 1.0
*/
public class cat extends Animal{

    public cat() {
    }

    public cat(String name){
        this.name = name;
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }

}
