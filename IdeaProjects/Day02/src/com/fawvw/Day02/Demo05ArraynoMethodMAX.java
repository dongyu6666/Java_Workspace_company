package com.fawvw.Day02;
//遍历数组，求最大值
public class Demo05ArraynoMethodMAX {
    public static void main(String[] args) {
        int [] arrayA = {100,2,3,4,6,76,8,9,9,0,101};
        int len = arrayA.length;
        int resultmax = arrayA[0];
        for (int i = 0; i < len; i++) {
            if(arrayA[i]>resultmax){
                resultmax = arrayA[i];
            }
        }
        System.out.println(resultmax);

    }
}
