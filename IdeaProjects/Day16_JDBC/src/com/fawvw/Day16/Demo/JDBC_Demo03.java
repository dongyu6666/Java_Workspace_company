package com.fawvw.Day16.Demo;

import java.sql.*;

/*
--ResultSet executeQuery(String sql)  ：执行DQL（select)语句
需要学习ResultSet方法
*ResultSet：结果集对象,封装查询结果
			* boolean next(): 游标向下移动一行，判断当前行是否是最后一行末尾(是否有数据)，如果是，则返回false，如果不是则返回true
			* getXxx(参数):获取数据
			* Xxx：代表数据类型   如： int getInt() ,	String getString()
			* 参数：	1. int：代表列的编号,从1开始   如： getString(1)
					2. String：代表列名称。 如： getDouble("balance")
* */
public class JDBC_Demo03
{
        public static void main(String[] args) {
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;
            try {
                //注册驱动
                Class.forName("com.mysql.cj.jdbc.Driver");
                //定义sql

                String sql = "SELECT d.id,d.de_name,b.bu_name,k.ke_name,z.zu_name,n.id,n.name,n.card_id\n" +
                        "FROM `name` AS n \n" +
                        "INNER JOIN `zu` AS z ON z.id = n.zu_id\n" +
                        "INNER JOIN `ke` AS k ON k.id = z.ke_id\n" +
                        "INNER JOIN `bu` AS b ON b.id = k.bu_id\n" +
                        "INNER JOIN `department` AS d ON d.id = b.de_id\n" +
                        "\n" +
                        "WHERE n.id =  '10'; ";


                //获取connection对象
                conn = DriverManager.getConnection("jdbc:mysql://10.220.15.230:3306/test", "Liang.Dongyu", "dsa123");
                //获取执行sql的对象statement
                stmt = conn.createStatement();
                //执行sql
                //int result = stmt.executeUpdate(sql);
                rs = stmt.executeQuery(sql);

                while (rs.next()){
                    int id = rs.getInt(1);
                    String de = rs.getString(2);
                    String name = rs.getString(7);
                    System.out.println(id);
                    System.out.println(de);
                    System.out.println(name);
                }
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }finally {
                if(rs!=null){
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
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
