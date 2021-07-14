package com.fawvw.pojo;

public class IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei {

    private Integer id;
    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String NAME;
    private String VERSION;
    private String DESC;
    private String FILE_SYSTEM;
    private String URL;
    private String SPARE_PART_NUMBER;

    public IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei() {
    }

    public IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei(Integer id, String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String NAME, String VERSION, String DESC, String FILE_SYSTEM, String URL, String SPARE_PART_NUMBER) {
        this.id = id;
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.NAME = NAME;
        this.VERSION = VERSION;
        this.DESC = DESC;
        this.FILE_SYSTEM = FILE_SYSTEM;
        this.URL = URL;
        this.SPARE_PART_NUMBER = SPARE_PART_NUMBER;
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

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION;
    }

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC;
    }

    public String getFILE_SYSTEM() {
        return FILE_SYSTEM;
    }

    public void setFILE_SYSTEM(String FILE_SYSTEM) {
        this.FILE_SYSTEM = FILE_SYSTEM;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getSPARE_PART_NUMBER() {
        return SPARE_PART_NUMBER;
    }

    public void setSPARE_PART_NUMBER(String SPARE_PART_NUMBER) {
        this.SPARE_PART_NUMBER = SPARE_PART_NUMBER;
    }

    @Override
    public String toString() {
        return "IB1_REFERENCES_RELATED_DOCUMENTS_RELATED_DOCUMENTLei{" +
                "id=" + id +
                ", platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", NAME='" + NAME + '\'' +
                ", VERSION='" + VERSION + '\'' +
                ", DESC='" + DESC + '\'' +
                ", FILE_SYSTEM='" + FILE_SYSTEM + '\'' +
                ", URL='" + URL + '\'' +
                ", SPARE_PART_NUMBER='" + SPARE_PART_NUMBER + '\'' +
                '}';
    }
}
