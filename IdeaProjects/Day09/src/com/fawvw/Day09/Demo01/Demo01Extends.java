package com.fawvw.Day09.Demo01;
/*
* 在继承的关系中，“子类就是一个父类”，子类可以被当做父类看待。
* 定义父类的格式：（一个普通的类定义）
* public class 父类名称{}
* 定义子类的格式：
* public class 子类名称 extends 父类名称{}
* */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建子类对象
        Teacher te = new Teacher();

        te.method();//Teacher中是空的，但继承了父类中的method
        System.out.println("==========================");
        //创建另一个子类
        Assistant as = new Assistant();
        as.method();
    }


}
