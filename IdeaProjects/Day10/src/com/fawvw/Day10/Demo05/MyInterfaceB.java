package com.fawvw.Day10.Demo05;

public interface MyInterfaceB {
    public abstract void mothedB();
    public abstract void mothedSame();
    public default void methodDefault(){
        System.out.println("BBB");
    }
}