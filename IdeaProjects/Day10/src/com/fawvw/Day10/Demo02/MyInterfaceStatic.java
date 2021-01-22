package com.fawvw.Day10.Demo02;
/*
* 从Java8开始，接口当中允许使用定义静态方法
* 格式：
* public static 返回值类型 方法名称（参数列表）{方法体}
* 提示：就是把abstract或者default换成static，带上方法体
* */
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是接口的静态方法");
    }
}
