package com.z.pojo;
/**
* @athor Fly
* @data 2022/10/6 21:28
* @Version 1.0
*/
public class Student implements Cloneable{

    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", age = " + age + "}";
    }

    //对象克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void person(String aaa) {
        new Person(aaa);
    }

    class Person{
        private String name;
        public Person(){}

        public Person(String name){
            this.name = name;
        }

    }

}
