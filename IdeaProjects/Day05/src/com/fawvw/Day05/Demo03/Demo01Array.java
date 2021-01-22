package com.fawvw.Day05.Demo03;
//对象数组，定义一个数组，存储3个Person对象
public class Demo01Array {
    public static void main(String[] args) {
        Person[] ArrayA = new Person[3];

        Person a = new Person("Alex1",18);
        Person b = new Person("Alex2",19);
        Person c = new Person("Alex3",20);

        ArrayA[0] = a;
        ArrayA[1] = b;
        ArrayA[2] = c;
        System.out.println(a);//a只是地址值
        System.out.println(a.getName());

    }
}
