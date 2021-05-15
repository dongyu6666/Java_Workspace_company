package pojo;

import com.alibaba.fastjson.JSONArray;

//定义接口
public class Class_B {

    private JSONArray CONTACTS;
    private JSONArray DOC_REVISIONS;

    private JSONArray IB_VARIANTS;
    private JSONArray OBJECTIVES;
    private JSONArray IBNZ;
    private JSONArray SLAVES;

    private JSONArray PRE_CONDITIONS;
    private JSONArray DEPENDENCIES;
    private JSONArray ACCESS_AUTHORISATIONS;
    private JSONArray PRODUCTION_MODES;

    private JSONArray ECU;

    public Class_B() {
    }

    public Class_B(JSONArray CONTACTS, JSONArray DOC_REVISIONS, JSONArray IB_VARIANTS, JSONArray OBJECTIVES, JSONArray IBNZ, JSONArray SLAVES, JSONArray PRE_CONDITIONS, JSONArray DEPENDENCIES, JSONArray ACCESS_AUTHORISATIONS, JSONArray PRODUCTION_MODES, JSONArray ECU) {
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
        this.ECU = ECU;
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

    public JSONArray getECU() {
        return ECU;
    }

    public void setECU(JSONArray ECU) {
        this.ECU = ECU;
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
                ", ECU=" + ECU +
                '}';
    }
}
