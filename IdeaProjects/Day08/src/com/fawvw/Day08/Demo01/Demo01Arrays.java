package com.fawvw.Day08.Demo01;

import java.util.Arrays;

/*
* java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组常见的操作。
* public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3...]）
* public static void sort(数组)：按照默认升序（从小到大）对数组的元素进行排序
* 备注：
* 1.如果是数值，sort默认按照升序从小到大
* 2.如果是字符串，sort默认按照升序从小到大
* 3、如果是自定义类型，该自定义的类需要有Comparable或者Comparator接口的支持（今后学习）
* */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] ArrayA = {10,20,30};
        //将int[]数组按照默认格式变成字符串
        String str = Arrays.toString(ArrayA);
        System.out.println(str);

        int[] ArrayB = {10,1,20,4,30};
        Arrays.sort(ArrayB);
        System.out.println(Arrays.toString(ArrayB));

        String[] ArrayC = {"bbb","aaa","ccc","aa"};
        Arrays.sort(ArrayC);
        System.out.println(Arrays.toString(ArrayC));

    }
}
