package com.fawvw.Day01.Demo02;

/*
有参数：小括号里有内容
无参数：小括号里无内容
* */

public class Demo03MethodParam {
    public static void main(String[] args) {
        System.out.println(method1(12,5));
        method2();
    }

    public static int method1(int a, int b){
        int result= a * b;
        return result;
    }

    public static void method2(){
        for (int i = 1; i < 6; i++) {
            System.out.println("============="+i);
        }
    }
}
