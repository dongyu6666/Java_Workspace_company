package com.fawvw.Day10.Demo01;
/*
* 接口的格式：
* public interface 接口名称{//}
*
* 接口使用步骤：
* 1.接口不能直接使用，必须有一个实现类来实现接口
* 格式：
* public class 实现类名称 implements 接口名称{//}
* 2.接口的实现类必须覆盖重写（实现）接口中所有的抽象方法
* 实现：去掉abstract关键字，加上{}
* 3.创建实现类的对象，进行使用(不能用接口对象)
* */
public class Demo01Interface {
    public static void main(String[] args) {
        //不能用MyInterfaceAbstract接口对象，应该用MyInterfaceAbstractImpl实现类
        MyInterfaceAbstractImpl Impl = new MyInterfaceAbstractImpl();
        Impl.methodAbstact1();
        Impl.methodAbstact2();
        Impl.methodAbstact3();
        Impl.methodAbstact4();
    }

}
