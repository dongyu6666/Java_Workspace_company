package Demo02;
/*
* 构造方法是专门用来创建对象的方法，当用new创建对象的时候，就是构造方法
* 格式：
* pubLic 类名称（参数类型 参数名称）{
*   方法体
* }
* 注意事项：
* 1、构造方法的名称必须和所在的类的名称完全一样，包括大小写
* 2、构造方法不要写返回值类型，连void都不写
* 3、构造方法不能return一个具体的返回值
* 4、如果没有编写任何构造方法，那么编译器会默认赠送一个构造方法，没有参数，方法体也是空的
*   赠送一个：public Student(){}
* 5、一旦编写了至少一个构造方法，那么编译器就不再赠送了
* 6、构造方法也是可以重载的（重载：方法名称相同，参数列表不同）
*
* */
public class Student {
    //成员变量
    private String name;
    private int age;
    //无参构造方法
    public Student(){
        System.out.println("无参构造方法执行啦");
    }
    //全参构造方法
    public Student(String name, int age){
        System.out.println("全参构造方法执行啦");
        this.name = name;
        this.age = age;
    }
    //setter getter方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        //return this.name;    和下面有什么区别？
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
