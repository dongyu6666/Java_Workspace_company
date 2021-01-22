package com.fawvw.Day05.Demo03;

import java.util.ArrayList;

//遍历集合
public class Demo04ArrayListeach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dennis");
        list.add("Matus");
        list.add("Arthur");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //简化写法： list.fori +回车
    }
}
