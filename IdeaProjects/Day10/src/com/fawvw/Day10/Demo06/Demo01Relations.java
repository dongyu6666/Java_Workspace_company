package com.fawvw.Day10.Demo06;
/*
* 1.类与类之间是单继承的，直接父类只有一个。
* 2.类与接口之间是多实现的：一个类可以实现多个接口，有冲突就解决
* 3.接口与接口之间是多继承的
* 注意事项：
* 1.多个父接口当中的抽象方法如果重复，没关系。
* 2.多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写，【而且带着default关键字】。
* */
public class Demo01Relations {
    public static void main(String[] args) {
        MyInterfaceImpl im = new MyInterfaceImpl();
        im.method();//抽象
        im.methodA();//抽象
        im.methodB();//抽象
        im.methodCommon();//抽象
        im.methodDefault();//默认的，覆盖重写后是CCC
    }
}
