package com.fawvw.Day05.Demo03;

import java.util.ArrayList;

/*数组长度不可改变
ArrayList集合的长度可变
<E>代表泛型，也就是装在集合当中的所有元素，全都是统一的什么类型
注意：泛型只能是引用类型，不能是基本类型
注意事项：对应ArrayList直接打印，不是地址值，而是内容。
如果内容是空，得到的是空的中括号：[]
*/
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合名称是list,里面都是String的类型
        //备注：从JDK 1.7+开始，右侧的<>可以不写内容，但是<>必须要写
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]
        //向集合中添加一些数据，需要用add方法
        list.add("Alex");
        list.add("Dennis");
        list.add("Matus");
        System.out.println(list);
        //从集合中获取元素：get，索引值从0开始
        String name = list.get(2);
        System.out.println(name);
        //从集合中删除元素，remove
    }
}

