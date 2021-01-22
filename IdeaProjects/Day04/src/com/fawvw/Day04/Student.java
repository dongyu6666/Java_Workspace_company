package com.fawvw.Day04;
//boolean基本类型的getter是isXxx格式，setter的方法setXxx不变
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setName(String ming){
        name = ming;
    }
    public String getName(){
        return name;
    }

    public void setAge(int nian){
        age = nian;
    }
    public int getAge(){
        return age;
    }

    public void setMale(boolean xingbie){
        male = xingbie;
    }
    public boolean isMale(){
        return male;
    }

}
