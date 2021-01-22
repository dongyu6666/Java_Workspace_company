package com.fawvw.Day05.Demo03;

import java.util.ArrayList;

/*
Arraylist常用方法：
public boolean add(E e):向集合当中添加元素，参数类型和泛型一致
备注：对于ArrayList的add添加动作一定成功，返回值可忽略
但对于其他集合，add就不一定成功，用alt+回车看返回值
public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素
public int size():获取集合的长度，返回值就是集合的元素个数
*/
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //add
        boolean success = list.add("Alex");
        System.out.println(list);
        System.out.println("添加是否成功："+success);
        list.add("Dennis");
        list.add("Matus");
        list.add("Arthur");
        System.out.println(list);
        //get
        System.out.println(list.get(3));
        //remove
        String removedperson = list.remove(0);
        System.out.println("被删除的人是："+ removedperson);
        System.out.println(list);
        //size
        int size = list.size();
        System.out.println("集合长度是："+ size);
    }
}
