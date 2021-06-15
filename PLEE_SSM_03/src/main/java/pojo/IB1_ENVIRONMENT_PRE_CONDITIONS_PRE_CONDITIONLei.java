package pojo;

public class IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONLei {

    private Integer id;

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String kdRelevant;
    private String pRelevant;
    private String text;

    public IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONLei() {
    }

    public IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONLei(Integer id, String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String kdRelevant, String pRelevant, String text) {
        this.id = id;
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.kdRelevant = kdRelevant;
        this.pRelevant = pRelevant;
        this.text = text;
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

    public String getKdRelevant() {
        return kdRelevant;
    }

    public void setKdRelevant(String kdRelevant) {
        this.kdRelevant = kdRelevant;
    }

    public String getpRelevant() {
        return pRelevant;
    }

    public void setpRelevant(String pRelevant) {
        this.pRelevant = pRelevant;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "IB1_ENVIRONMENT_PRE_CONDITIONS_PRE_CONDITIONLei{" +
                "id=" + id +
                ", platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", kdRelevant='" + kdRelevant + '\'' +
                ", pRelevant='" + pRelevant + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
