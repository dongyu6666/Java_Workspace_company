package com.fawvw.Day16.Demo;
import com.fawvw.Day16.Domain.department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//这个例子可以查询出数据库Select，并装载集合中

/**
 * * 定义一个方法findall，查询name表的数据将其封装为对象，然后装载集合，返回。
 */
public class JDBC_Demo04 {

    public static void main(String[] args) throws SQLException {
        List<department> list = new JDBC_Demo04().findall();
        System.out.println(list);
    }
/**
** 方法findall
*/
    public List<department> findall() throws SQLException {
        Connection conn = null;//connection对象
        Statement stmt = null;//执行sql的对象statement
        ResultSet rs = null;//结果集
        List<department> list = null;
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //定义sql
            String sql = "SELECT * FROM `department`";
            //获取connection对象
            conn = DriverManager.getConnection("jdbc:mysql://10.220.15.230:3306/test", "Liang.Dongyu", "dsa123");
            //获取执行sql的对象statement
            stmt = conn.createStatement();
            //执行sql
            //int result = stmt.executeUpdate(sql);
            //executeQuery是产生单个结果集（ResultSet）的语句
            rs = stmt.executeQuery(sql);
            //遍历结果集，封装对象，装载集合
            //department Department_FAW = null;
            list = new ArrayList<department>();

            while (rs.next()){
                int id = rs.getInt(1);
                String de_name = rs.getString(2);

                // 创建department的对象Department_FAW,然后赋值
                department Department_FAW = new department();
                Department_FAW.setId(id);
                Department_FAW.setDe_name(de_name);

                //装载集合
                list.add(Department_FAW);

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs != null){
                rs.close();
            }
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return list;
    }


}