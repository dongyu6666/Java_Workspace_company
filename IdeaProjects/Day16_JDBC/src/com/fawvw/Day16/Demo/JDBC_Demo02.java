package com.fawvw.Day16.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 --int executeUpdate(String sql) ：执行DML（insert、update、delete）语句、DDL(create，alter、drop)语句
 返回值：影响的行数，可以通过这个影响的行数判断DML语句是否执行成功 返回值>0的则执行成功，反之，则失败。
 --ResultSet executeQuery(String sql)  ：执行DQL（select)语句
*
* */
public class JDBC_Demo02 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //定义sql
            //String sql = "insert department values('4','SU')";
            //String sql = "UPDATE `department` SET `de_name`='SU' WHERE `id` = 4";
            //String sql = "delete from `department` where  `id` = 4";
            String sql = "ALTER TABLE `test`.`department` ADD COLUMN `no4` INT(2) NULL ; ";


            //获取connection对象
            conn = DriverManager.getConnection("jdbc:mysql://10.220.15.230:3306/test", "Liang.Dongyu", "dsa123");
            //获取执行sql的对象statement
            stmt = conn.createStatement();
            //执行sql
            int result = stmt.executeUpdate(sql);
            System.out.println(result);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
