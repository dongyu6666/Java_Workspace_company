package com.fawvw.Day05.Demo03;

import java.util.ArrayList;

/*
* 题目：
* 定义以制定格式打印集合的方法（ArrayList类型作为参数），使用{}括起集合，用@分隔每个元素
* System.out.println();   [10,20,30]
* 方法printArrayList();   {10@20@30}
* */
public class Demo08ArrayListPrintInt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        printArrayList(list);
    }
    public static ArrayList printArrayList(ArrayList list){//public static ArrayList的ArrayList不能省略，原因是ArrayList这个集合是返回值类型
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            while(i < list.size()-1){
                System.out.print("@");
                break;
            }
        }
        System.out.print("}");
        return list;
    }
}
