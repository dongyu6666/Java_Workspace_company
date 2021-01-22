package com.fawvw.Day01.Demo02;

public class Demo03MethodReturn {

    public static void main(String[] args) {
        int num = sum1(12,34);
        System.out.println(num);
        System.out.println("=========");

        sum2(3,56);
    }
    //该方法有返回值
    public static int sum1(int a, int b){
        int result = a + b;
        return result;
    }
    //该方法无返回值void
    public static void sum2 (int a, int b){
        int result = a + b;
        System.out.println("结果是："+result);

    }












}
