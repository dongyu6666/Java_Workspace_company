package com.fawvw.Day05.Demo01.Demo02;
/*匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
* 匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象
* 使用建议：如果一个对象只使用唯一的一次，就可以用匿名对象
* */
public class Demo01Anomymous {
    public static void main(String[] args) {
        person one = new person();
        one.name = "Alex";
        one.showname();//我是：Alex
/*==============匿名对象=============*/
        new person().name = "Dennis";
        new person().showname();//我是：null
    }
}
