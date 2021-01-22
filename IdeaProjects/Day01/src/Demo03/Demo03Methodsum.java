package Demo03;
//求和1到100
public class Demo03Methodsum {
    public static void main(String[] args) {
        System.out.println(sum100());
    }
        public static int sum100(){
            int result = 0;
            for (int i = 1; i < 101; i++) {
                result = result + i;
            }
            return result;
        }


}
