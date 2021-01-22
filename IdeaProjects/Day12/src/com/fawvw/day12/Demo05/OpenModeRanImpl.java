package com.fawvw.day12.Demo05;

import java.util.ArrayList;
import java.util.Random;

public class OpenModeRanImpl implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random r = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        for (int i = 0; i < totalCount-1; i++) {

            int redMoney = r.nextInt((leftMoney/leftCount)*2)+1;
            list.add(redMoney);
            leftMoney = leftMoney - redMoney;
            leftCount = leftCount -1; //已分出去的钱
        }
        list.add(leftMoney);
        return list;

       /* ArrayList<Integer> redlist = new ArrayList<Integer>();
        int leftMoney = totalMoney;
        if (leftMoney < totalMoney) {
            System.out.println("余额不足！");
            return redlist;
        }

        leftMoney = leftMoney - totalMoney;

        Random r = new Random();
        int rrrtotal = 0;
        for (int i = 0; i < totalCount-1; i++) {
            int rrr = r.nextInt(totalMoney);
            redlist.add(rrr);
            rrrtotal  = rrrtotal +rrr; //已分出去的钱
            totalMoney = totalMoney - rrr;//奖池还剩的钱
        }
        redlist.add(totalMoney);
        return redlist;*/

    }
}
