package com.fawvw.Day16.Demo;

import com.fawvw.Day16.Domain.name;
import com.fawvw.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * * 定义一个方法findall，查询name表的数据将其封装为对象，然后装载集合，返回。
 */
public class JDBC_Demo_tool {

    public static void main(String[] args) throws SQLException {
        List<name> list = new JDBC_Demo_tool().findall();
        System.out.println(list);
    }

    public List<name> findall() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<name> list = null;
        try {
            //注册驱动
           // Class.forName("com.mysql.cj.jdbc.Driver");
            //定义sql
            String sql = "SELECT * FROM `name`";
            //获取connection对象
            //conn = DriverManager.getConnection("jdbc:mysql://10.220.15.230:3306/test", "Liang.Dongyu", "dsa123");
            JDBCUtils.getConnection();
            //获取执行sql的对象statement
            stmt = conn.createStatement();
            //执行sql
            //int result = stmt.executeUpdate(sql);
            rs = stmt.executeQuery(sql);
            //6.遍历结果集，封装对象，装载集合
            name name = null;
            list = new ArrayList<name>();

            while (rs.next()){
                int id = rs.getInt("id");
                String name2 = rs.getString("name");
                String card_id = rs.getString("card_id");

                // 创建name的对象,然后赋值
                name = new name();
                name.setId(id);
                name.setName(name2);
                name.setCard_id(card_id);
                //装载集合
                list.add(name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
                /*if(rs != null){
                    rs.close();
                }
                if(stmt != null){
                    stmt.close();
                }
                if(conn != null){
                    conn.close();
                }*/
            JDBCUtils.close(rs,stmt,conn);
        }
        return list;
    }
}
