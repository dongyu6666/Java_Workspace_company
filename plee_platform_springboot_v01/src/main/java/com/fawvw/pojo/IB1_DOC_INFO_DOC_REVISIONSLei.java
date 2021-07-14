package com.fawvw.pojo;

public class IB1_DOC_INFO_DOC_REVISIONSLei {

    private Integer id;

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String VERSION;
    private String DATE;
    private String CHANGE;
    private String TOOL;

    public IB1_DOC_INFO_DOC_REVISIONSLei() {
    }

    public IB1_DOC_INFO_DOC_REVISIONSLei(Integer id, String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String VERSION, String DATE, String CHANGE, String TOOL) {
        this.id = id;
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.VERSION = VERSION;
        this.DATE = DATE;
        this.CHANGE = CHANGE;
        this.TOOL = TOOL;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getCHANGE() {
        return CHANGE;
    }

    public void setCHANGE(String CHANGE) {
        this.CHANGE = CHANGE;
    }

    public String getTOOL() {
        return TOOL;
    }

    public void setTOOL(String TOOL) {
        this.TOOL = TOOL;
    }

    @Override
    public String toString() {
        return "IB1_DOC_INFO_DOC_REVISIONSLei{" +
                "id=" + id +
                ", platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", VERSION='" + VERSION + '\'' +
                ", DATE='" + DATE + '\'' +
                ", CHANGE='" + CHANGE + '\'' +
                ", TOOL='" + TOOL + '\'' +
                '}';
    }
}
