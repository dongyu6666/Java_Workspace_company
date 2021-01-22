package com.fawvw.Day06.Demo01;
/*
* 字符串的截取方法：
* public String substring(int beginIndex):截取从参数位置一直到字符串结尾，返回新字符串
* public String substring(int beginIndex,int endIndex):截取从begin开始，end结束，左闭右开[begein,end)
* */
public class Demo05Substring {
    public static void main(String[] args) {
        String str1 = "Helloworld";
        String str2 = str1.substring(5);//world
        String str3 = str1.substring(0,5);//Hello
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("===================");
        String str4 = str1.substring(5,10);//world
        System.out.println(str4);

        //字符串的内容不可改变
        //strA保存的是地址值，本来地址值是Hello的0x666，后来是Java的0x999
        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);
    }
}
