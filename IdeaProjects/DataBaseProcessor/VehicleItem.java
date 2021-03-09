package com.pleeprogram.DataBaseProcessor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pleeprogram.GlobalConfig.GlobalConfig;

public class VehicleItem {
	private int  vehicleId;
	private String project;
	private int vbvId;
	private String vin;
	private String krn;
	private String pren;
	private String prn;
	private String userName; 
	private String createWeekDay;
	private String handoverWeekDay;
	private String status;
	
	VehicleItem(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	
	VehicleItem(String vin) {
		this.vin = vin;
	}
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public int getVbvId() {
		return vbvId;
	}
	public void setVbvId(int vbvId) {
		this.vbvId = vbvId;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getKrn() {
		return krn;
	}
	public void setKrn(String krn) {
		this.krn = krn;
	}
	public String getPren() {
		return pren;
	}
	public void setPren(String pren) {
		this.pren = pren;
	}
	public String getPrn() {
		return prn;
	}
	public void setPrn(String prn) {
		this.prn = prn;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCreateWeekDay() {
		return createWeekDay;
	}
	public void setCreateWeekDay(String createWeekDay) {
		this.createWeekDay = createWeekDay;
	}
	public String getHandoverWeekDay() {
		return handoverWeekDay;
	}
	public void setHandoverWeekDay(String handoverWeekDay) {
		this.handoverWeekDay = handoverWeekDay;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	static public VehicleItem getInstance(String vin) {
		String sql = "Select * from Vehicle where Vin = ?";
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			connection = GlobalConfig.DataBase_Processor.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setString(1, vin);
			rs = ps.executeQuery();
			VehicleItem vehicleItem = null;
			if(rs.next()) {
				vehicleItem = new VehicleItem(vin);
				vehicleItem.setVehicleId(rs.getInt("Vehicle_ID"));
				vehicleItem.setProject(rs.getString("Project_Name"));
				vehicleItem.setVbvId(rs.getInt("VBV_ID"));
				vehicleItem.setVin(rs.getString("Vin"));
				vehicleItem.setKrn(rs.getString("Krn"));
				vehicleItem.setPren(rs.getString("Pren"));
				vehicleItem.setPrn(rs.getString("PRN"));
				vehicleItem.setUserName(rs.getString("User"));
				vehicleItem.setCreateWeekDay(rs.getString("Create_WeekDay"));
				vehicleItem.setHandoverWeekDay(rs.getString("Handover_WeekDay"));
				vehicleItem.setStatus(rs.getString("Status"));
			}
			return vehicleItem;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			GlobalConfig.DataBase_Processor.closeAll(connection, ps, rs);
		}
	}
}
