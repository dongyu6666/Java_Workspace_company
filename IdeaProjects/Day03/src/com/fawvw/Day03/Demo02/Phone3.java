package com.fawvw.Day03.Demo02;

public class Phone3 {
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
        System.out.println("==================");
        one.call("Dennis");
        one.message();
        System.out.println("++++++++++++++++++++++++++++");
        Phone two = one; //将对象one的地址值赋给two
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("==================");
        two.brand = "oppo";
        two.color = "white";
        two.price = 5000;
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("==================");
        two.call("Matus");
        two.message();


    }
}
