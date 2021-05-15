package pojo;

public class IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYLei {

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String optional;
    private String KEY;
    private String DESC;
    private String VALUE;
    private IB1_SECURITY_PROPERTIES_ECULei IB1_SECURITY_PROPERTIES_ECU;

    public IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYLei() {
    }

    public IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYLei(String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String optional, String KEY, String DESC, String VALUE, IB1_SECURITY_PROPERTIES_ECULei IB1_SECURITY_PROPERTIES_ECU) {
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.optional = optional;
        this.KEY = KEY;
        this.DESC = DESC;
        this.VALUE = VALUE;
        this.IB1_SECURITY_PROPERTIES_ECU = IB1_SECURITY_PROPERTIES_ECU;
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

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }

    public String getKEY() {
        return KEY;
    }

    public void setKEY(String KEY) {
        this.KEY = KEY;
    }

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC;
    }

    public String getVALUE() {
        return VALUE;
    }

    public void setVALUE(String VALUE) {
        this.VALUE = VALUE;
    }

    public IB1_SECURITY_PROPERTIES_ECULei getIB1_SECURITY_PROPERTIES_ECU() {
        return IB1_SECURITY_PROPERTIES_ECU;
    }

    public void setIB1_SECURITY_PROPERTIES_ECU(IB1_SECURITY_PROPERTIES_ECULei IB1_SECURITY_PROPERTIES_ECU) {
        this.IB1_SECURITY_PROPERTIES_ECU = IB1_SECURITY_PROPERTIES_ECU;
    }

    @Override
    public String toString() {
        return "IB1_SECURITY_PROPERTIES_ECU_SECURITY_PROPERTYLei{" +
                "platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", optional='" + optional + '\'' +
                ", KEY='" + KEY + '\'' +
                ", DESC='" + DESC + '\'' +
                ", VALUE='" + VALUE + '\'' +
                ", IB1_SECURITY_PROPERTIES_ECU=" + IB1_SECURITY_PROPERTIES_ECU +
                '}';
    }
}
