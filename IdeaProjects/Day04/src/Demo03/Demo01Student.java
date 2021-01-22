package Demo03;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("娜扎");
        stu1.setAge(30);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());

        Student stu2 = new Student("热巴",20);
        System.out.println("她是"+stu2.getName() + "，今年"+stu2.getAge());

        stu2.setAge(21);
        System.out.println("她是"+stu2.getName() + "，明年"+stu2.getAge());

    }
}
