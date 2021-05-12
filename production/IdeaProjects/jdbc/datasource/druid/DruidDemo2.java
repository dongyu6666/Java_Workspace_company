package jdbc.datasource.druid;

import util.JDBCUtils_new;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 使用新的工具类
 */
public class DruidDemo2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //1.获取连接
            conn = JDBCUtils_new.getConnection();
            //2.定义sql
            String sql = "INSERT INTO `test`.`account` (`id`, `name`, `balance`) VALUES (?, ?, ?); ";
            //3.获取pstmt对象
            pstmt = conn.prepareStatement(sql);
            //4.给？赋值
            pstmt.setInt(1,5);
            pstmt.setString(2,"lalasf");
            pstmt.setInt(3,3000);
            //5.执行sql
            int result = pstmt.executeUpdate();
            System.out.println(result);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //6. 释放资源
            JDBCUtils_new.close(pstmt,conn);
        }

    }
}
