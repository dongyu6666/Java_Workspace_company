package com.fawvw.pojo;

public class IB1_IB_DESCRIPTION_IB_VARIANTSLei {

    private Integer id;

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String NAME;
    private String PRODUCT_ID;
    private String DESC;

    public IB1_IB_DESCRIPTION_IB_VARIANTSLei() {
    }

    public IB1_IB_DESCRIPTION_IB_VARIANTSLei(Integer id, String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String NAME, String PRODUCT_ID, String DESC) {
        this.id = id;
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.NAME = NAME;
        this.PRODUCT_ID = PRODUCT_ID;
        this.DESC = DESC;
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

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(String PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC;
    }

    @Override
    public String toString() {
        return "IB1_IB_DESCRIPTION_IB_VARIANTSLei{" +
                "id=" + id +
                ", platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", NAME='" + NAME + '\'' +
                ", PRODUCT_ID='" + PRODUCT_ID + '\'' +
                ", DESC='" + DESC + '\'' +
                '}';
    }
}
