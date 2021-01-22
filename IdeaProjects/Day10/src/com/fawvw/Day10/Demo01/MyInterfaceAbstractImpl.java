package com.fawvw.Day10.Demo01;
//这是接口实现类的对象，把接口中的所有抽象方法都覆盖重写
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void methodAbstact1() {
        System.out.println("方法1");
    }

    @Override
    public void methodAbstact2() {
        System.out.println("方法2");
    }

    @Override
    public void methodAbstact3() {
        System.out.println("方法3");
    }

    @Override
    public void methodAbstact4() {
        System.out.println("方法4");
    }
}
