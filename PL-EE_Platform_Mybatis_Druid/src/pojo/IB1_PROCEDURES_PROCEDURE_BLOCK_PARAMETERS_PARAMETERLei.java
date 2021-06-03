package pojo;

public class IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei {

    private String platform_name;
    private String IB1_VERSION;
    private String diagnose_adr;
    private String IB1_NAME;

    private String BLOCK_NAME;
    private String BLOCK_PARAMETERS_PARAMETER_optional;
    private String BLOCK_PARAMETERS_PARAMETER_KEY;
    private String BLOCK_PARAMETERS_PARAMETER_DESC;
    private String BLOCK_PARAMETERS_PARAMETER_DATATYPE;
    private String BLOCK_PARAMETERS_PARAMETER_VALUE;
    private String BLOCK_PARAMETERS_PARAMETER_DEFAULT;

    private IB1_PROCEDURES_PROCEDURELei IB1_PROCEDURES_PROCEDURE;

    public IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei() {
    }

    public IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei(String platform_name, String IB1_VERSION, String diagnose_adr, String IB1_NAME, String BLOCK_NAME, String BLOCK_PARAMETERS_PARAMETER_optional, String BLOCK_PARAMETERS_PARAMETER_KEY, String BLOCK_PARAMETERS_PARAMETER_DESC, String BLOCK_PARAMETERS_PARAMETER_DATATYPE, String BLOCK_PARAMETERS_PARAMETER_VALUE, String BLOCK_PARAMETERS_PARAMETER_DEFAULT, IB1_PROCEDURES_PROCEDURELei IB1_PROCEDURES_PROCEDURE) {
        this.platform_name = platform_name;
        this.IB1_VERSION = IB1_VERSION;
        this.diagnose_adr = diagnose_adr;
        this.IB1_NAME = IB1_NAME;
        this.BLOCK_NAME = BLOCK_NAME;
        this.BLOCK_PARAMETERS_PARAMETER_optional = BLOCK_PARAMETERS_PARAMETER_optional;
        this.BLOCK_PARAMETERS_PARAMETER_KEY = BLOCK_PARAMETERS_PARAMETER_KEY;
        this.BLOCK_PARAMETERS_PARAMETER_DESC = BLOCK_PARAMETERS_PARAMETER_DESC;
        this.BLOCK_PARAMETERS_PARAMETER_DATATYPE = BLOCK_PARAMETERS_PARAMETER_DATATYPE;
        this.BLOCK_PARAMETERS_PARAMETER_VALUE = BLOCK_PARAMETERS_PARAMETER_VALUE;
        this.BLOCK_PARAMETERS_PARAMETER_DEFAULT = BLOCK_PARAMETERS_PARAMETER_DEFAULT;
        this.IB1_PROCEDURES_PROCEDURE = IB1_PROCEDURES_PROCEDURE;
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

    public String getBLOCK_PARAMETERS_PARAMETER_optional() {
        return BLOCK_PARAMETERS_PARAMETER_optional;
    }

    public void setBLOCK_PARAMETERS_PARAMETER_optional(String BLOCK_PARAMETERS_PARAMETER_optional) {
        this.BLOCK_PARAMETERS_PARAMETER_optional = BLOCK_PARAMETERS_PARAMETER_optional;
    }

    public String getBLOCK_PARAMETERS_PARAMETER_KEY() {
        return BLOCK_PARAMETERS_PARAMETER_KEY;
    }

    public void setBLOCK_PARAMETERS_PARAMETER_KEY(String BLOCK_PARAMETERS_PARAMETER_KEY) {
        this.BLOCK_PARAMETERS_PARAMETER_KEY = BLOCK_PARAMETERS_PARAMETER_KEY;
    }

    public String getBLOCK_PARAMETERS_PARAMETER_DESC() {
        return BLOCK_PARAMETERS_PARAMETER_DESC;
    }

    public void setBLOCK_PARAMETERS_PARAMETER_DESC(String BLOCK_PARAMETERS_PARAMETER_DESC) {
        this.BLOCK_PARAMETERS_PARAMETER_DESC = BLOCK_PARAMETERS_PARAMETER_DESC;
    }

    public String getBLOCK_PARAMETERS_PARAMETER_DATATYPE() {
        return BLOCK_PARAMETERS_PARAMETER_DATATYPE;
    }

    public void setBLOCK_PARAMETERS_PARAMETER_DATATYPE(String BLOCK_PARAMETERS_PARAMETER_DATATYPE) {
        this.BLOCK_PARAMETERS_PARAMETER_DATATYPE = BLOCK_PARAMETERS_PARAMETER_DATATYPE;
    }

    public String getBLOCK_PARAMETERS_PARAMETER_VALUE() {
        return BLOCK_PARAMETERS_PARAMETER_VALUE;
    }

    public void setBLOCK_PARAMETERS_PARAMETER_VALUE(String BLOCK_PARAMETERS_PARAMETER_VALUE) {
        this.BLOCK_PARAMETERS_PARAMETER_VALUE = BLOCK_PARAMETERS_PARAMETER_VALUE;
    }

    public String getBLOCK_PARAMETERS_PARAMETER_DEFAULT() {
        return BLOCK_PARAMETERS_PARAMETER_DEFAULT;
    }

    public void setBLOCK_PARAMETERS_PARAMETER_DEFAULT(String BLOCK_PARAMETERS_PARAMETER_DEFAULT) {
        this.BLOCK_PARAMETERS_PARAMETER_DEFAULT = BLOCK_PARAMETERS_PARAMETER_DEFAULT;
    }

    public IB1_PROCEDURES_PROCEDURELei getIB1_PROCEDURES_PROCEDURE() {
        return IB1_PROCEDURES_PROCEDURE;
    }

    public void setIB1_PROCEDURES_PROCEDURE(IB1_PROCEDURES_PROCEDURELei IB1_PROCEDURES_PROCEDURE) {
        this.IB1_PROCEDURES_PROCEDURE = IB1_PROCEDURES_PROCEDURE;
    }

    @Override
    public String toString() {
        return "IB1_PROCEDURES_PROCEDURE_BLOCK_PARAMETERS_PARAMETERLei{" +
                "platform_name='" + platform_name + '\'' +
                ", IB1_VERSION='" + IB1_VERSION + '\'' +
                ", diagnose_adr='" + diagnose_adr + '\'' +
                ", IB1_NAME='" + IB1_NAME + '\'' +
                ", BLOCK_NAME='" + BLOCK_NAME + '\'' +
                ", BLOCK_PARAMETERS_PARAMETER_optional='" + BLOCK_PARAMETERS_PARAMETER_optional + '\'' +
                ", BLOCK_PARAMETERS_PARAMETER_KEY='" + BLOCK_PARAMETERS_PARAMETER_KEY + '\'' +
                ", BLOCK_PARAMETERS_PARAMETER_DESC='" + BLOCK_PARAMETERS_PARAMETER_DESC + '\'' +
                ", BLOCK_PARAMETERS_PARAMETER_DATATYPE='" + BLOCK_PARAMETERS_PARAMETER_DATATYPE + '\'' +
                ", BLOCK_PARAMETERS_PARAMETER_VALUE='" + BLOCK_PARAMETERS_PARAMETER_VALUE + '\'' +
                ", BLOCK_PARAMETERS_PARAMETER_DEFAULT='" + BLOCK_PARAMETERS_PARAMETER_DEFAULT + '\'' +
                ", IB1_PROCEDURES_PROCEDURE=" + IB1_PROCEDURES_PROCEDURE +
                '}';
    }
}
