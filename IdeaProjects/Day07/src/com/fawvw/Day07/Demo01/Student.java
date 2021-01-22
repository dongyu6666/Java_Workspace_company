package com.fawvw.Day07.Demo01;

public class Student {

    private int id;//学号，这里不能定义static,因为不能共用，每个对象都有自己的id
    private String name;
    private int age;
    static String room;//所在教室这里定义static，可以多个对象都共用这个成员变量


    private static int idCounter = 0;//学号计数器，每new一个新对象，计数器++

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
