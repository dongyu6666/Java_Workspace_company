package com.fawvw.Day06.Demo01;

import java.util.Scanner;

/*
* 题目：
* 键盘输入一个字符串，并且统计其中各种字符出现的次数
* 种类有：大写字母、小写字母、数字、其他
* 提示：用到toCharArray()方法
* */
public class Demo08StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String sc_input = sc.next();
        //System.out.println(sc_input);
        int str_A = 0;
        int str_a = 0;
        int int_i = 0;
        int other = 0;

        char[] charArray = sc_input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];//单个字符
            if(ch >= 'A' && ch <= 'Z'){
                str_A++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                str_a++;
            }
            else if(ch >= '0' && ch <= '9'){
                int_i++;
            }
            else {
                other++;
            }
        }
        System.out.println("大写字母个数"+str_A);
        System.out.println("小写字母个数"+str_a);
        System.out.println("数字个数"+int_i);
        System.out.println("其他个数"+other);

    }
}
