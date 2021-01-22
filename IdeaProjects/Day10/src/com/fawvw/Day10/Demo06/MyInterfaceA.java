package com.fawvw.Day10.Demo06;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();
    public default void methodDefault(){
        System.out.println("AAA");
    }
}
