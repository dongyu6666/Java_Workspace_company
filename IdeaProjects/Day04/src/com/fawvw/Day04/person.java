package com.fawvw.Day04;
/*
* private关键字用来将需要保护的成员变量进行修饰
* 一旦用private进行修饰，本类中可以随意访问
* 但是超出本类就不能直接访问了
* 间接访问private成员变量，就定义一对儿setter/getter方法
* 必须是setXxx,getXxx
* setter：有参数，无返回值，参数类型和成员变量对应
* getter: 无参数，有返回值，返回值类型和成员变量对应
* */
public class person {
    private String name;
    private int age;//private关键字

    public void show(){
        System.out.println("我叫"+name+"，我年龄是"+age);
    }
/*===========================================================*/
    public void setName(String ming){//set,有参数，无返回
        int len = ming.length();
        if(len>=3){
            name = ming;
        }else{
            System.out.println("姓名不合理");
        }
    }
    public String getName(){//get,无参数，有返回
        return name;
    }
/*===========================================================*/
    public void setAge(int num){
        if(num >=0 && num <=150){
            age = num;
        }else {
            System.out.println("数据不合理");
        }
    }
    public int getAge(){
        return age;
    }
}
