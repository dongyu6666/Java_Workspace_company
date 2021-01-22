package com.fawvw.Day07.Demo01;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room = "101教室";
        Student one = new Student("张三",19);
        System.out.println("姓名:"+ one.getName() + " 年龄:"+one.getAge() +" 位置在："+Student.room);//不推荐one.room，因为room是静态变量，推荐用类名称调用
        Student two = new Student("李四",20);
        System.out.println("姓名:"+ two.getName() + " 年龄:"+two.getAge() +" 位置在："+Student.room);//不推荐one.room，因为room是静态变量，推荐用类名称调用

    }
}
