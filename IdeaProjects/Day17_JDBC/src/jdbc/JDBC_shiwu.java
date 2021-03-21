package jdbc;

import util.JDBCUtils_old;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
* 事务操作
* */
public class JDBC_shiwu {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps1 =null;
        PreparedStatement ps2 =null;

        try {
          conn = JDBCUtils_old.getConnection();

          //开启事务
            conn.setAutoCommit(false);
            //张三 -500
            String sql1 = "UPDATE ACCOUNT SET balance = balance - ? WHERE `id` = ?";
            String sql2 = "UPDATE ACCOUNT SET balance = balance + ? WHERE `id` = ?";

            ps1 = conn.prepareStatement(sql1);
            ps2 = conn.prepareStatement(sql2);

            ps1.setDouble(1,500);
            ps1.setInt(2,1);

            ps2.setDouble(1,100);
            ps2.setInt(2,2);

            ps1.executeUpdate();

            //手动制造异常
            int i = 3/0;
            ps2.executeUpdate();

            //提交事务
            conn.commit();



        } catch (SQLException e) {//把异常SQLException e的SQL去掉

            try {
                //事务回滚
                if(conn != null){
                    conn.rollback();
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();
        }finally {
            JDBCUtils_old.close(ps1,conn);
            JDBCUtils_old.close(ps2,null);

        }


    }

}
