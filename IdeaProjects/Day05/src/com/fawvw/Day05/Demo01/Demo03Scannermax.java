package com.fawvw.Day05.Demo01;
/*键盘输入三个数字求最大值*/
import java.util.Scanner;
public class Demo03Scannermax {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("输入第一个数：");
    int m1 = sc.nextInt();
    System.out.print("输入第二个数：");
    int m2 = sc.nextInt();
    System.out.print("输入第三个数：");
    int m3 = sc.nextInt();

    int[] arrayA = {m1,m2,m3};
    int len = arrayA.length;
    int max = arrayA[0];
        for(int i = 0; i < len-1; i++){
            if(arrayA[i+1] > arrayA[i]){
                max = arrayA[i+1];
            }else {
                max = arrayA[i];
            }
        }
        System.out.println("最大值是："+ max);
    }
}
