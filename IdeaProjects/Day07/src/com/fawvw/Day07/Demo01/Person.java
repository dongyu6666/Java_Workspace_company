package com.fawvw.Day07.Demo01;

public class Person { //没有小括号
    static {
        System.out.println("静态代码块执行！");
    }
    public Person(){
        System.out.println("构造方法执行！");
    }

}
