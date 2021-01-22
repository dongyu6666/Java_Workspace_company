package com.fawvw.Day02;
//数组元素反转
public class Demo06ArrayReverse {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3,4,5};
        int min = 0; int max = arrayA.length -1;
        for (min = 0; min < max; min++, max--) {
            int temp = arrayA[min];
            arrayA[min] = arrayA[max];
            arrayA[max] = temp;
        }
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
    }
}
