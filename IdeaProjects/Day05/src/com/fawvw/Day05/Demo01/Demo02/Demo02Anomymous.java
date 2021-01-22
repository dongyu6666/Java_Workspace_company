package com.fawvw.Day05.Demo01.Demo02;
import java.util.Scanner;
public class Demo02Anomymous {
    public static void main(String[] args) {
        //普通方式
        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //System.out.println(a);

        //匿名对象方式
        //int a = new Scanner(System.in).nextInt();
        //System.out.println(a);

        //使用一般方法传入参数
        //Scanner sc = new Scanner(System.in);
        //methodParam(sc);

        //使用匿名对象传入参数
        methodParam(new Scanner(System.in));
        //使用匿名对象作为返回值
        Scanner sc = methodReturn();
        int i = sc.nextInt();
        System.out.println("输入的是"+i);
    }
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是"+num);
    }
    public static Scanner methodReturn(){
        //Scanner sc = new Scanner(System.in);
        //使用匿名对象作为返回值
        return new Scanner(System.in);
    }

}
