package com.fawvw.Day05.Demo02;
//根据int变量n的值，来获取随机变量，范围是【1，n】，n需要键盘输入

import java.util.Random;
import java.util.Scanner;


public class Demo02Random1_n {
    public static void main(String[] args) {
        System.out.println("请输入n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("n 是 "+n);

        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int rrr = r.nextInt(n)+1;
            System.out.println("随机数是"+rrr);
        }
    }


}
