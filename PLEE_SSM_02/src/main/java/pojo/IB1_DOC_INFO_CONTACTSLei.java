package pojo;

public class IB1_DOC_INFO_CONTACTSLei {

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String NAME;
    private String COMPANY;
    private String DEPARTMENT;
    private String ROLE;
    private String PHONE;
    private String MOBILE_PHONE;
    private String MAIL;

    public IB1_DOC_INFO_CONTACTSLei() {
    }

    public IB1_DOC_INFO_CONTACTSLei(String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String NAME, String COMPANY, String DEPARTMENT, String ROLE, String PHONE, String MOBILE_PHONE, String MAIL) {
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.NAME = NAME;
        this.COMPANY = COMPANY;
        this.DEPARTMENT = DEPARTMENT;
        this.ROLE = ROLE;
        this.PHONE = PHONE;
        this.MOBILE_PHONE = MOBILE_PHONE;
        this.MAIL = MAIL;
    }

    public String getPlatform_name() {
        return platform_name;
    }

    public void setPlatform_name(String platform_name) {
        this.platform_name = platform_name;
    }

    public String getIB1_VERSION() {
        return IB1_VERSION;
    }

    public void setIB1_VERSION(String IB1_VERSION) {
        this.IB1_VERSION = IB1_VERSION;
    }

    public String getDiagnose_adr() {
        return diagnose_adr;
    }

    public void setDiagnose_adr(String diagnose_adr) {
        this.diagnose_adr = diagnose_adr;
    }

    public String getIB1_NAME() {
        return IB1_NAME;
    }

    public void setIB1_NAME(String IB1_NAME) {
        this.IB1_NAME = IB1_NAME;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getCOMPANY() {
        return COMPANY;
    }

    public void setCOMPANY(String COMPANY) {
        this.COMPANY = COMPANY;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    public String getROLE() {
        return ROLE;
    }

    public void setROLE(String ROLE) {
        this.ROLE = ROLE;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getMOBILE_PHONE() {
        return MOBILE_PHONE;
    }

    public void setMOBILE_PHONE(String MOBILE_PHONE) {
        this.MOBILE_PHONE = MOBILE_PHONE;
    }

    public String getMAIL() {
        return MAIL;
    }

    public void setMAIL(String MAIL) {
        this.MAIL = MAIL;
    }

    @Override
    public String toString() {
        return "IB1_DOC_INFO_CONTACTSLei{" +
                "platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", NAME='" + NAME + '\'' +
                ", COMPANY='" + COMPANY + '\'' +
                ", DEPARTMENT='" + DEPARTMENT + '\'' +
                ", ROLE='" + ROLE + '\'' +
                ", PHONE='" + PHONE + '\'' +
                ", MOBILE_PHONE='" + MOBILE_PHONE + '\'' +
                ", MAIL='" + MAIL + '\'' +
                '}';
    }
}
