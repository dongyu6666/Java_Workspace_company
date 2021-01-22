package com.fawvw.Day05.Demo01;
/*键盘输入两个int数字求和*/
import java.util.Scanner;
public class Demo02Scannersum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入第一个数：");
        int s1 = sc.nextInt();
        System.out.print("输入第二个数：");
        int s2 = sc.nextInt();
        int s = s1 + s2;
        System.out.println("和值为："+ s);

    }
}
