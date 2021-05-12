package domain;
/*定义一个department的类*/
public class department {
    private int id;
    private String de_name;

    public department() {
    }

    public department(int id, String de_name) {
        this.id = id;
        this.de_name = de_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDe_name() {
        return de_name;
    }

    public void setDe_name(String de_name) {
        this.de_name = de_name;
    }

    @Override
    public String toString() {
        return "department{" +
                "id=" + id +
                ", de_name='" + de_name + '\'' +
                '}';
    }
}
