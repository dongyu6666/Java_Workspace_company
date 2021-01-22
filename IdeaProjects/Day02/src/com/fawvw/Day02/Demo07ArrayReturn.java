package com.fawvw.Day02;
/*
* 数组作为方法的参数，传递进去的就是数组的地址值
* 数组作为方法的返回值，返回的也是数组的地址值
*
* */
public class Demo07ArrayReturn {
    public static void main(String[] args) {
        int[] arrayA = {1,2,6};
        System.out.println(arrayA);
        System.out.println("========================");
        System.out.println(caculate(arrayA));
        System.out.println("========================");
        System.out.println(caculate(arrayA)[0]);
        System.out.println("========================");
        System.out.println(caculate(arrayA)[1]);
        System.out.println("========================");
    }
    public static int[] caculate(int[] arrayA){
        int sum = 0;
        for (int i = 0; i < arrayA.length; i++) {
            sum = sum + arrayA[i];
        }
        int aver = sum / arrayA.length;
        int result[] = {sum, aver};
        return result;
    }
}
