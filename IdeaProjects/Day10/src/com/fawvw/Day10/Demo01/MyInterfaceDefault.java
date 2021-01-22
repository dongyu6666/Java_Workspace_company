package com.fawvw.Day10.Demo01;
/*
* 接口的默认方法(为了解决接口升级)：
* public default 返回值类型 方法名称（参数列表）{方法体}
*
* */
public interface MyInterfaceDefault {

    //抽象方法
    public abstract void methodAbstract();

    // 新的抽象方法，必须是默认方法
    public default void methodAbstractDefault(){
        System.out.println("在接口中添加新的抽象方法，是默认方法");
    };
}
