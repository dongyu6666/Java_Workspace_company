package Demo02;
/*
* 当方法的局部变量和类的成员变量重名时，就近原则，优先用局部变量
* 如果访问类的成员变量，格式为： this.成员变量名
* 通过谁调用的方法，谁就是this
* */
public class person {
    String name;//自己的名，是成员变量

    public void sayhello(String name){//name是参数
        System.out.println(name+"，你好，我是"+this.name);
        System.out.println(this);
    }
}
