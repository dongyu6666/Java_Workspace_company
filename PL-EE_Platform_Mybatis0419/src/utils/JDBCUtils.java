package utils;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * HikariCP连接池的工具类
 */
public class JDBCUtils {
    // 定义HikariDataSource类型的dataSource
    // 注意： 因为HikariDataSource类实现了DataSource接口。 因此 dataSource即是HikariDataSource类型也是DataSource类型
    public  static HikariDataSource dataSource;
    /**
     * 获取数据源
     * @return
     * @throws SQLException
     * @throws IOException
     */
    public static DataSource getDataSource()  {

        try {
            // 因为dataSource是全局变量、默认初始化值为null
            if (dataSource == null){
                // 通过字节输入流读取配置文件  hikaricp.properties
                InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("hikaricp.properties");
                // 因为HikariConfig类不可以加载io，但是可以加载Properties。因此：将输入流is封装到props
                Properties pro = new Properties();
                pro.load(is);
                // 再将封装好的props 传入到HikariConfig 类中，得到 config对象
                HikariConfig config = new HikariConfig(pro);
                // 将config对象传入给HikariDataSource ，返回dataSource
                dataSource = new HikariDataSource(config);
            }
            // 返回dataSource
            return  dataSource;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 通过数据源获取连接
     * @return
     * @throws SQLException
     */
    public static  Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    /*
     * 释放资源，归还连接
     */
    public static void close(Statement stmt, Connection conn){
        /*if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn !=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
        close(stmt,conn,null);
    }
    //重载 +ResultSet
    public static void close(Statement stmt, Connection conn, ResultSet rs){
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn !=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(rs !=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
