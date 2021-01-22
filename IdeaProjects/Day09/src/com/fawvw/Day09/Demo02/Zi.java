package com.fawvw.Day09.Demo02;

public class Zi extends Fu {
    int num = 300;
    public void method(){
        int num = 400;
        System.out.println(num);//局部变量----400
        System.out.println(this.num);//本类成员变量 ------300
        System.out.println(super.num);//父类成员变量 ------100
    }
}
