package com.fawvw.Day06.Demo01;
/*
* java.lang.String类代表字符串
* 字符串特点：
* 1.字符串内容永不变
* 2.可共享
* 3.效果相当于char[]字符数组，底层原理是byte[]字节数组
*
* 创建字符串的常见3+1种方式
* 三种构造方法：
* public String():创建一个空白字符串，不含有任何内容
* public String(char[] array): 根据字符数组的内容，来创建对应的字符串
* public String(byte[] array): 根据字节数组的内容，来创建对应的字符串
* 一种直接创建：String str4 = "Hello"
* 注意：直接写上双引号，就是字符串对象
 */

public class Demo01String {
    public static void main(String[] args) {
        //空参构造
        String str1 = new String();
        System.out.println("第一个字符串：" + str1);

        //根据字符数组来创建对应的字符串
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);

        //根据字节数组来创建对应的字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串：" + str3);

        //直接创建
        String str4 = "Hello";
        System.out.println("第四个字符串：" + str4);
    }
}
