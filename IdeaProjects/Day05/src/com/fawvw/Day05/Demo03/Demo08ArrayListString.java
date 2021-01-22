package com.fawvw.Day05.Demo03;

import java.util.ArrayList;

public class Demo08ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        printArrayList(list);
    }
    public static void printArrayList(ArrayList<String> list){//参数就是ArrayList<泛型是String>
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            while(i < list.size()-1){
                System.out.print("@");
                break;
            }
        }
        System.out.print("}");

    }
}
