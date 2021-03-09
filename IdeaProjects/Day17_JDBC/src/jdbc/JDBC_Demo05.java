package jdbc;
/*
* 使用prepareStatement防止sql注入
* */
import domain.department;
import util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//这个例子可以查询出数据库Select，并装载集合中

/**
 * * 定义一个方法findall，查询name表的数据将其封装为对象，然后装载集合，返回。
 */
public class JDBC_Demo05 {

    public static void main(String[] args) throws SQLException {

        //1.键盘录入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        //2.调用方法login
        boolean flag = new JDBC_Demo05().login2(username, password);
        //3.判断结果，输出不同语句
        if(flag){
            //登录成功
            System.out.println("登录成功！");
        }else{
            System.out.println("用户名或密码错误！");
        }

        /*//2.调用方法findall
        List<department> list = new JDBC_Demo04().findall();
        System.out.println(list);*/
    }

    public boolean login2(String username ,String password){
        if(username == null || password == null){
            return false;
        }
        //连接数据库判断是否登录成功
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        //1.获取连接
        try {
            conn =  JDBCUtils.getConnection();
            //2.定义sql
            String sql = "select * from user where user_name = ? and password = ?";
            //3.获取执行sql的对象
            pstmt = conn.prepareStatement(sql);
            //给?赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            //4.执行查询,不需要传递sql
            rs = pstmt.executeQuery();
            //5.判断
           /* if(rs.next()){//如果有下一行，则返回true
                return true;
            }else{
                return false;
            }*/
            return rs.next();//如果有下一行，则返回true

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,conn);
        }


        return false;
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