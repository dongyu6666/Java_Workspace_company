package com.fawvw.Day15.Demo02;

import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
        demo01();
        demo02();
    }
    public static void demo01(){
        long first = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i+1);
        }
        long end = System.currentTimeMillis();

        System.out.println("耗时："+ (end - first)+"ms");
        
    }
    public static void demo02(){
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));

    }
}
