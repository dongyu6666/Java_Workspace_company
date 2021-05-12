package pojo;

public class IB1_IB_DESCRIPTION_IBNZLei {

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String IBNZ_ESTIMATION;
    private String IBNZ_COMMITMENT;

    public IB1_IB_DESCRIPTION_IBNZLei() {
    }

    public IB1_IB_DESCRIPTION_IBNZLei(String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String IBNZ_ESTIMATION, String IBNZ_COMMITMENT) {
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.IBNZ_ESTIMATION = IBNZ_ESTIMATION;
        this.IBNZ_COMMITMENT = IBNZ_COMMITMENT;
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

    public String getIBNZ_ESTIMATION() {
        return IBNZ_ESTIMATION;
    }

    public void setIBNZ_ESTIMATION(String IBNZ_ESTIMATION) {
        this.IBNZ_ESTIMATION = IBNZ_ESTIMATION;
    }

    public String getIBNZ_COMMITMENT() {
        return IBNZ_COMMITMENT;
    }

    public void setIBNZ_COMMITMENT(String IBNZ_COMMITMENT) {
        this.IBNZ_COMMITMENT = IBNZ_COMMITMENT;
    }

    @Override
    public String toString() {
        return "IB1_IB_DESCRIPTION_IBNZLei{" +
                "platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", IBNZ_ESTIMATION='" + IBNZ_ESTIMATION + '\'' +
                ", IBNZ_COMMITMENT='" + IBNZ_COMMITMENT + '\'' +
                '}';
    }
}
