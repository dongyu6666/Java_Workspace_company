package com.fawvw.Day05.Demo03;

import java.util.ArrayList;

/* 存储自定义对象
* 题目：
* 自定义4个学生对象，添加到集合，并遍历
*
* */
public class Demo07ArrayListStudent {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> list = new ArrayList<Student>();
        //创建学生对象
        Student st1 = new Student("A",18);
        Student st2 = new Student("B",19);
        Student st3 = new Student("C",16);
        Student st4 = new Student("D",17);
        //添加到集合
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student result = list.get(i);
            System.out.println("姓名是："+ result.getName()+"，年龄是："+ result.getAge());
        }
    }
}
