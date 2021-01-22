package com.fawvw.Day06.Demo01;
/*
* String当中与获取相关的常用方法有：
* public int length():获取字符串长度
* public String concat(String str):当前字符串和参数字符串拼接成返回值新 的字符串
* public char charAt(int index):获取指定索引位置的单个字符（索引从0开始）
* public in indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1
* */
public class Demo04StringGet {
    public static void main(String[] args) {
        //获取字符串长度
        int length = "askdfhashfasjhdf;asdjhf".length();
        System.out.println(length);
        System.out.println("================");
        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);//拼接
        System.out.println(str1);//str1不会变
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("================");
        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置字符是：" + ch);//e,就是第二个位置
        System.out.println("================");
        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果没有，返回-1
        String original = "HelloWorldHelloWorld";
        int llo = original.indexOf("llo");
        System.out.println(llo);//结果是2，说明在第二个位置就索引到了，只看第一次索引
        System.out.println("HelloWorld".indexOf("abc"));//结果是-1，说明没有找到

    }
}
