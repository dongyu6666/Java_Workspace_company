package com.fawvw.Day10.Demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbstract() {
        System.out.println("实现抽象方法BBB");
    }

    @Override
    public void methodAbstractDefault() {
        System.out.println("实现类B，覆盖重写接口默认方法");
    }
}
