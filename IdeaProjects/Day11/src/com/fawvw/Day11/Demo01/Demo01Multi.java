package com.fawvw.Day11.Demo01;
/*
* 代码当中体现多态性：父类引用指向子类对象
* 格式：
* 父类名称 对象名 = new 子类名称（）；
* 接口名称 对象名 = new 实现类名称（）；
*
* 成员方法：编译看左，运行看右。
* 成员变量：编译看左，运行还看左。
*
* 向上转型是安全的，但是有弊端：对象一旦向上转型为父类，那就无法调用子类原本特有的。
*
* */
public class Demo01Multi {
    public static void main(String[] args) {
        //多态写法
        Fu obj = new Zi();//对象向上转型，把子变父
        obj.method();//调用方法：谁的方法找谁（看new谁），那就是Zi的方法
        obj.methodFu();//Zi的方法没有，找Fu

        System.out.println(obj.num);//调用成员变量，看等号左边，所以是10；但是覆盖重写后，就是20了。
        obj.shownum();
        System.out.println("================");
        //Fu obj = new Zi编译看左边的父，所以报错
        //obj.methodZi();错误写法，对象一旦向上转型为父类，那就无法调用子类原本特有的。

        Zi zi = (Zi) obj;//对象向下转型，进行还原，把父变回子
        zi.methodZi();//这样就可以调用子类方法了
    }
}
