package com.fawvw.Day08.Demo01;
/*
* java.util.Math类是数学相关工具类，里面提供了大量静态方法，完成与数学运算相关的操作
* public static double abs(double num)绝对值
* public static double ceil(double num)向上取整
* public static double floor(double num)向下取整
* public static long round(double num)四舍五入
* Math.PI代表近似的圆周率常量
* */
public class Demo03Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-2.5));
        System.out.println(Math.ceil(3.8));
        System.out.println(Math.floor(3.8));
        System.out.println(Math.round(4.5));
        System.out.println(Math.PI);
    }
}
