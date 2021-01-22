package com.fawvw.Day09.Demo07;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        int index = new Random().nextInt(list.size());
        int delte = list.remove(index);
        int money = super.getMoney();
        super.setMoney(money +delte);

    }
}
