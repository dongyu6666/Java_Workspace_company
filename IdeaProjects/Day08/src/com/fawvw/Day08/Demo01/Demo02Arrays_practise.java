package com.fawvw.Day08.Demo01;

import java.util.Arrays;
import java.util.Scanner;

/*
题目：请使用Arrays相关的API，将一个随机字符串进行升序排列，并倒序打印。
* */
public class Demo02Arrays_practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = sc.next();
        //先把字符串变成字符数组
        char[] ch = input.toCharArray();
        //用Arrays.sort进行排序
        Arrays.sort(ch);
        //把字符数组变成字符串，并正序打印
        System.out.println(Arrays.toString(ch));

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }




    }



}
