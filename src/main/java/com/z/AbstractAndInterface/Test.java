package com.z.AbstractAndInterface;
/**
* @athor Fly
* @data 2022/10/8 16:59
* @Version 1.0
*/
public class Test {

    public static void main(String[] args) {
        PingPongStudent pingPongStudent = new PingPongStudent("张三", 19);
        System.out.println(pingPongStudent.getName());
        System.out.println(pingPongStudent.getAge());
        pingPongStudent.English();
        pingPongStudent.study();

        PingPongTeach pingPongTeach = new PingPongTeach("李四", 37);
        System.out.println(pingPongTeach.getName());
        System.out.println(pingPongTeach.getAge());
        pingPongTeach.English();
        pingPongTeach.teach();

        BasketBallTeach basketBallTeach = new BasketBallTeach("王五",38);
        System.out.println(basketBallTeach.getName());
        System.out.println(basketBallTeach.getAge());
        basketBallTeach.teach();


    }

}
