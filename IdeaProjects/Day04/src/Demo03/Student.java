package Demo03;
/*
* 一个标准的类通常要有下面4个部分
* 1、所有成员变量都要使用private关键字修饰
* 2、每一个成员变量都编写一对getter/setter方法
* 3、编写一个无参的构造方法
* 4、编写一个全参的构造方法
* */
public class Student {
    //private 成员变量
    private String name;
    private int age;
/*=======无参构造方法=============*/
    public Student() {
    }
/*=======全参构造方法=============*/
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
/*=======setter/getter=============*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
