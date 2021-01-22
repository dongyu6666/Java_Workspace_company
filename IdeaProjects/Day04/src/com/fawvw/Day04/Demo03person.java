package com.fawvw.Day04;

public class Demo03person {
    public static void main(String[] args) {
        person Ren = new person();
        //Ren.name = "马大帅";    错误写法
        Ren.setName("马大帅") ;//如果不满足if则输出错误信息
        Ren.setAge(-10);//如果不满足if则输出错误信息
        Ren.show();

    }
}
