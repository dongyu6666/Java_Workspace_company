package com.pleeprogram.DataBaseProcessor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.pleeprogram.GlobalConfig.GlobalConfig;
import com.pleeprogram.Utils.ByteUtils;

public class VbvItem {
	private int vbvId;
	private String projectName;
	private String vbvName;
	private int version;
	private String userName;
	private Timestamp timeStap;
	private List<EcuItem> ecuList = new ArrayList<>();
	
	public VbvItem(String vbvName, int version) {
		this.vbvName = vbvName;
		this.version = version;
	}
	
	public VbvItem(String projectName, String vbvName, String userName) {
		this.projectName = projectName;
		this.vbvName = vbvName;
		this.userName = userName;
		setVersionFromDb();
	}
	
	public VbvItem(int vbvId) {
		this.vbvId = vbvId;
	}
	
	
	public int getVbvId() {
		return vbvId;
	}
	public void setVbvId(int vbvId) {
		this.vbvId = vbvId;
	}
	public void setVbvIdFromDb() {
		Connection connection = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			connection = GlobalConfig.DataBase_Processor.getConnection();
			ps = connection.prepareStatement("Select VBV_ID from VBV where VBV_Name = ? and version = ?");
			ps.setString(1, this.vbvName);
			ps.setInt(2, this.version);
			rs = ps.executeQuery();
			if (rs.next()) {
				this.vbvId = rs.getInt("VBV_ID");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			GlobalConfig.DataBase_Processor.closeAll(connection, ps, rs);
		}
	}
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getVbvName() {
		return vbvName;
	}
	public void setVbvName(String vbvName) {
		this.vbvName = vbvName;
	}
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	public void setVersionFromDb() {
		Connection connection = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		int version = -1;
		try {
			connection = GlobalConfig.DataBase_Processor.getConnection();
			ps = connection.prepareStatement("Select MAX(Version) from VBV where Project_Name = ? and VBV_Name = ? GROUP BY NULL");
			ps.setString(1, this.projectName);
			ps.setString(2, this.vbvName);
			rs = ps.executeQuery();
			if (rs.next()) {
				version = rs.getInt("MAX(Version)");
				System.out.println("MAX(Version): " + version);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			GlobalConfig.DataBase_Processor.closeAll(connection, ps, rs);
		}
		this.version = version + 1;
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
	
	public List<EcuItem> getEcuList() {
		return ecuList;
	}

	public void setEcuList(List<EcuItem> ecuList) {
		this.ecuList = ecuList;
	}
	
	public int addVbvItem() {
		String sql = "insert into VBV values (null, ?, ?, ?, ?, ?)";
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = GlobalConfig.DataBase_Processor.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setString(1, this.projectName);
			ps.setString(2, this.vbvName);
			ps.setInt(3, this.version);
			ps.setString(4, this.userName);
			ps.setTimestamp(5, new Timestamp(new java.util.Date().getTime()));
			int rstNum = ps.executeUpdate();
			ps.close();
			if(rstNum == 1) {
				ps = connection.prepareStatement("SELECT LAST_INSERT_ID()");
				rs = ps.executeQuery();
				if(rs.next()) {
					this.vbvId = rs.getInt("LAST_INSERT_ID()");
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
	
	public int addEcuList() {
		String sql = "insert into ECU values (null, ?, ?, ? ,?, ?, ?, ? ,?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ? ,?, ?)";
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = GlobalConfig.DataBase_Processor.getConnection();
			ps = connection.prepareStatement(sql);
			for(EcuItem ecuItem: this.ecuList) {
				ps.setInt(1, this.vbvId);
				ps.setString(2, Integer.toHexString(ecuItem.getDiagM()));
				ps.setString(3, Integer.toHexString(ecuItem.getDiagS()));
				ps.setString(4, ecuItem.getEcuName());
				ps.setString(5, ecuItem.getmOrS());
				ps.setString(6, ecuItem.getEcuM());
				ps.setString(7, Long.toString(ecuItem.getLoginCode()));
				ps.setString(8, ecuItem.getZdcSequece());
				ps.setString(9, ecuItem.getPrn());
				ps.setString(10, ecuItem.getTnr());
				ps.setString(11, ecuItem.getHwv());
				ps.setString(12, ecuItem.getSwv());
				ps.setString(13, ecuItem.getZdcFile());
				ps.setString(14, ecuItem.getFlashFile());
				ps.setInt(15, ecuItem.getWaitTime());
				ps.setString(16, ecuItem.getAddreLengtFormaIdent());
				ps.setString(17, ecuItem.getCkd());
				ps.setString(18, ecuItem.getZdcOk());
				ps.setString(19, ecuItem.getFlashOk());
				ps.setString(20, ecuItem.getSecurityOk());
				ps.setString(21, ecuItem.getBasicSettingOk());
				ps.addBatch();
			}
			ps.executeBatch();
			return 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} finally {
			GlobalConfig.DataBase_Processor.closeAll(connection, ps, null);
		}
	}
}
