package com.fawvw.Day03;
/*
*一个类不能直接使用，需要根据类创建对象，才能用
* 1、导包：需要使用的类，在什么位置
* import 包名称.类名称
* import com.fawvw.Day03.Student
*
* 2、创建，格式：
* 类名称 对象名 = new 类名称（）;
* student stu = new Student();
*
* 3、使用
* 使用成员变量：对象名.成员变量名
* 使用成员方法：对象名.成员方法名（参数）
*
* */


public class Demo02Student {
    public static void main(String[] args) {
    //1、导包,同一个package下，可以不写
    //2、创建，格式
    //类名称 对象名= new 类名称（）;
    //根据Student类，创建一个名为stu的对象
        Student stu = new Student();

    //3、使用其中的成员变量，格式：
    //格式是： 对象名.成员变量名
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("===============");
    //改变对象中的成员变量数值
        stu.name = "张三";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);
    //4、使用对象的成员方法，格式：
    // 对象名.成员方法名（）
        stu.eat();
        stu.study();
        stu.sleep();
    }

}
