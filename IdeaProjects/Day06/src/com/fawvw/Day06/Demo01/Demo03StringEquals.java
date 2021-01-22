package com.fawvw.Day06.Demo01;
/*
* == 是进行对象的地址值比较，如果确实需要字符串内容比较，有两个方法：
* 方法一：
* public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true;否则false
* 备注：
* 1、任何对象都能用Object进行接收
* 2、equals方法具有对称性
* 3、比较常量和变量，推荐把常量字符串写前面
*    推荐"abc".equals(str)     不推荐 str.equals("abc")
* 方法二：
* public boolean equalsIgnoreCase(String str): 可忽略大小写进行比较
*
* */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));//内容比较，结果是true
        System.out.println(str2.equals(str3));//内容比较，结果是true
        System.out.println(str3.equals("Hello"));//内容比较，结果是true
        System.out.println("Hello".equals(str1));//内容比较，结果是true
        String str4 = "hello";
        System.out.println(str1.equals(str4));//内容比较，结果是false
        System.out.println("============================");

        String str5 = "abc";
        System.out.println("abc".equals(str5));//推荐
        System.out.println(str5.equals("abc"));//不推荐
        System.out.println("============================");

        String str6 = "null";
        System.out.println("abc".equals(str6));//推荐， false
        System.out.println(str6.equals("abc"));//不推荐，老版本会报错，空指针异常 NullPointerException
        System.out.println("============================");

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));//内容比较，结果是false
        System.out.println(strA.equalsIgnoreCase(strB));//内容比较，结果是ture,因为忽略大小写

    }
}
