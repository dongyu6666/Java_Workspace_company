package com.pleeprogram.DataBaseProcessor;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.pleeprogram.GlobalConfig.GlobalConfig;

public class ProjectItem {
	private int projectId;
	private String projectName;
	private String description;
	private String userName;
	private Timestamp timeStap;
	
	public ProjectItem(int projectId) {
		this.projectId = projectId;
	}
	
	public ProjectItem(String projectName) {
		this.projectName = projectName;
	}
	
	public ProjectItem(String projectName, String description, String userName) {
		this.projectName = projectName;
		this.description = description;
		this.userName = userName;
	}
	
	public ProjectItem(int projectId, String projectName, String description) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.description = description;
	}
	
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Timestamp getTimeStap() {
		return timeStap;
	}

	public void setTimeStap(Timestamp timeStap) {
		this.timeStap = timeStap;
	}
	
	public int addProjectItem() {
		String sql = "insert into Project values (null, ?, ?, ?, ?)";
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = GlobalConfig.DataBase_Processor.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setString(1, this.projectName);
			ps.setString(2, this.description);
			ps.setString(3, this.userName);
			ps.setTimestamp(4, new Timestamp(new java.util.Date().getTime()));
			int rstNum = ps.executeUpdate();
			ps.close();
			if(rstNum == 1) {
				ps = connection.prepareStatement("SELECT LAST_INSERT_ID()");
				rs = ps.executeQuery();
				if(rs.next()) {
					this.projectId = rs.getInt("LAST_INSERT_ID()");
				}
				return 0;
			}
			return -1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} finally {
			GlobalConfig.DataBase_Processor.closeAll(connection, ps, rs);
		}
	}
	
	public void createProjectDir() {
		File pdxfile = new File(GlobalConfig.getPdxDir(this.projectName)); 
	    if(!pdxfile.exists()) 
	    { 
	    	pdxfile.mkdirs();//创建多级目录，mkdir只创建一级目录 
	    } 
	    File zdcfile = new File(GlobalConfig.getZdcDir(this.projectName)); 
	    if(!zdcfile.exists()) 
	    { 
	    	zdcfile.mkdirs();//创建多级目录，mkdir只创建一级目录 
	    } 
	}
}
