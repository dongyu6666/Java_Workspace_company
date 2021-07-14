package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class IB1_BZD_IDENTSLei {

    private Integer id;

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

/*    @JsonProperty(value = "S42_ATTRIBUTES_ADDED")
    private String S42_ATTRIBUTES_ADDED;*/
    private String IDENTS_DESC;
    private String IDENTS_IDENT_NAME;
    private String IDENTS_IDENT_S42_ATTRIBUTE;
    private String IDENTS_IDENT_BGONLINE;
    private String IDENTS_IDENT_DID;
    private String IDENTS_IDENT_COMMENT;
/*
    private String TARGET_DATE;
*/

    /*public IB1_BZD_IDENTSLei() {
    }

    public IB1_BZD_IDENTSLei(Integer id, String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String s42_ATTRIBUTES_ADDED, String IDENTS_DESC, String IDENTS_IDENT_NAME, String IDENTS_IDENT_S42_ATTRIBUTE, String IDENTS_IDENT_BGONLINE, String IDENTS_IDENT_DID, String IDENTS_IDENT_COMMENT, String TARGET_DATE) {
        this.id = id;
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.S42_ATTRIBUTES_ADDED = S42_ATTRIBUTES_ADDED;
        this.IDENTS_DESC = IDENTS_DESC;
        this.IDENTS_IDENT_NAME = IDENTS_IDENT_NAME;
        this.IDENTS_IDENT_S42_ATTRIBUTE = IDENTS_IDENT_S42_ATTRIBUTE;
        this.IDENTS_IDENT_BGONLINE = IDENTS_IDENT_BGONLINE;
        this.IDENTS_IDENT_DID = IDENTS_IDENT_DID;
        this.IDENTS_IDENT_COMMENT = IDENTS_IDENT_COMMENT;
        this.TARGET_DATE = TARGET_DATE;
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

    public String getS42_ATTRIBUTES_ADDED() {
        return S42_ATTRIBUTES_ADDED;
    }

    public void setS42_ATTRIBUTES_ADDED(String S42_ATTRIBUTES_ADDED) {
        this.S42_ATTRIBUTES_ADDED = S42_ATTRIBUTES_ADDED;
    }

    public String getIDENTS_DESC() {
        return IDENTS_DESC;
    }

    public void setIDENTS_DESC(String IDENTS_DESC) {
        this.IDENTS_DESC = IDENTS_DESC;
    }

    public String getIDENTS_IDENT_NAME() {
        return IDENTS_IDENT_NAME;
    }

    public void setIDENTS_IDENT_NAME(String IDENTS_IDENT_NAME) {
        this.IDENTS_IDENT_NAME = IDENTS_IDENT_NAME;
    }

    public String getIDENTS_IDENT_S42_ATTRIBUTE() {
        return IDENTS_IDENT_S42_ATTRIBUTE;
    }

    public void setIDENTS_IDENT_S42_ATTRIBUTE(String IDENTS_IDENT_S42_ATTRIBUTE) {
        this.IDENTS_IDENT_S42_ATTRIBUTE = IDENTS_IDENT_S42_ATTRIBUTE;
    }

    public String getIDENTS_IDENT_BGONLINE() {
        return IDENTS_IDENT_BGONLINE;
    }

    public void setIDENTS_IDENT_BGONLINE(String IDENTS_IDENT_BGONLINE) {
        this.IDENTS_IDENT_BGONLINE = IDENTS_IDENT_BGONLINE;
    }

    public String getIDENTS_IDENT_DID() {
        return IDENTS_IDENT_DID;
    }

    public void setIDENTS_IDENT_DID(String IDENTS_IDENT_DID) {
        this.IDENTS_IDENT_DID = IDENTS_IDENT_DID;
    }

    public String getIDENTS_IDENT_COMMENT() {
        return IDENTS_IDENT_COMMENT;
    }

    public void setIDENTS_IDENT_COMMENT(String IDENTS_IDENT_COMMENT) {
        this.IDENTS_IDENT_COMMENT = IDENTS_IDENT_COMMENT;
    }

    public String getTARGET_DATE() {
        return TARGET_DATE;
    }

    public void setTARGET_DATE(String TARGET_DATE) {
        this.TARGET_DATE = TARGET_DATE;
    }

    @Override
    public String toString() {
        return "IB1_BZD_IDENTSLei{" +
                "id=" + id +
                ", platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", S42_ATTRIBUTES_ADDED='" + S42_ATTRIBUTES_ADDED + '\'' +
                ", IDENTS_DESC='" + IDENTS_DESC + '\'' +
                ", IDENTS_IDENT_NAME='" + IDENTS_IDENT_NAME + '\'' +
                ", IDENTS_IDENT_S42_ATTRIBUTE='" + IDENTS_IDENT_S42_ATTRIBUTE + '\'' +
                ", IDENTS_IDENT_BGONLINE='" + IDENTS_IDENT_BGONLINE + '\'' +
                ", IDENTS_IDENT_DID='" + IDENTS_IDENT_DID + '\'' +
                ", IDENTS_IDENT_COMMENT='" + IDENTS_IDENT_COMMENT + '\'' +
                ", TARGET_DATE='" + TARGET_DATE + '\'' +
                '}';
    }*/
}
