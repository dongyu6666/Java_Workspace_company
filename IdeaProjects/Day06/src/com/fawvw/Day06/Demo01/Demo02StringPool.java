package com.fawvw.Day06.Demo01;
/*
* 字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中，但是new的不在池当中
* 对于基本类型， == 是【数值】比较
* 对于引用类型， == 是【地址值】比较 ,String就是引用类型
* */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2); // ture
        System.out.println(str2 == str3); // false
        System.out.println(str1 == str3); // false

    }
}
