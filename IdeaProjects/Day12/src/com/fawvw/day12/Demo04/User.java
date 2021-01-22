package com.fawvw.day12.Demo04;

public class User {
    private String name;
    private int id;
    private InterfaceUse interfaceUse; //接口作为成员变量

    public User() {
    }

    public User(String name, int id, InterfaceUse interfaceUse) {
        this.name = name;
        this.id = id;
        this.interfaceUse = interfaceUse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InterfaceUse getInterfaceUse() {
        return interfaceUse;
    }

    public void setInterfaceUse(InterfaceUse interfaceUse) {
        this.interfaceUse = interfaceUse;
    }

    public void work(){
        System.out.println(name);
        interfaceUse.use();//调用接口中的方法
    }
}
