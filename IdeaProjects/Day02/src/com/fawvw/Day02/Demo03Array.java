package com.fawvw.Day02;
/*
* 注意事项：
* 静态初始化标准格式可以拆分成两个步骤
* int[] ArrayA;
* ArrayA = new int[]{11,21,31};
* 建议：如果不确定数组中具体内容，用动态，否则用静态
* */
public class Demo03Array {
    public static void main(String[] args) {
        //静态可省略写成：
        int[] ArrayA = {1,2,3};
        //静态拆成两步：
        int[] ArrayB;
        ArrayB = new int[]{11,21,31};
    }

}
