package com.fawvw.day12.Demo05;

public class DemoRedMoneyMain {
    public static void main(String[] args) {
    MyRed red = new MyRed("哈哈哈");
    red.setOwnerName("公司");

   /* OpenMode avg = new OpenModeAvgImpl();
    red.setOpenWay(avg);*/

    OpenMode ran = new OpenModeRanImpl();
    red.setOpenWay(ran);

    }
}
