package com.fawvw.Day10.Demo06;
/*
* 这个子接口有4个method:
* methodA/methodB/methodCommon/mothed
* */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {
    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("CCC");
    }
}
