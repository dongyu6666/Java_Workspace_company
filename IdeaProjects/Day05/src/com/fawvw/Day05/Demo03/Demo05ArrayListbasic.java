package com.fawvw.Day05.Demo03;
import java.util.ArrayList;
/*
* 如果需要向集合ArrayList当中存储基本数据类型，必须使用基本类型对应的“包装类”
* 基本类型  包装类（引用类型的包装类都位于java.lang包下）
* byte      Byte
* short     Short
* int       Integer------特殊
* long      Long
* float     Float
* double    Double
* char      Character------特殊
* boolean   Boolean
*
从JDK1.5+开始，支持自动装箱、自动拆箱
自动装箱：基本类型————包装类型
自动拆箱：包装类型————基本类型—
 */
public class Demo05ArrayListbasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //ArrayList<int> list2 = new ArrayList<>();错误，泛型只能是引用类型，不能是基本类型
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        System.out.println(list2);
        Integer intXXX = list2.get(2);
        System.out.println(intXXX);


    }
}
