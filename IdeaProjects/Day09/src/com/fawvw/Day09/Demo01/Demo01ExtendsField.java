package com.fawvw.Day09.Demo01;
/*
* 在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：
* 直接通过子类对象访问成员变量：等号左边是谁，优先用谁，没有就向上找
* 间接通过成员方法访问成员变量：方法属于谁用谁，没有就向上找
* */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        //Fu fu = new Fu();
        //System.out.println(fu.numFu);
        System.out.println("==========");
        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("==========");
        System.out.println(zi.xxx);
        System.out.println("==========");
        zi.methodZi();//子类有该方法，优先用子类
        System.out.println("==========");
        zi.methodFu();//子类没有该方法，是父类的，就找父类的
    }
}
