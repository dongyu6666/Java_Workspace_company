package com.fawvw.Day02;
/*
* 数组概念：容器，存放多个数据值
* 特点：
* 1、引用数据类型
* 2、类型必须统一
* 3、长度在程序运行期间不可改变
*
* 数组的初始化，两种方式：
* 1、动态初始化（指定长度）
* 2、静态初始化（指定内容）
*
* 动态初始化数组的格式：
* 数据类型[] 数组名称 = new 数据类型[数据长度]
*
* */
//动态初始化举例：
public class Demo01Array {
    public static void main(String[] args) {
        // 创建数组，存300个int数据
        // 数据类型[] 数组名称 = new 数据类型[数据长度]
        int[] arrayA = new int[300];

        // 创建数组，存100个double数据
        double[] arrayB = new double[100];

        // 创建数组，存5个字符串
        String[] arrayC = new String[5];

    }
}
