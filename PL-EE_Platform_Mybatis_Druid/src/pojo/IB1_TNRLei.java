package pojo;

public class IB1_TNRLei {

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_TNR_filename;

    private String PROJECT;
    private String PRODUCT_ID;
    private String VEHICLE;
    private String ODX_PLATFORM;
    private String PART_NUMBER;

    public IB1_TNRLei() {
    }

    public IB1_TNRLei(String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_TNR_filename, String PROJECT, String PRODUCT_ID, String VEHICLE, String ODX_PLATFORM, String PART_NUMBER) {
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_TNR_filename = IB1_TNR_filename;
        this.PROJECT = PROJECT;
        this.PRODUCT_ID = PRODUCT_ID;
        this.VEHICLE = VEHICLE;
        this.ODX_PLATFORM = ODX_PLATFORM;
        this.PART_NUMBER = PART_NUMBER;
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

    public String getIB1_TNR_filename() {
        return IB1_TNR_filename;
    }

    public void setIB1_TNR_filename(String IB1_TNR_filename) {
        this.IB1_TNR_filename = IB1_TNR_filename;
    }

    public String getPROJECT() {
        return PROJECT;
    }

    public void setPROJECT(String PROJECT) {
        this.PROJECT = PROJECT;
    }

    public String getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(String PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }

    public String getVEHICLE() {
        return VEHICLE;
    }

    public void setVEHICLE(String VEHICLE) {
        this.VEHICLE = VEHICLE;
    }

    public String getODX_PLATFORM() {
        return ODX_PLATFORM;
    }

    public void setODX_PLATFORM(String ODX_PLATFORM) {
        this.ODX_PLATFORM = ODX_PLATFORM;
    }

    public String getPART_NUMBER() {
        return PART_NUMBER;
    }

    public void setPART_NUMBER(String PART_NUMBER) {
        this.PART_NUMBER = PART_NUMBER;
    }

    @Override
    public String toString() {
        return "IB1_TNRLei{" +
                "platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_TNR_filename='" + IB1_TNR_filename + '\'' +
                ", PROJECT='" + PROJECT + '\'' +
                ", PRODUCT_ID='" + PRODUCT_ID + '\'' +
                ", VEHICLE='" + VEHICLE + '\'' +
                ", ODX_PLATFORM='" + ODX_PLATFORM + '\'' +
                ", PART_NUMBER='" + PART_NUMBER + '\'' +
                '}';
    }
}
