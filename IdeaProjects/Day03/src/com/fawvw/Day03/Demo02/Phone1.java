package com.fawvw.Day03.Demo02;

public class Phone1 {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("==================");

        one.brand = "Xiaomi";
        one.color = "red";
        one.price = 10000;

        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        one.call("Dennis");
        one.message();
    }
}
