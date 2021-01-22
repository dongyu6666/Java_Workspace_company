package com.fawvw.Day06.Demo01;
/*
* 分割字符串的方法：
* public String[] split(String regex):按照参数的规则，将字符串切分成为若干部分
*注意事项：
* split方法的参数其实是一个正则表达式，如果按照"."进行切分，必须按照"\\."进行
* */
public class Demo06StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        System.out.println(str1);
        String[] array1 = str1.split(","); //以“，”为标志进行分割
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("=====================================");
        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("=====================================");
        String str3 = "AAA.BBB.CCC";
        System.out.println(str3);
        String[] array3 = str3.split("\\."); //注意：如果按照"."进行切分，必须按照"\\."进行，如果只是按照"."切分，那就失败了
        System.out.println(array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        System.out.println("=====================================");



    }
}
