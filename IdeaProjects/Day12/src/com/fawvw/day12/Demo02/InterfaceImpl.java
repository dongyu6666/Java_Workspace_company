package com.fawvw.day12.Demo02;

public class InterfaceImpl implements MyInterface {

    @Override
    public void method() {
        System.out.println("实现类覆盖重写接口的方法");
    }

    @Override
    public void method2() {
        System.out.println("实现类覆盖重写接口的方法222");
    }
}
