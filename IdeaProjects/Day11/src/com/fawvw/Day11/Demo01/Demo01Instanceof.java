package com.fawvw.Day11.Demo01;
/*
* instanceof,来判断子有没有变成父有(没有向上转型过）
* 格式：
* 对象（父的） instanceof 类名称（子的），得到boolean值：(f instanceof Zi)
* */
public class Demo01Instanceof {
    public static void main(String[] args) {
        Fu f = new Zi();//向上转型
        f.methodFu();

        Zi z = (Zi) f;//向下转型
        z.methodZi();

        /*Zi2 zz = (Zi2) f;//报错，因为Zi2没有变成Fu，没有向上转型
        zz.methodZi2();*/
        //为了解决这个问题：用Instanceof，来判断子有没有变成父（有没有向上转型过），有的话再调用子类自己的方法
        System.out.println(f instanceof Zi);
        System.out.println(f instanceof Zi2);

    }
}
