package com.fawvw.Day11.Demo02;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.poweron();

        USB usbMouse = new Mouse();//实现类向上转型成为接口类型，就是多态
        computer.useDevice(usbMouse);

        Keyboard usekeyboard = new Keyboard();
        computer.useDevice(usekeyboard);//另一种写法,也实现了向上转型

    }
}
