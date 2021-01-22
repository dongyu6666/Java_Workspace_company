package com.fawvw.Day09.Demo05;

public class newPhone extends oldPhone {
    public void Zi(){
        System.out.println("子类test");
    }
    @Override
    public void show() {
        super.show();//把父类的方法拿过来直接用
        System.out.println("功能+1");
        System.out.println("功能+2");
    }
}
