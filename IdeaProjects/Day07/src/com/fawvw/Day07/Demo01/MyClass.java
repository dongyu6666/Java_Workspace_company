package com.fawvw.Day07.Demo01;

public class MyClass {

    int num;//定义成员变量
    static int numStatic;//定义静态变量

    public void method(){
        System.out.println("这是普通的成员方法");
        System.out.println(num);
        System.out.println(numStatic);
        this.num = 1;
    }

    public static void methodStatic(){
        System.out.println("这是静态方法");
        //System.out.println(num); 报错，因为静态方法不能访问非静态变量
        System.out.println(numStatic);
        //静态方法中，不能使用this关键字
        //this.num = 2;
    }
}
