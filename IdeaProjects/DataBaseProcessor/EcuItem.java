package com.pleeprogram.DataBaseProcessor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pleeprogram.GlobalConfig.GlobalConfig;
import com.pleeprogram.Utils.ByteUtils;

public class EcuItem {
	private int ecuId;
	private int vbvId;
	private int diagM; 
	private int diagS;
	private String ecuName;
	private String mOrS;
	private String ecuM;
	private Long loginCode;
	private String zdcSequece;
	private String prn;
	private String tnr;
	private String hwv;
	private String swv;
	private String zdcFile;
	private String flashFile;
	private int waitTime;
	private String addreLengtFormaIdent;
	private String ckd;
	private String zdcOk;
	private String flashOk;
	private String securityOk;
	private String basicSettingOk;
	
	public EcuItem() {
		
	}
	
	public EcuItem(int vbvId) {
		this.vbvId = vbvId;	
	}
	
	public EcuItem(int ecuId, int vbvId) {
		this.ecuId = ecuId;
		this.vbvId = vbvId;	
	}
	
	public int getEcuId() {
		return ecuId;
	}
	public void setEcuId(int ecuId) {
		this.ecuId = ecuId;
	}
	public int getVbvId() {
		return vbvId;
	}
	public void setVbvId(int vbvId) {
		this.vbvId = vbvId;
	}
	public int getDiagM() {
		return diagM;
	}
	public void setDiagM(int diagM) {
		this.diagM = diagM;
	}
	public int getDiagS() {
		return diagS;
	}
	public void setDiagS(int diagS) {
		this.diagS = diagS;
	}
	public String getEcuName() {
		return ecuName;
	}
	public void setEcuName(String ecuName) {
		this.ecuName = ecuName;
	}
	public String getmOrS() {
		return mOrS;
	}
	public void setmOrS(String mOrS) {
		this.mOrS = mOrS;
	}
	public String getEcuM() {
		return ecuM;
	}
	public void setEcuM(String ecuM) {
		this.ecuM = ecuM;
	}
	public Long getLoginCode() {
		return loginCode;
	}
	public void setLoginCode(Long loginCode) {
		this.loginCode = loginCode;
	}
	public String getZdcSequece() {
		return zdcSequece;
	}
	public void setZdcSequece(String zdcSequece) {
		this.zdcSequece = zdcSequece;
	}
	public String getPrn() {
		return prn;
	}
	public void setPrn(String prn) {
		this.prn = prn;
	}
	public String getTnr() {
		return tnr;
	}
	public void setTnr(String tnr) {
		this.tnr = tnr;
	}
	public String getHwv() {
		return hwv;
	}
	public void setHwv(String hwv) {
		this.hwv = hwv;
	}
	public String getSwv() {
		return swv;
	}
	public void setSwv(String swv) {
		this.swv = swv;
	}
	public String getZdcFile() {
		return zdcFile;
	}
	public void setZdcFile(String zdcFile) {
		this.zdcFile = zdcFile;
	}
	public String getFlashFile() {
		return flashFile;
	}
	public void setFlashFile(String flashFile) {
		this.flashFile = flashFile;
	}
	public int getWaitTime() {
		return waitTime;
	}
	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}
	public String getAddreLengtFormaIdent() {
		return addreLengtFormaIdent;
	}
	public void setAddreLengtFormaIdent(String addreLengtFormaIdent) {
		this.addreLengtFormaIdent = addreLengtFormaIdent;
	}
	public String getCkd() {
		return ckd;
	}
	public void setCkd(String ckd) {
		this.ckd = ckd;
	}
	public String getZdcOk() {
		return zdcOk;
	}
	public void setZdcOk(String zdcOk) {
		this.zdcOk = zdcOk;
	}
	public String getFlashOk() {
		return flashOk;
	}
	public void setFlashOk(String flashOk) {
		this.flashOk = flashOk;
	}
	public String getSecurityOk() {
		return securityOk;
	}
	public void setSecurityOk(String securityOk) {
		this.securityOk = securityOk;
	}
	public String getBasicSettingOk() {
		return basicSettingOk;
	}
	public void setBasicSettingOk(String basicSettingOk) {
		this.basicSettingOk = basicSettingOk;
	}
	
	public void setEcuItemPara(String paraName, String paraValue) {
		switch(paraName) {
		case "ECU_ID":
			if(!paraValue.equals("")) {
				setEcuId(Integer.parseInt(paraValue));
			} else {
				System.out.println("ECU_ID = " + paraName);
			}
			break;
		
		case "VBV_ID":
			if(!paraValue.equals("")) {
				setVbvId(Integer.parseInt(paraValue));
			} else {
				System.out.println("VBV_ID = " + paraName);
			}
			break;
			
		case "Diag_M":
			if(!paraValue.equals("")) {
				setDiagM(Integer.parseInt(paraValue, 16));
			} 
			break;
			
		case "Diag_S":
			if(!paraValue.equals("")) {
				setDiagS(Integer.parseInt(paraValue, 16));
			}
			break;
			
		case "ECU_Name":
			setEcuName(paraValue);
			break;
			
		case "M_or_S":
			setmOrS(paraValue);
			break;
			
		case "ECU_M":
			setEcuM(paraValue);
			break;
			
		case "Login_Code":
			if(!paraValue.equals("")) {
				setLoginCode(Long.parseLong(paraValue));
			} else {
				setLoginCode(20103L);
			}
			break;
			
		case "ZDC_Sequence":
			setZdcSequece(paraValue);
			break;
			
		case "PRN":
			setPrn(paraValue);
			break;
			
		case "TNR":
			setTnr(paraValue);
			break;
			
		case "HW_V":
			setHwv(paraValue);
			break;
			
		case "SW_V":
			setSwv(paraValue);
			break;
			
		case "ZDC_File":
			setZdcFile(paraValue);
			break;
			
		case "Flash_File":
			setFlashFile(paraValue);
			break;
			
		case "Wait_Time":
			if(!paraValue.equals("")) {
				setWaitTime(Integer.parseInt(paraValue));
			} else {
				setWaitTime(5000);
			}
			break;
			
		case "Addre_Lengt_Forma_Ident":
			if(!paraValue.equals("")) {
				setAddreLengtFormaIdent(paraValue);
			} else {
				setAddreLengtFormaIdent("44");
			}
			break;
			
		case "CKD":
			setCkd(paraValue);
			break;
			
		case "ZdcOK":
			setZdcOk(paraValue);
			break;
			
		case "FLOk":
			setFlashOk(paraValue);
			break;
			
		case "SecurityOK":
			setSecurityOk(paraValue);
			break;
			
		case "Basic_Setting":
			setBasicSettingOk(paraValue);
			break;	
			
			default:
				System.out.println("key string = " + paraName);	
		}
	}
	
	public int addEcuItem() {
		String sql = "insert into ECU values (null, ?, ?, ? ,?, ?, ?, ? ,?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ? ,?, ?)";
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = GlobalConfig.DataBase_Processor.getConnection();
			ps = connection.prepareStatement(sql);
			ps.setInt(1, this.vbvId);
			ps.setString(2, Integer.toHexString(this.diagM));
			ps.setString(3, Integer.toHexString(this.diagS));
			ps.setString(4, this.ecuName);
			ps.setString(5, this.mOrS);
			ps.setString(6, this.ecuM);
			ps.setString(7, Long.toString(this.loginCode));
			ps.setString(8, this.zdcSequece);
			ps.setString(9, this.prn);
			ps.setString(10, this.tnr);
			ps.setString(11, this.hwv);
			ps.setString(12, this.swv);
			ps.setString(13, this.zdcFile);
			ps.setString(14, this.flashFile);
			ps.setInt(15, this.waitTime);
			ps.setString(16, this.addreLengtFormaIdent);
			ps.setString(17, this.ckd);
			ps.setString(18, this.zdcOk);
			ps.setString(19, this.flashOk);
			ps.setString(20, this.securityOk);
			ps.setString(21, this.basicSettingOk);
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} finally {
			GlobalConfig.DataBase_Processor.closeAll(connection, ps, rs);
		}
	}
	
	static public EcuItem getInstance(String vin, String ecuName) {
		String sqlVehicle = "Select * from Vehicle where vin = ?";
		//String sqlVbv = "Select * from VBV left join ECU on VBV.VBV_ID = ECU.VBV_ID where VBV.VBV_ID = ? and ECU_Name = ?";
		String sqlVbv = "Select * from VBV where VBV_ID = ? and ECU_Name = ?";
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String prnVehicle = "";
		int vbvId = -1;
		
		try {
			connection = GlobalConfig.DataBase_Processor.getConnection();
			ps = connection.prepareStatement(sqlVehicle);
			ps.setString(1, vin);
			rs = ps.executeQuery();
			if(rs.next()) {
				prnVehicle = rs.getString("PRN");
				vbvId = rs.getInt("VBV_ID");
			}
			ps.close();
			rs.close();
			ps = connection.prepareStatement(sqlVbv);
			ps.setInt(1, vbvId);
			ps.setString(2, ecuName);
			rs = ps.executeQuery();
			while(rs.next()) {
				String prnEcu = rs.getString("PRN");
				if(prnEcu.equals("") || ByteUtils.comparePrn(prnEcu, prnVehicle)) {
					EcuItem ecuItem = new EcuItem();
					ecuItem.setEcuId(rs.getInt("ECU_ID"));
					ecuItem.setVbvId(rs.getInt("VBV_ID"));
					if(!rs.getString("Diag_M").equals("")) {
						ecuItem.setDiagM(Integer.parseInt(rs.getString("Diag_M"), 16));
					} 
					if(!rs.getString("Diag_S").equals("")) {
						ecuItem.setDiagM(Integer.parseInt(rs.getString("Diag_S"), 16));
					} 
					ecuItem.setEcuName(rs.getString("ECU_Name"));
					ecuItem.setmOrS(rs.getString("M_or_S"));
					ecuItem.setEcuM(rs.getString("ECU_M"));
					if(!rs.getString("Login_Code").equals("")) {
						ecuItem.setLoginCode(Long.parseLong(rs.getString("Login_Code")));
					}
					ecuItem.setZdcSequece(rs.getString("ZDC_Sequence"));
					ecuItem.setPrn(prnEcu);
					ecuItem.setTnr(rs.getString("TNR"));
					ecuItem.setHwv(rs.getString("HW_V"));
					ecuItem.setSwv(rs.getString("SW_V"));
					ecuItem.setZdcFile(rs.getString("ZDC_File"));
					ecuItem.setFlashFile(rs.getString("Flash_File"));
					if(!rs.getString("Wait_Time").equals("")) {
						ecuItem.setWaitTime(Integer.parseInt(rs.getString("Wait_Time")));
					} 
					ecuItem.setAddreLengtFormaIdent(rs.getString("Addre_Lengt_Forma_Ident"));
					ecuItem.setCkd(rs.getString("CKD"));
					ecuItem.setZdcOk(rs.getString("ZdcOK"));
					ecuItem.setFlashOk(rs.getString("FLOk"));
					ecuItem.setSecurityOk(rs.getString("SecurityOK"));
					ecuItem.setBasicSettingOk(rs.getString("Basic_Setting"));
					return ecuItem;
				}
			}
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			GlobalConfig.DataBase_Processor.closeAll(connection, ps, rs);
		}
	}
}
