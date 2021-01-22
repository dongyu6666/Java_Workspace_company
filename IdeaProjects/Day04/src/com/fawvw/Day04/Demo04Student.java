package com.fawvw.Day04;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(19);
        stu.setMale(false);

        System.out.println("姓名是：" + stu.getName());
        System.out.println("年龄是：" + stu.getAge());
        System.out.println("是男的么？" + stu.isMale());
    }
}
