package domain;

public class TestLei {
    private Integer id;
    private String user_name;
    private String role_name;
    private String permission_menu;

    public TestLei() {
    }

    public TestLei(Integer id, String user_name, String role_name, String permission_menu) {
        this.id = id;
        this.user_name = user_name;
        this.role_name = role_name;
        this.permission_menu = permission_menu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getPermission_menu() {
        return permission_menu;
    }

    public void setPermission_menu(String permission_menu) {
        this.permission_menu = permission_menu;
    }

    @Override
    public String toString() {
        return "TestLei{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", role_name='" + role_name + '\'' +
                ", permission_menu='" + permission_menu + '\'' +
                '}';
    }
}
