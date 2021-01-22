package com.fawvw.Day11.Demo02;

public class Computer {
    public void poweron(){
        System.out.println("电脑开机");
    }
    public void poweroff(){
        System.out.println("电脑关机");
    }
    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;//向下转型，父又变子
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }
}
