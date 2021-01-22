package com.fawvw.Day03.Demo02;

public class Phone {
    //定义成员变量
    String brand; //引用数据类型，类名：大写
    double price;

    /*内置数据类型：
    * Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。
    * 四个整数型:byte,short,int,long
    * 两个浮点型:float,double
    * 一种字符类型:char
    * 一种布尔型:boolean
    * */

    String color;

    //定义成员方法

    public void call(String who){ //有参数who
        System.out.println("call "+ who);
    }
    public void message(){ //没有参数
        System.out.println("send message");
    } //无参数
}
