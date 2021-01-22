package com.fawvw.Day02;
//遍历数组，求最大值
public class Demo05ArrayMethodMAX {
    public static void main(String[] args) {
        int [] arrayA = {100,2,3,4,6,76,8,9,9,0,101};
        int result = max(arrayA);
        System.out.println(result);
    }
    public static int max(int arrayA[]){
        int len = arrayA.length;
        int resultmax = arrayA[0];
        for (int i = 0; i < len-1; i++) {

            if(arrayA[i+1]>resultmax){
                resultmax = arrayA[i+1];
            }
            else {
                resultmax = resultmax;
            }

        }
        return resultmax;
    }
}
