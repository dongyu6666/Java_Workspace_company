package pojo;

import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Class_B {

    //Doc
    private JSONArray CONTACTS;
    private JSONArray DOC_REVISIONS;
    //IB_Description
    private JSONArray IB_VARIANTS;
    private JSONArray OBJECTIVES;
    private JSONArray IBNZ;
    private JSONArray SLAVES;
    //Environment
    private JSONArray PRE_CONDITIONS;
    private JSONArray DEPENDENCIES;
    private JSONArray ACCESS_AUTHORISATIONS;
    private JSONArray PRODUCTION_MODES;
    private JSONArray TRANSPORT_MODE;
    //reference
    private JSONArray RELATED_DOCUMENT;
    private JSONArray REGULATION;
    //BZD
    private JSONArray BASIC;

    private JSONArray IDENTS;
    private JSONArray ADDITIONAL_IDENTS;
    //BZD:TARGET_DATE,S42_ATTRIBUTES_ADDED
/*    private JSONArray TARGET_DATE;

    @JsonProperty(value = "S42_ATTRIBUTES_ADDED")
    private JSONArray S42_ATTRIBUTES_ADDED;*/

    private JSONArray S42_ATTRIBUTES_ADDED;
    private JSONArray TARGET_DATE;
    private JSONArray IDENTS_DESC;
    private JSONArray ADDITIONAL_IDENTS_DESC;


    private JSONArray DATA_IDENTIFIER;

  /*  public Class_B() {
    }

    public Class_B(JSONArray CONTACTS, JSONArray DOC_REVISIONS, JSONArray IB_VARIANTS, JSONArray OBJECTIVES, JSONArray IBNZ, JSONArray SLAVES, JSONArray PRE_CONDITIONS, JSONArray DEPENDENCIES, JSONArray ACCESS_AUTHORISATIONS, JSONArray PRODUCTION_MODES, JSONArray TRANSPORT_MODE, JSONArray RELATED_DOCUMENT, JSONArray REGULATION, JSONArray IDENTS, JSONArray ADDITIONAL_IDENTS, JSONArray TARGET_DATE, JSONArray s42_ATTRIBUTES_ADDED, JSONArray IDENTS_DESC, JSONArray ADDITIONAL_IDENTS_DESC) {
        this.CONTACTS = CONTACTS;
        this.DOC_REVISIONS = DOC_REVISIONS;
        this.IB_VARIANTS = IB_VARIANTS;
        this.OBJECTIVES = OBJECTIVES;
        this.IBNZ = IBNZ;
        this.SLAVES = SLAVES;
        this.PRE_CONDITIONS = PRE_CONDITIONS;
        this.DEPENDENCIES = DEPENDENCIES;
        this.ACCESS_AUTHORISATIONS = ACCESS_AUTHORISATIONS;
        this.PRODUCTION_MODES = PRODUCTION_MODES;
        this.TRANSPORT_MODE = TRANSPORT_MODE;
        this.RELATED_DOCUMENT = RELATED_DOCUMENT;
        this.REGULATION = REGULATION;
        this.IDENTS = IDENTS;
        this.ADDITIONAL_IDENTS = ADDITIONAL_IDENTS;
        this.TARGET_DATE = TARGET_DATE;
        this.S42_ATTRIBUTES_ADDED = S42_ATTRIBUTES_ADDED;
        this.IDENTS_DESC = IDENTS_DESC;
        this.ADDITIONAL_IDENTS_DESC = ADDITIONAL_IDENTS_DESC;
    }

    public JSONArray getCONTACTS() {
        return CONTACTS;
    }

    public void setCONTACTS(JSONArray CONTACTS) {
        this.CONTACTS = CONTACTS;
    }

    public JSONArray getDOC_REVISIONS() {
        return DOC_REVISIONS;
    }

    public void setDOC_REVISIONS(JSONArray DOC_REVISIONS) {
        this.DOC_REVISIONS = DOC_REVISIONS;
    }

    public JSONArray getIB_VARIANTS() {
        return IB_VARIANTS;
    }

    public void setIB_VARIANTS(JSONArray IB_VARIANTS) {
        this.IB_VARIANTS = IB_VARIANTS;
    }

    public JSONArray getOBJECTIVES() {
        return OBJECTIVES;
    }

    public void setOBJECTIVES(JSONArray OBJECTIVES) {
        this.OBJECTIVES = OBJECTIVES;
    }

    public JSONArray getIBNZ() {
        return IBNZ;
    }

    public void setIBNZ(JSONArray IBNZ) {
        this.IBNZ = IBNZ;
    }

    public JSONArray getSLAVES() {
        return SLAVES;
    }

    public void setSLAVES(JSONArray SLAVES) {
        this.SLAVES = SLAVES;
    }

    public JSONArray getPRE_CONDITIONS() {
        return PRE_CONDITIONS;
    }

    public void setPRE_CONDITIONS(JSONArray PRE_CONDITIONS) {
        this.PRE_CONDITIONS = PRE_CONDITIONS;
    }

    public JSONArray getDEPENDENCIES() {
        return DEPENDENCIES;
    }

    public void setDEPENDENCIES(JSONArray DEPENDENCIES) {
        this.DEPENDENCIES = DEPENDENCIES;
    }

    public JSONArray getACCESS_AUTHORISATIONS() {
        return ACCESS_AUTHORISATIONS;
    }

    public void setACCESS_AUTHORISATIONS(JSONArray ACCESS_AUTHORISATIONS) {
        this.ACCESS_AUTHORISATIONS = ACCESS_AUTHORISATIONS;
    }

    public JSONArray getPRODUCTION_MODES() {
        return PRODUCTION_MODES;
    }

    public void setPRODUCTION_MODES(JSONArray PRODUCTION_MODES) {
        this.PRODUCTION_MODES = PRODUCTION_MODES;
    }

    public JSONArray getTRANSPORT_MODE() {
        return TRANSPORT_MODE;
    }

    public void setTRANSPORT_MODE(JSONArray TRANSPORT_MODE) {
        this.TRANSPORT_MODE = TRANSPORT_MODE;
    }

    public JSONArray getRELATED_DOCUMENT() {
        return RELATED_DOCUMENT;
    }

    public void setRELATED_DOCUMENT(JSONArray RELATED_DOCUMENT) {
        this.RELATED_DOCUMENT = RELATED_DOCUMENT;
    }

    public JSONArray getREGULATION() {
        return REGULATION;
    }

    public void setREGULATION(JSONArray REGULATION) {
        this.REGULATION = REGULATION;
    }

    public JSONArray getIDENTS() {
        return IDENTS;
    }

    public void setIDENTS(JSONArray IDENTS) {
        this.IDENTS = IDENTS;
    }

    public JSONArray getADDITIONAL_IDENTS() {
        return ADDITIONAL_IDENTS;
    }

    public void setADDITIONAL_IDENTS(JSONArray ADDITIONAL_IDENTS) {
        this.ADDITIONAL_IDENTS = ADDITIONAL_IDENTS;
    }

    public JSONArray getTARGET_DATE() {
        return TARGET_DATE;
    }

    public void setTARGET_DATE(JSONArray TARGET_DATE) {
        this.TARGET_DATE = TARGET_DATE;
    }

    public JSONArray getS42_ATTRIBUTES_ADDED() {
        return S42_ATTRIBUTES_ADDED;
    }

    public void setS42_ATTRIBUTES_ADDED(JSONArray S42_ATTRIBUTES_ADDED) {
        this.S42_ATTRIBUTES_ADDED = S42_ATTRIBUTES_ADDED;
    }

    public JSONArray getIDENTS_DESC() {
        return IDENTS_DESC;
    }

    public void setIDENTS_DESC(JSONArray IDENTS_DESC) {
        this.IDENTS_DESC = IDENTS_DESC;
    }

    public JSONArray getADDITIONAL_IDENTS_DESC() {
        return ADDITIONAL_IDENTS_DESC;
    }

    public void setADDITIONAL_IDENTS_DESC(JSONArray ADDITIONAL_IDENTS_DESC) {
        this.ADDITIONAL_IDENTS_DESC = ADDITIONAL_IDENTS_DESC;
    }

    @Override
    public String toString() {
        return "Class_B{" +
                "CONTACTS=" + CONTACTS +
                ", DOC_REVISIONS=" + DOC_REVISIONS +
                ", IB_VARIANTS=" + IB_VARIANTS +
                ", OBJECTIVES=" + OBJECTIVES +
                ", IBNZ=" + IBNZ +
                ", SLAVES=" + SLAVES +
                ", PRE_CONDITIONS=" + PRE_CONDITIONS +
                ", DEPENDENCIES=" + DEPENDENCIES +
                ", ACCESS_AUTHORISATIONS=" + ACCESS_AUTHORISATIONS +
                ", PRODUCTION_MODES=" + PRODUCTION_MODES +
                ", TRANSPORT_MODE=" + TRANSPORT_MODE +
                ", RELATED_DOCUMENT=" + RELATED_DOCUMENT +
                ", REGULATION=" + REGULATION +
                ", IDENTS=" + IDENTS +
                ", ADDITIONAL_IDENTS=" + ADDITIONAL_IDENTS +
                ", TARGET_DATE=" + TARGET_DATE +
                ", S42_ATTRIBUTES_ADDED=" + S42_ATTRIBUTES_ADDED +
                ", IDENTS_DESC=" + IDENTS_DESC +
                ", ADDITIONAL_IDENTS_DESC=" + ADDITIONAL_IDENTS_DESC +
                '}';
    }*/
}
