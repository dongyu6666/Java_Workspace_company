package pojo;

public class IB1_SECURITY_PROPERTIESLei {

    private Integer id;
    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String NAME;
    private String ECU_ID;

    private String optional;
    private String KEY;
    private String DESC;
    private String VALUE;

    public IB1_SECURITY_PROPERTIESLei() {
    }

    public IB1_SECURITY_PROPERTIESLei(Integer id, String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String NAME, String ECU_ID, String optional, String KEY, String DESC, String VALUE) {
        this.id = id;
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.NAME = NAME;
        this.ECU_ID = ECU_ID;
        this.optional = optional;
        this.KEY = KEY;
        this.DESC = DESC;
        this.VALUE = VALUE;
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

    public String getECU_ID() {
        return ECU_ID;
    }

    public void setECU_ID(String ECU_ID) {
        this.ECU_ID = ECU_ID;
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

    @Override
    public String toString() {
        return "IB1_SECURITY_PROPERTIESLei{" +
                "id=" + id +
                ", platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", NAME='" + NAME + '\'' +
                ", ECU_ID='" + ECU_ID + '\'' +
                ", optional='" + optional + '\'' +
                ", KEY='" + KEY + '\'' +
                ", DESC='" + DESC + '\'' +
                ", VALUE='" + VALUE + '\'' +
                '}';
    }
}
