package com.fawvw.Day09.Demo03;
/*
*在父子类的继承关系当中,创建子类对象，访问成员方法：
* 创建对象是谁，优先用谁，没有就向上找
* 注意事项：无论成员方法还是变量，如果没有都是向上找父类，不会向下找子类。
* 重写（override）
* 概念：在继承关系当中，方法的名称一样，参数列表也一样
* 重写（override）：方法的名称一样，参数列表也一样，覆盖、重写
* 重载（overload）：方法的名称一样，参数列表不一样
* 方法覆盖重写特点：创建的是子类对象，则优先用子类方法。
* */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();
        zi.method();//优先用zi对象
    }
}
