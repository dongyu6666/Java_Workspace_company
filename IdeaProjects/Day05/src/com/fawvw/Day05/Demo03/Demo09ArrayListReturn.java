package com.fawvw.Day05.Demo03;

import java.util.ArrayList;
import java.util.Random;
/*
* ArrayList作为返回值类型
* 题目：
* 用大集合存入20个随机数，筛选出偶数元素，放到小集合中。
* 要求自定义方法完成筛选。
* */
public class Demo09ArrayListReturn {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> biglist = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            int rrr = r.nextInt(20);
            biglist.add(rrr);
            System.out.println("大集合为："+biglist.get(i));
        }
        System.out.println("==========================================");
        ArrayList<Integer> smalllist = getSmalllist(biglist);
        for (int i = 0; i < smalllist.size(); i++) {
            System.out.println("小集合为："+smalllist.get(i));
        }
    }
    //该方法参数是biglist，是地址值，返回值是smalllist，也是地址值
    public static ArrayList<Integer> getSmalllist(ArrayList<Integer> biglist){
        ArrayList<Integer> smalllist = new ArrayList<Integer>();
        for (int i = 0; i < biglist.size(); i++) {
            if (biglist.get(i) % 2 == 0){
            smalllist.add(biglist.get(i));
            //System.out.println("小集合为："+smalllist.get(i));我这里有问题？？？？！！！！！
            }
        }
        return smalllist;
    }
}
