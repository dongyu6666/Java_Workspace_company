package Demo03;
//打印指定次数的“Hi FAWVW”
public class Demo03Methodtime {
    public static void main(String[] args) {
        time(8);
    }
    public static void time(int j){
        for (int i = 1; i <= j; i++) {
            System.out.println("Hi FAWVW_"+i);
        }
    }

}
