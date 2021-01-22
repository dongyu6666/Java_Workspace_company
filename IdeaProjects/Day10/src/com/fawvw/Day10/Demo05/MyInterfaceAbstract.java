package com.fawvw.Day10.Demo05;

public abstract class MyInterfaceAbstract implements MyInterfaceA,MyInterfaceB {
    //如果实现类没有覆盖重写所有接口中的所有抽象方法，那么实现类就必须是一个抽象类, 所以加个abstract变成抽象类就行
   /* @Override
    public void mothedA() {

    }*/

    @Override
    public void mothedB() {

    }

    @Override
    public void mothedA() {

    }

    @Override
    public void mothedSame() {

    }

    @Override
    public void methodDefault() {

    }
}
