package com.fawvw.Day09.Demo04;
/*
* 方法覆盖重写的注意事项：
* 1、必须保证父子类之间方法的名称相同，参数列表也相同
* @Override：写在方法前，用来检测是不是有效的正确覆盖重写,起到提示作用
* 2、子类方法的返回值必须【小于等于】父类方法的返回值范围
* 提示：java.lang.Object类是所有类的公共最高父类，String就是它的子类
* 3、子类方法的权限必须【大于等于】父类方法权限修饰符
* 提示：public > protected > (default) > private
* 其中 (default)不是关键字，就是留空而已
*
* 2和3建议都写一样的
* */
public class Demo01Override {
}
