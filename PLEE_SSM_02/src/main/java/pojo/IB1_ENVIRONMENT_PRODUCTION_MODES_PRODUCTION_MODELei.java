package pojo;

public class IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODELei {

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String NAME;
    private String DESC;
    private String BYTE_0;
    private String BYTE_1;
    private String BYTE_2;

    public IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODELei() {
    }

    public IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODELei(String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String NAME, String DESC, String BYTE_0, String BYTE_1, String BYTE_2) {
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.NAME = NAME;
        this.DESC = DESC;
        this.BYTE_0 = BYTE_0;
        this.BYTE_1 = BYTE_1;
        this.BYTE_2 = BYTE_2;
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

    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC) {
        this.DESC = DESC;
    }

    public String getBYTE_0() {
        return BYTE_0;
    }

    public void setBYTE_0(String BYTE_0) {
        this.BYTE_0 = BYTE_0;
    }

    public String getBYTE_1() {
        return BYTE_1;
    }

    public void setBYTE_1(String BYTE_1) {
        this.BYTE_1 = BYTE_1;
    }

    public String getBYTE_2() {
        return BYTE_2;
    }

    public void setBYTE_2(String BYTE_2) {
        this.BYTE_2 = BYTE_2;
    }

    @Override
    public String toString() {
        return "IB1_ENVIRONMENT_PRODUCTION_MODES_PRODUCTION_MODELei{" +
                "platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", NAME='" + NAME + '\'' +
                ", DESC='" + DESC + '\'' +
                ", BYTE_0='" + BYTE_0 + '\'' +
                ", BYTE_1='" + BYTE_1 + '\'' +
                ", BYTE_2='" + BYTE_2 + '\'' +
                '}';
    }
}
