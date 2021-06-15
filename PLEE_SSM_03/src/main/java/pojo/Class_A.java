package pojo;

import com.alibaba.fastjson.JSONArray;

//定义接口
public class Class_A {

    private JSONArray IB1_Basic;
    private JSONArray DOC_INFO;
    private JSONArray IB_DESCRIPTION;
    private JSONArray ENVIRONMENT;
    private JSONArray BZD;
    private JSONArray REFERENCES;
    private JSONArray CUSTOMER_ADJUSTMENTS;
    private JSONArray SECURITY_PROPERTIES;
    private JSONArray IB1_TNR;

    public Class_A() {
    }

    public Class_A(JSONArray IB1_Basic, JSONArray DOC_INFO, JSONArray IB_DESCRIPTION, JSONArray ENVIRONMENT, JSONArray BZD, JSONArray REFERENCES, JSONArray CUSTOMER_ADJUSTMENTS, JSONArray SECURITY_PROPERTIES, JSONArray IB1_TNR) {
        this.IB1_Basic = IB1_Basic;
        this.DOC_INFO = DOC_INFO;
        this.IB_DESCRIPTION = IB_DESCRIPTION;
        this.ENVIRONMENT = ENVIRONMENT;
        this.BZD = BZD;
        this.REFERENCES = REFERENCES;
        this.CUSTOMER_ADJUSTMENTS = CUSTOMER_ADJUSTMENTS;
        this.SECURITY_PROPERTIES = SECURITY_PROPERTIES;
        this.IB1_TNR = IB1_TNR;
    }

    public JSONArray getIB1_Basic() {
        return IB1_Basic;
    }

    public void setIB1_Basic(JSONArray IB1_Basic) {
        this.IB1_Basic = IB1_Basic;
    }

    public JSONArray getDOC_INFO() {
        return DOC_INFO;
    }

    public void setDOC_INFO(JSONArray DOC_INFO) {
        this.DOC_INFO = DOC_INFO;
    }

    public JSONArray getIB_DESCRIPTION() {
        return IB_DESCRIPTION;
    }

    public void setIB_DESCRIPTION(JSONArray IB_DESCRIPTION) {
        this.IB_DESCRIPTION = IB_DESCRIPTION;
    }

    public JSONArray getENVIRONMENT() {
        return ENVIRONMENT;
    }

    public void setENVIRONMENT(JSONArray ENVIRONMENT) {
        this.ENVIRONMENT = ENVIRONMENT;
    }

    public JSONArray getBZD() {
        return BZD;
    }

    public void setBZD(JSONArray BZD) {
        this.BZD = BZD;
    }

    public JSONArray getREFERENCES() {
        return REFERENCES;
    }

    public void setREFERENCES(JSONArray REFERENCES) {
        this.REFERENCES = REFERENCES;
    }

    public JSONArray getCUSTOMER_ADJUSTMENTS() {
        return CUSTOMER_ADJUSTMENTS;
    }

    public void setCUSTOMER_ADJUSTMENTS(JSONArray CUSTOMER_ADJUSTMENTS) {
        this.CUSTOMER_ADJUSTMENTS = CUSTOMER_ADJUSTMENTS;
    }

    public JSONArray getSECURITY_PROPERTIES() {
        return SECURITY_PROPERTIES;
    }

    public void setSECURITY_PROPERTIES(JSONArray SECURITY_PROPERTIES) {
        this.SECURITY_PROPERTIES = SECURITY_PROPERTIES;
    }

    public JSONArray getIB1_TNR() {
        return IB1_TNR;
    }

    public void setIB1_TNR(JSONArray IB1_TNR) {
        this.IB1_TNR = IB1_TNR;
    }

    @Override
    public String toString() {
        return "Class_A{" +
                "IB1_Basic=" + IB1_Basic +
                ", DOC_INFO=" + DOC_INFO +
                ", IB_DESCRIPTION=" + IB_DESCRIPTION +
                ", ENVIRONMENT=" + ENVIRONMENT +
                ", BZD=" + BZD +
                ", REFERENCES=" + REFERENCES +
                ", CUSTOMER_ADJUSTMENTS=" + CUSTOMER_ADJUSTMENTS +
                ", SECURITY_PROPERTIES=" + SECURITY_PROPERTIES +
                ", IB1_TNR=" + IB1_TNR +
                '}';
    }
}
