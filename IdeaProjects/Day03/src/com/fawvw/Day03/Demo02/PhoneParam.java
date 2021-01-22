package com.fawvw.Day03.Demo02;
//使用对象类型作为方法的参数
import java.lang.reflect.Parameter;

public class PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "Xiaomi";
        one.color = "red";
        one.price = 10000;
        method(one); //把one这个对象参数传给方法，传递进去的其实就是地址值
    }
    public static void method(Phone Parameter) {
        System.out.println(Parameter.brand);
        System.out.println(Parameter.color);
        System.out.println(Parameter.price);
    }


}
