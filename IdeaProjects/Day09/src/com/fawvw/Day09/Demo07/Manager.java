package com.fawvw.Day09.Demo07;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    //平均分
    public ArrayList<Integer> sendA(int totalMoney, int count) {
        ArrayList<Integer> redlist = new ArrayList<>();
        int leftMoney = super.getMoney();
        if (leftMoney < totalMoney) {
            System.out.println("余额不足！");
            return redlist;
        }

        super.setMoney(leftMoney - totalMoney);
        int avg = totalMoney / count;
        int mod = totalMoney % count;

        for (int i = 0; i < count - 1; i++) {
            redlist.add(avg);

        }
        redlist.add(avg + mod);
        return redlist;
    }
    //随机分
    public ArrayList<Integer> sendB(int totalMoney, int count){
        ArrayList<Integer> redlist = new ArrayList<>();
        int leftMoney = super.getMoney();
        if (leftMoney < totalMoney) {
            System.out.println("余额不足！");
            return redlist;
        }

        super.setMoney(leftMoney - totalMoney);

        Random r = new Random();
        int rrrtotal = 0;
        for (int i = 0; i < count-1; i++) {
            int rrr = r.nextInt(totalMoney);
            redlist.add(rrr);
            rrrtotal  = rrrtotal +rrr; //已分出去的钱
            totalMoney = totalMoney - rrr;//奖池还剩的钱
        }
        redlist.add(totalMoney);
        return redlist;

    }
}
