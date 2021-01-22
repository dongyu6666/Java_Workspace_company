package com.fawvw.day12.Demo02;
/*
* 匿名内部类：
* 接口名称 xxx = new 接口名称（）{}；
* */
public class Demo01Main {
    public static void main(String[] args) {
/*        MyInterface obj = new InterfaceImpl();//多态，向上转型，子变父
        obj.method();*/
    MyInterface obj2 = new MyInterface() {
        @Override
        public void method() {
            System.out.println("匿名内部类实现方法AAA");
        }
        @Override
        public void method2() {
            System.out.println("匿名内部类实现方法BBB");
        }
    };
    obj2.method();
    obj2.method2();

    MyInterface obj3 = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现方法CCC");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现方法DDD");
            }
        };
        obj3.method();
        obj3.method2();

        System.out.println("===========================");
    new MyInterface() {
        @Override
        public void method() {
            System.out.println("匿名内部类实现方法EEE");
        }
        @Override
        public void method2() {
            System.out.println("匿名内部类实现方法FFF");
        }
    }.method();
        System.out.println("=============");
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现方法EEE");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现方法FFF");
            }
        }.method2();
    }
}

