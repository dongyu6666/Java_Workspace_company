package com.fawvw.Day03;
/*定义类
 * 属性（是什么）
 * 姓名、年龄
 *
 * 行为（能做什么）注意：没有static
 * 吃饭、睡觉、学习
 * */

public class Student {
    //成员变量，定义在类当中，在方法的外边
    String name;
    int age;
    //成员方法，不要写static
    public void eat(){
        System.out.println("吃");
    }
    public void sleep(){
        System.out.println("睡");
    }
    public void study(){
        System.out.println("学");
    }


}
