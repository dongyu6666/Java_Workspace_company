package com.fawvw.pojo;

public class IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCLei {

    private Integer id;

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String DTC_TI;
    private String DFCC_TEXT;

    public IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCLei() {
    }

    public IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCLei(Integer id, String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String DTC_TI, String DFCC_TEXT) {
        this.id = id;
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.DTC_TI = DTC_TI;
        this.DFCC_TEXT = DFCC_TEXT;
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

    public String getDTC_TI() {
        return DTC_TI;
    }

    public void setDTC_TI(String DTC_TI) {
        this.DTC_TI = DTC_TI;
    }

    public String getDFCC_TEXT() {
        return DFCC_TEXT;
    }

    public void setDFCC_TEXT(String DFCC_TEXT) {
        this.DFCC_TEXT = DFCC_TEXT;
    }

    @Override
    public String toString() {
        return "IB1_CUSTOMER_ADJUSTMENTS_BLOCKING_DTCS_DTCLei{" +
                "id=" + id +
                ", platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", DTC_TI='" + DTC_TI + '\'' +
                ", DFCC_TEXT='" + DFCC_TEXT + '\'' +
                '}';
    }
}
