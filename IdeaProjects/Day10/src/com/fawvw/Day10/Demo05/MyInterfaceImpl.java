package com.fawvw.Day10.Demo05;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {

    @Override
    public void mothedA() {
        System.out.println("覆盖重写A方法");
    }
    @Override
    public void mothedB() {
        System.out.println("覆盖重写B方法");
    }
    @Override
    public void mothedSame() {
        System.out.println("覆盖重写了AB接口都有的方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("不是AAA也不是BBB，对重复的默认方法，在实现类要对冲突的默认方法进行覆盖重写");
    }


}
