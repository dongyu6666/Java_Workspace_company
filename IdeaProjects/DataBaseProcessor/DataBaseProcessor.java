package com.pleeprogram.DataBaseProcessor;

import java.sql.*;

import com.pleeprogram.GlobalConfig.GlobalConfig;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DataBaseProcessor {
	private static DataBaseProcessor dataBaseProcessor;
	private HikariDataSource ds; 
	
	DataBaseProcessor() {
		HikariConfig config = new HikariConfig();
    	config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		config.setJdbcUrl("jdbc:mysql://localhost:3306/PLEE_Cloud_Diagnose");
		config.setUsername("root");
		config.setPassword("123456789");
		config.addDataSourceProperty("connectionTimeout", "1000"); // 连接超时：1秒
		config.addDataSourceProperty("idleTimeout", "60000"); // 空闲超时：60秒
		config.addDataSourceProperty("maximumPoolSize", "100"); // 最大连接数：100
		ds = new HikariDataSource(config);
	}
	
	public static DataBaseProcessor getInstance() {
        if (dataBaseProcessor == null) dataBaseProcessor = new DataBaseProcessor();
        return dataBaseProcessor;
    }
	
	public synchronized Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (SQLException e) {
        	e.printStackTrace();
            ds.close();
            return null;
        }
    }
	
	public void closeAll(Connection connection, PreparedStatement ps, ResultSet rs) {
		try {
			if(connection != null) {
				connection.close();
				connection = null;
			}
			if(ps != null) {
				ps.close();
				ps = null;
			}
			if(rs != null) {
				rs.close();
				rs = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testFunction() {
		Connection connection = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			connection = getConnection();
			ps = connection.prepareStatement("Select * from teacherinfo");
			rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name").trim();
				System.out.println("name: " + name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll(connection, ps, rs);
		}
	}
}
