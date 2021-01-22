package Demo03;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

//定义一个方法，判断两个数字是否相同
public class Demo03Methodsame {
    public static void main(String[] args) {

        System.out.println(isSame(12,14));
        System.out.println(isSame(12,12));
    }
        public static boolean isSame(int a, int b){
//        boolean same;
//            if (a == b){
//                same = true;
//            }
//            else{
//                same = false;
//            }
//        return same;

            return a==b;
        }


}
