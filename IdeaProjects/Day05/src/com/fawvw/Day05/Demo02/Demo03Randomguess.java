package com.fawvw.Day05.Demo02;

import java.util.Random;
import java.util.Scanner;

//猜一个1-100的随机数,键盘输入猜
public class Demo03Randomguess {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(100) + 1;
        System.out.println("1-100,请猜数：");
        while (true){
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            if(guess > x){
                System.out.println("您猜大了");
            }
            else if(guess < x){
                System.out.println("您猜小了");
            }
            else {
                System.out.println("您猜中了");
                break;
            }
        }
    }

}
