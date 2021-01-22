package com.fawvw.Day05.Demo02;
import java.util.Random;
//Random取值是[0,n),左闭右开
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是：" + num);

        for (int i = 0; i < 20; i++) {
            int num2 = r.nextInt(10);//0~9
            System.out.println(num2);
        }
    }
}
