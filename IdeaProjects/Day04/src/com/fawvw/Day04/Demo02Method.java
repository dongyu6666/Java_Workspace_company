package com.fawvw.Day04;
/*
* 面向对象三大特征：封装、继承、多态。
* 封装性在java当中的体现：
* 1、方法就是一种封装
* 2、关键字private也是一种封装
*
* 封装就是将一些细节信息隐藏其他，对于外界不可见
*
* */
public class Demo02Method {
    public static void main(String[] args) {
        int[] arrayA= {1,2,4,56,76,8};
        int result = getmax(arrayA);
        System.out.println(result);

    }

    public static int getmax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }

        return max;
    }
}
