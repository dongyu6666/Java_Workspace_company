package com.fawvw.Day10.Demo04;
/*
* 接口当中也可以定义"成员变量"，但是必须使用public static final 三个关键字进行修饰
* 从效果上看，就是接口的【常量】
* 格式：
* public static final 数据类型 常量名称 = 数据值；
* 备注：
* 一旦使用final关键字进行修饰，说明不可改变。
* 注意事项：
* 1、接口当中的常量，可以省略灰色的public static final，但是如果不写，也照样默认是这样。
* 2、接口当中的常量，必须进行赋值。
* 3、接口中常量的名字，推荐：全是大写（下划线分隔）。
* */
public interface MyInterfaceConst {
    //就是一个常量，一旦赋值，不可修改
    public static final int NUM_OF_MY_CLASS = 10;//shift + F6
}
