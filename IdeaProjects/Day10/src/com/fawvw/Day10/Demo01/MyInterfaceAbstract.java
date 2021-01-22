package com.fawvw.Day10.Demo01;
/*
* 接口定义抽象方法：
* public abstract 返回值类型 方法名称（参数列表）；
*
* 注意事项：
* 1、接口中抽象方法，修饰符是两个固定的关键字： public abstract，初学尽量不省略
* 2、方法的三要素随意定义
 * */
public interface MyInterfaceAbstract {//以下都是正确的抽象方法
    public abstract void methodAbstact1();
    abstract void methodAbstact2();
    public void methodAbstact3();
    void methodAbstact4();

}
