package com.fawvw.Day02;
//冒泡排序
public class Demo07ArrayOrder {
    public static void main(String[] args) {
        int[] arrayA = {1,4,8,2,6,3};
        for(int i = 0; i < arrayA.length-1; i++){
            for(int j=0; j < arrayA.length-i-1; j++){
                int temp;
                if (arrayA[j] > arrayA[j+1]){
                    temp = arrayA[j+1];
                    arrayA[j+1] = arrayA[j];
                    arrayA[j] = temp;
                }
            }
        }
        for(int k = 0; k < arrayA.length; k++){
            System.out.println(arrayA[k]);
        }
    }
}
