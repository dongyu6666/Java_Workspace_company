package com.fawvw.Day15.Demo01;

import java.util.Calendar;
import java.util.Date;
/*    Calendar类的常用成员方法:
public int get(int field)：返回给定日历字段的值。
public void set(int field, int value)：将给定的日历字段设置为给定值。
public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。*/
public class Demo02Calendar {
    public static void main(String[] args) {
    demo01();
    demo02();
    demo03();
    demo04();
    }

    public static void demo01(){ //public int get(int field)：返回给定日历字段的值。
    //使用getInstance方法获取Calendar对象

        /*成员方法的参数:
        int field:日历类的字段,可以使用Calendar类的静态成员变量获取
        public static final int YEAR = 1;	年
        public static final int MONTH = 2;	月
        public static final int DATE = 5;	月中的某一天
        public static final int DAY_OF_MONTH = 5;月中的某一天
        public static final int HOUR = 10; 		时
        public static final int MINUTE = 12; 	分
        public static final int SECOND = 13;	秒*/

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(year+"/"+month);
        int date = c.get(Calendar.DATE);
        int date2 = c.get(Calendar.DAY_OF_MONTH);//一样的
        System.out.println(year+"/"+month+1+"/"+date);
        System.out.println(year+"/"+month+1+"/"+date2);
        System.out.println("=================");
    }
    public static void demo02(){//public void set(int field, int value)：将给定的日历字段设置为给定值。
        Calendar c = Calendar.getInstance();
        c.set(1990,10,10);
        System.out.println(c.get(Calendar.YEAR)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.DATE));
        /*c.set(Calendar.YEAR,1990);
        c.set(Calendar.MONTH,10);
        c.set(Calendar.DATE,10);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year+"/"+month+"/"+date);*/
        System.out.println("=================");
    }
    public static void demo03(){//public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,2);
        c.add(Calendar.MONTH,-5);
        System.out.println(c.get(Calendar.YEAR)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.DATE));
        System.out.println("=================");

    }
    public static void demo04(){//public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。*/
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }
}
