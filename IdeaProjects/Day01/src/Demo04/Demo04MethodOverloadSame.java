package Demo04;
//比较两个数据是否相等
//分别比较byte,int,short,long
public class Demo04MethodOverloadSame {

    public static void main(String[] args) {
        byte a = 1;
        byte b = 1;
        System.out.println(overloadSame(a,b));

        System.out.println(overloadSame(5,7));

        System.out.println(overloadSame((short)5,(short)8));

        System.out.println(overloadSame((long)5,(long)8));

        System.out.println(overloadSame(5L,5L));

        //overloadSame()
    }
    public static boolean overloadSame(int a, int b){
        System.out.println("用int方法");
        boolean same;
        if (a == b){
            same = true;
        }
        else {
            same = false;
        }
        return same;
    }

    public static boolean overloadSame(short a, short b){
        System.out.println("用short方法");
        boolean same;
        if (a == b){
            same = true;
        }
        else {
            same = false;
        }
        return same;
    }

    public static boolean overloadSame(long a, long b){
        System.out.println("用long方法");
        boolean same;
        if (a == b){
            same = true;
        }
        else {
            same = false;
        }
        return same;
    }
    public static boolean overloadSame(byte a, byte b){
        System.out.println("用byte方法");
        boolean same;
        if (a == b){
            same = true;
        }
        else {
            same = false;
        }
        return same;
    }
}
