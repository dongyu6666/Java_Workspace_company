package pojo;

public class IB1_BasicLei {

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;
    private String IB1_RELEASE_DATE;
    private String IB1_IBN_REQUIRED;
    private String IB1_filename;

    public IB1_BasicLei() {
    }

    public IB1_BasicLei(String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String IB1_RELEASE_DATE, String IB1_IBN_REQUIRED, String IB1_filename) {
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.IB1_RELEASE_DATE = IB1_RELEASE_DATE;
        this.IB1_IBN_REQUIRED = IB1_IBN_REQUIRED;
        this.IB1_filename = IB1_filename;
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

    public String getIB1_RELEASE_DATE() {
        return IB1_RELEASE_DATE;
    }

    public void setIB1_RELEASE_DATE(String IB1_RELEASE_DATE) {
        this.IB1_RELEASE_DATE = IB1_RELEASE_DATE;
    }

    public String getIB1_IBN_REQUIRED() {
        return IB1_IBN_REQUIRED;
    }

    public void setIB1_IBN_REQUIRED(String IB1_IBN_REQUIRED) {
        this.IB1_IBN_REQUIRED = IB1_IBN_REQUIRED;
    }

    public String getIB1_filename() {
        return IB1_filename;
    }

    public void setIB1_filename(String IB1_filename) {
        this.IB1_filename = IB1_filename;
    }

    @Override
    public String toString() {
        return "IB1_BasicLei{" +
                "platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", IB1_RELEASE_DATE='" + IB1_RELEASE_DATE + '\'' +
                ", IB1_IBN_REQUIRED='" + IB1_IBN_REQUIRED + '\'' +
                ", IB1_filename='" + IB1_filename + '\'' +
                '}';
    }
}
