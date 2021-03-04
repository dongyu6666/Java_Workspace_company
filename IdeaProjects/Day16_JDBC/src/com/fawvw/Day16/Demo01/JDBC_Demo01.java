package com.fawvw.Day16.Demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/*
* JDBC
* */
public class JDBC_Demo01 {
    public static void main(String[] args) throws Exception {
        //1、导入驱动jar包
        //2、注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取数据库的连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://10.220.15.230:3306/test", "Liang.Dongyu", "dsa123");
        //4.定义sql语句
        String sql = "update test_table set version = 6 where id = 1";
        //5.获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();
    }
}
