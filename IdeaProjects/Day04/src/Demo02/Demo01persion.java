package Demo02;

public class Demo01persion {
    public static void main(String[] args) {
        person ren = new person();
        ren.name = "爸爸";
        ren.sayhello("儿子");
        System.out.println(ren);//打印出的地址值，和类中this地址值一样
    }
}
