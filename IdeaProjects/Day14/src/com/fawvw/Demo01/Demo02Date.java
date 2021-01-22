package com.fawvw.Demo01;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();

    }
    public static void demo01(){
        Date date = new Date();
        System.out.println(date);//Fri Jan 22 11:29:08 CST 2021
    }
    public static void demo02(){
        Date date = new Date(0L);//Thu Jan 01 08:00:00 CST 1970，Date类的带参数构造方法，Date(long date) :传递毫秒值,把毫秒值转换为Date日期
        System.out.println(date);
    }
    public static void demo03(){
        Date date = new Date();
        long time = date.getTime();//把日期转换成毫秒值
        System.out.println(time);//1611291436316,
    }
}
