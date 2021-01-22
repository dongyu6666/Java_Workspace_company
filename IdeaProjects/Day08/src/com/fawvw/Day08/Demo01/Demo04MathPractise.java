package com.fawvw.Day08.Demo01;
/*
* 题目：
* 计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有几个？
* */
public class Demo04MathPractise {
    public static void main(String[] args) {
        int counter = 0;
        double num_ini = -10.8;
        double num_finish = 5.9;


        double num1 = Math.ceil(num_ini);
        double num2 = Math.floor(num_finish);
        for(double i = num1;num1 < num2; num1++){
            if( Math.abs(num1) > 6 || Math.abs(num1) < 2.1){
                counter++;
                System.out.println(num1);
            }
            else;
        }
        System.out.println(counter);


    }
}
