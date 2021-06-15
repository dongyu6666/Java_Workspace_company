package pojo;

public class IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei {

    private Integer id;
    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String BLOCK_NAME;
    private String BLOCK_id;


    private String STEP_cyclic;
    private String STEP_id;

    private String STEP_NAME;
    private String STEP_DESC;
    private String STEP_DIAG_SERVICE_IDENTIFIER;
    private String STEP_DIAG_SERVICE_LONG_NAME;
    private String STEP_DIAG_SERVICE_SHORT_NAME;

   /* private IB1_BasicLei IB1_Basic;
    private IB1_PROCEDURES_PROCEDURELei IB1_PROCEDURES_PROCEDURE;*/

    public IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei() {
    }

    public IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei(Integer id, String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String BLOCK_NAME, String BLOCK_id, String STEP_cyclic, String STEP_id, String STEP_NAME, String STEP_DESC, String STEP_DIAG_SERVICE_IDENTIFIER, String STEP_DIAG_SERVICE_LONG_NAME, String STEP_DIAG_SERVICE_SHORT_NAME) {
        this.id = id;
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.BLOCK_NAME = BLOCK_NAME;
        this.BLOCK_id = BLOCK_id;
        this.STEP_cyclic = STEP_cyclic;
        this.STEP_id = STEP_id;
        this.STEP_NAME = STEP_NAME;
        this.STEP_DESC = STEP_DESC;
        this.STEP_DIAG_SERVICE_IDENTIFIER = STEP_DIAG_SERVICE_IDENTIFIER;
        this.STEP_DIAG_SERVICE_LONG_NAME = STEP_DIAG_SERVICE_LONG_NAME;
        this.STEP_DIAG_SERVICE_SHORT_NAME = STEP_DIAG_SERVICE_SHORT_NAME;
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

    public String getBLOCK_NAME() {
        return BLOCK_NAME;
    }

    public void setBLOCK_NAME(String BLOCK_NAME) {
        this.BLOCK_NAME = BLOCK_NAME;
    }

    public String getBLOCK_id() {
        return BLOCK_id;
    }

    public void setBLOCK_id(String BLOCK_id) {
        this.BLOCK_id = BLOCK_id;
    }

    public String getSTEP_cyclic() {
        return STEP_cyclic;
    }

    public void setSTEP_cyclic(String STEP_cyclic) {
        this.STEP_cyclic = STEP_cyclic;
    }

    public String getSTEP_id() {
        return STEP_id;
    }

    public void setSTEP_id(String STEP_id) {
        this.STEP_id = STEP_id;
    }

    public String getSTEP_NAME() {
        return STEP_NAME;
    }

    public void setSTEP_NAME(String STEP_NAME) {
        this.STEP_NAME = STEP_NAME;
    }

    public String getSTEP_DESC() {
        return STEP_DESC;
    }

    public void setSTEP_DESC(String STEP_DESC) {
        this.STEP_DESC = STEP_DESC;
    }

    public String getSTEP_DIAG_SERVICE_IDENTIFIER() {
        return STEP_DIAG_SERVICE_IDENTIFIER;
    }

    public void setSTEP_DIAG_SERVICE_IDENTIFIER(String STEP_DIAG_SERVICE_IDENTIFIER) {
        this.STEP_DIAG_SERVICE_IDENTIFIER = STEP_DIAG_SERVICE_IDENTIFIER;
    }

    public String getSTEP_DIAG_SERVICE_LONG_NAME() {
        return STEP_DIAG_SERVICE_LONG_NAME;
    }

    public void setSTEP_DIAG_SERVICE_LONG_NAME(String STEP_DIAG_SERVICE_LONG_NAME) {
        this.STEP_DIAG_SERVICE_LONG_NAME = STEP_DIAG_SERVICE_LONG_NAME;
    }

    public String getSTEP_DIAG_SERVICE_SHORT_NAME() {
        return STEP_DIAG_SERVICE_SHORT_NAME;
    }

    public void setSTEP_DIAG_SERVICE_SHORT_NAME(String STEP_DIAG_SERVICE_SHORT_NAME) {
        this.STEP_DIAG_SERVICE_SHORT_NAME = STEP_DIAG_SERVICE_SHORT_NAME;
    }

    @Override
    public String toString() {
        return "IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEPLei{" +
                "id=" + id +
                ", platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", BLOCK_NAME='" + BLOCK_NAME + '\'' +
                ", BLOCK_id='" + BLOCK_id + '\'' +
                ", STEP_cyclic='" + STEP_cyclic + '\'' +
                ", STEP_id='" + STEP_id + '\'' +
                ", STEP_NAME='" + STEP_NAME + '\'' +
                ", STEP_DESC='" + STEP_DESC + '\'' +
                ", STEP_DIAG_SERVICE_IDENTIFIER='" + STEP_DIAG_SERVICE_IDENTIFIER + '\'' +
                ", STEP_DIAG_SERVICE_LONG_NAME='" + STEP_DIAG_SERVICE_LONG_NAME + '\'' +
                ", STEP_DIAG_SERVICE_SHORT_NAME='" + STEP_DIAG_SERVICE_SHORT_NAME + '\'' +
                '}';
    }
}
