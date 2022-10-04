package com.z;

class TalkPlace{ static String talkArea="";}

public class User {

        static int count=0;
        String username; int age;
        public User(String name,int yourage){
            username=name; age=yourage;
        }
        void log(){
            count++;
            System.out.println("your are No."+count+"user");
        }

        void speak(String words){
            TalkPlace.talkArea+=username+"说："+words+"\n";
        }


    public static void main(String[] args){
        User x1=new User("张三",20);
        x1.log(); x1.speak("hello");
        User x2=new User("李四",16);
        x2.log(); x2.speak("good morning");
        x1.speak("bye");
        System.out.println("---讨论区内容如下：");
        System.out.println(TalkPlace.talkArea);
    }


}
