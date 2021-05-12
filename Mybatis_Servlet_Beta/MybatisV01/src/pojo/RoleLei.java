package pojo;
//其实就是JavaBean
public class RoleLei {

    private Integer id;
    private String role_name;

    public RoleLei() {
    }

    public RoleLei(Integer id, String role_name) {
        this.id = id;
        this.role_name = role_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return "plee_RoleLei{" +
                "id=" + id +
                ", role_name='" + role_name + '\'' +
                '}';
    }
}