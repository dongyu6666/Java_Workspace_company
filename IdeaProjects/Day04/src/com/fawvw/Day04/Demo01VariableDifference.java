package com.fawvw.Day04;
/*
 * 局部变量和成员变量
 * 1、定义位置不同
 * 局部变量：在方法内部
 * 成员变量:在方法外部，直接写在类里
 * 2、作用范围不一样
 * 局部变量：只有在方法中能用，除了方法就不能用
 * 成员变量：整个类都可以用
 * 3、默认值不一样
 * 局部变量：没有默认值，必须赋值后才可以用
 * 成员变量：如果没有赋值，也会有默认值
 *
 * 4、内存的位置不一样
 * 局部变量：位于栈内存
 * 成员变量：位于堆内存
 * 5、生命周期不一样
 * 局部变量：随着方法进栈而诞生，随着方法出栈而消失（跟方法走，短一些）
 * 成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失（跟对象走，长一些）
 *
 * */
public class Demo01VariableDifference {

        public String name;//成员变量，不用赋值，本身有默认值

        //final int AGE = 1;

        public void method1(){  //这里不能写static，否则成员变量name无法调用
            int age= 0;//局部变量，必须赋值后才能用
            System.out.println(age);
            System.out.println(name);
        }

        public void method2(int param){ //方法的参数就是局部变量

            //System.out.println(age);//这个方法中，就不可以用method1的局部变量
            System.out.println(name);//这里不能写static，否则成员变量name无法调用
            System.out.println(param);//在这里没报错是因为：参数在方法调用的时候，必然会被赋值，所以没被赋值也没有报错
        }
    };

