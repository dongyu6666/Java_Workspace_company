package com.fawvw.pojo;
//其实就是JavaBean
public class Role_permissionLei {

    private Integer id;
    private Integer role_id;
    private String permission_id;

    public Role_permissionLei() {
    }

    public Role_permissionLei(Integer id, Integer role_id, String permission_id) {
        this.id = id;
        this.role_id = role_id;
        this.permission_id = permission_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(String permission_id) {
        this.permission_id = permission_id;
    }

    @Override
    public String toString() {
        return "plee_Role_permissionLei{" +
                "id=" + id +
                ", role_id=" + role_id +
                ", permission_id='" + permission_id + '\'' +
                '}';
    }
}