package com.fawvw.Day06.Demo01;
/*
*题目：
* 定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]
*
* */
public class Demo07StringPractise1 {
    public static void main(String[] args) {
        int[] ArrayA = {1,2,3};
        arraytoStringMethod(ArrayA);
    }

    public static String arraytoStringMethod(int[] Array){
        String st1 = "[";
        String st2 = "]";
        String st3 = "word";
        String st_temp = "";

        for (int i = 0; i < Array.length; i++) {
            if(i < Array.length-1){
                st_temp +=st3 + Array[i] + "#";
            }else{
                st_temp +=st3 + Array[i] + st2;
            }
        }
        System.out.println(st1+st_temp);
        return st1+st_temp;
    }
}
