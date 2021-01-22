package Demo04;
//方法的重载（overload）,好处是只需要记住唯一的方法名称
/*
* 方法重载与下列有关：
* 1、参数个数不同
* 2、参数类型不同
* 3、参数的多类型顺序不同
*
* 方法重载与下列无关：
* 1.与参数名字无关
* 2.与方法的返回值类型无关
* */
public class Demo04MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(4,6));
        System.out.println(sum(4,6,7));

    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b,int c){
        return a+b+c;
    }
    public static int sum(int a, int b,int c,int d){
        return a+b+c+d;
    }
}
