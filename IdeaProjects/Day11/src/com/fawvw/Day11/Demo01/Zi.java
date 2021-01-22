package com.fawvw.Day11.Demo01;

public class Zi extends Fu{
    @Override
    public void method() {
        System.out.println("子类方法");
    }
    int num = 20;

    @Override
    public void shownum() {
        System.out.println(num);
    }
    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
