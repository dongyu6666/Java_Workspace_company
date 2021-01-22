package com.fawvw.Day09.Demo07;

import java.util.ArrayList;
import java.util.Scanner;

public class redMoney {
    public static void main(String[] args) {
        Manager manager = new Manager("老大",1000);
        Member one = new Member("A",0);
        Member two = new Member("B",0);
        Member three = new Member("C",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=======================");
        //群主选择A还是B
        System.out.println("请输入选择A:均分 or B:随机分——————：");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        System.out.println("请输入发红包数额：");
        int totalMoney = sc.nextInt();
        System.out.println("请输入红包个数：");
        int count = sc.nextInt();

        if ("A".equals(choice)){

        //选A
        ArrayList<Integer> redlistA= manager.sendA(totalMoney, count);
        one.receive(redlistA);
        two.receive(redlistA);
        three.receive(redlistA);

        manager.show();
        one.show();
        two.show();
        three.show();

        System.out.println("=======================");
        }
        //选B
        if ("B".equals(choice)) {
            ArrayList<Integer> redlistB = manager.sendB(totalMoney, count);
            one.receive(redlistB);
            two.receive(redlistB);
            three.receive(redlistB);

            manager.show();
            one.show();
            two.show();
            three.show();
        }
        else if(choice.equals("A") && choice.equals("B")){
            System.out.println("输入错误");
        }
    }
}
