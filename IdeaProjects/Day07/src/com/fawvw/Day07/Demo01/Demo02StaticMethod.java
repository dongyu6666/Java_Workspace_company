package com.fawvw.Day07.Demo01;
/*
* 一旦使用Static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类。
* 如果没有Static关键字，那么必须首先创建对象，然后通过对象才能使用它。
* 如果有Static关键字，不需要创建对象，直接通过类名称就可以使用它
* 无论是成员变量、还是成员方法，如果有了static,都推荐使用类名称进行调用
* 成员变量：类名称.静态变量
* 静态方法：类名称.静态方法（）
* 注意事项：
* 1、静态只能访问静态，静态不能访问非静态
* 因为在内存当中，是先有的静态内容，后有的非静态内容
* 2、静态方法中不能用this
* 原因：this代表当前对象，通过谁调用的方法，谁就是当前对象
*
* */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();//首先创建对象
        //然后才能使用没有static关键字的内容
        obj.method();

        //对于静态方法，可以通过对象名进行调用，也可以直接通过类名称来调用
        obj.methodStatic();//也对，但是不推荐这种用对象名的,其实在编译后也会被javac翻译成  “类名称.静态方法名”
        MyClass.methodStatic();//推荐直接通过类名称来调用的

        //对应本类当中的静态方法，可以省略类名称
        myMethod();//等效
        Demo02StaticMethod.myMethod();//等效
    }

    public static void myMethod(){
        System.out.println("自己的方法");
    }

}
