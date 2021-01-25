package com.fawvw.Demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入您的出生日期（格式为yyyy/MM/dd）:");
        Scanner sc = new Scanner(System.in);
        String bornTime = sc.next();

        //把字符串变成Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date parse = sdf.parse(bornTime); //parse就是Date格式了

        //把Date转换成毫秒值
        //Date date2 = new Date();
        long borntimeHaomiao = parse.getTime();

        //获取当前Date
        Date currentdate = new Date();
        //转换成当前毫秒
        long currentHaomiao = currentdate.getTime();
        long Delta = currentHaomiao - borntimeHaomiao;
        System.out.println(Delta/1000/60/60/24);
    }

}
