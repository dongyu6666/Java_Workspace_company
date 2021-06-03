package pojo;


//定义接口
public class API {
    private String status;
    private String error;
    private String info;


    public API() {
    }

    public API(String status, String error, String info) {
        this.status = status;
        this.error = error;
        this.info = info;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "API{" +
                "status='" + status + '\'' +
                ", error='" + error + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
