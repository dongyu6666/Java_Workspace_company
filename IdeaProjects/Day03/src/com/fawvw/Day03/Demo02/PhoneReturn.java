package com.fawvw.Day03.Demo02;

public class PhoneReturn {
    public static void main(String[] args) {
    Phone two = return_Phone();
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.brand);

    }
    public static Phone return_Phone(){
        Phone one = new Phone();
        one.brand = "Xiaomi";
        one.color = "red";
        one.price = 10000;

        return one;
    }
}
