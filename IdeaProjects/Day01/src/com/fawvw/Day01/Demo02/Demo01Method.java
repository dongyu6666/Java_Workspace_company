package com.fawvw.Day01.Demo02;

/*定义格式
public static void 方法名称()
*

调用格式：
方法名称（）；

注意事项：
1.方法定义的顺序无所谓
2.方法不能嵌套
3.方法必须调用使用
*/

public class Demo01Method {
    public static void main(String[] args) {//调用方法
    printMethod();
    }

    public static void printMethod() {//定义方法
        for (int j = 0; j < 5; j++) {
            for (int i = 1; i < 20; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
