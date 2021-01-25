package com.fawvw.Day15.Demo02;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println("空的："+s);
        StringBuilder abc = new StringBuilder("abc");
        System.out.println(abc);
        System.out.println("===================");

        StringBuilder aaa = new StringBuilder();
        StringBuilder append = aaa.append(123);
        System.out.println(aaa);
        System.out.println(append);
        System.out.println(aaa==append);//true两个对象是同一个对象，因为地址一样
        System.out.println("===================");
        aaa.append("asdfa");
        aaa.append(true);
        aaa.append("Hello").append("world").append("hahaha");
        System.out.println(aaa);
        System.out.println("===================");
        StringBuilder aaa_reverse = aaa.reverse();
        System.out.println(aaa_reverse);
        System.out.println("===================");
        String s1 = aaa_reverse.toString();
        System.out.println(s1);
    }
}
