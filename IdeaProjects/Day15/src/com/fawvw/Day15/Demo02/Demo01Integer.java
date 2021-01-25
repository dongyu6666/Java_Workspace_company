package com.fawvw.Day15.Demo02;

public class Demo01Integer {
    public static void main(String[] args) {
        //装箱:把基本类型的数据,包装到包装类中(基本类型的数据->包装类),Integer.valueOf
        Integer s = new Integer(1);
        System.out.println(s);
        Integer s2 = new Integer("111");
        System.out.println(s2);
        System.out.println("=====================");
        //或者用静态方法
        Integer aaa = Integer.valueOf(123);
        System.out.println(aaa);
        Integer bbb = Integer.valueOf("123");
        System.out.println(bbb);
        //拆箱:在包装类中取出基本类型的数据(包装类->基本类型的数据)
        System.out.println("=====================");
        int i = aaa.intValue();
        System.out.println(i);
    }
}
