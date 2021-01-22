package com.fawvw.Day07.Demo01;
/*
* 如果一个成员变量使用了Static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享同一个类。
*
* */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("张三",19);
        one.room = "101教室";
        Student two = new Student("李四",20);
        System.out.println("姓名："+one.getName()+
                "年龄："+one.getAge()+" 教室："+one.room+ " 学号："+ one.getId());
        System.out.println("姓名："+two.getName()+
                "年龄："+two.getAge()+" 教室："+two.room+" 学号："+ two.getId());
    }

}

