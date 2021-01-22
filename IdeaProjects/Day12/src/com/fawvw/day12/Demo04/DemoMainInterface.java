package com.fawvw.day12.Demo04;

public class DemoMainInterface {
    public static void main(String[] args) {
        User user = new User();
        user.setName("规划人");
        //UseImpl use000 = new UseImpl();
        user.setInterfaceUse(new UseImpl());
        user.work();
        System.out.println("====================");
        //使用匿名内部类
        InterfaceUse interfaceUse = new InterfaceUse() {
            @Override
            public void use() {
                System.out.println("特别努力的工作ing");
            }
        };
        user.setInterfaceUse(interfaceUse);
        user.work();

        System.out.println("====================");
        //同时使用匿名内部类和匿名对象


        user.setInterfaceUse(new InterfaceUse() {
            @Override
            public void use() {
                System.out.println("特别特别特别努力的工作ing");
            }
        });

        user.work();

    }
}
