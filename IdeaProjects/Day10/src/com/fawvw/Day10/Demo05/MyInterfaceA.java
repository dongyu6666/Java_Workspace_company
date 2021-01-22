package com.fawvw.Day10.Demo05;

public interface MyInterfaceA {
    public abstract void mothedA();

    public abstract void mothedSame();

    public default void methodDefault(){
        System.out.println("AAA");
    }
}