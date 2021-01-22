package Demo02;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();//无参构造
        Student stu2 = new Student("沙拉",3);//全参构造
        System.out.println("我是"+stu2.getName()+",我今年"+stu2.getAge()+"岁啦！");

        stu2.setAge(4);
        System.out.println("我是"+stu2.getName()+",我明年"+stu2.getAge()+"岁啦！");
    }
}
