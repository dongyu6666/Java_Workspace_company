package com.fawvw.Day05.Demo03;
import java.util.ArrayList;
import java.util.Random;
/*
* 题目：
* 生成6个1~33之间的随机数，添加到集合，并遍历集合
*
* */
public class Demo06ArrayListtest1Random {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int a = r.nextInt(33) + 1;
            boolean add = list.add(a);
            System.out.println("是否add成功:" + add);
        }
        /*int a1 = r.nextInt(33) + 1;
        int a2= r.nextInt(33) + 1;
        int a3 = r.nextInt(33) + 1;
        int a4 = r.nextInt(33) + 1;
        int a5 = r.nextInt(33) + 1;
        int a6 = r.nextInt(33) + 1;*/

      /*  ArrayList<Integer> list = new ArrayList<>();
        boolean add1 = list.add(a1);
        System.out.println(add1);
        boolean add2 = list.add(a2);
        System.out.println(add2);
        boolean add3 = list.add(a3);
        System.out.println(add3);
        boolean add4 = list.add(a4);
        System.out.println(add4);
        boolean add5 = list.add(a5);
        System.out.println(add5);
        boolean add6 = list.add(a6);
        System.out.println(add6);*/

        for (int i = 0; i < list.size(); i++) {
            Integer result = list.get(i);
            System.out.println(result);
        }
    }
}
