package domain;
//其实就是JavaBean
public class plee_PermissionLei {

    private Integer id;
    private String permission_menu;

    public plee_PermissionLei() {
    }

    public plee_PermissionLei(Integer id, String permission_menu) {
        this.id = id;
        this.permission_menu = permission_menu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermission_menu() {
        return permission_menu;
    }

    public void setPermission_menu(String permission_menu) {
        this.permission_menu = permission_menu;
    }

    @Override
    public String toString() {
        return "plee_PermissionLei{" +
                "id=" + id +
                ", permission_menu='" + permission_menu + '\'' +
                '}';
    }
}