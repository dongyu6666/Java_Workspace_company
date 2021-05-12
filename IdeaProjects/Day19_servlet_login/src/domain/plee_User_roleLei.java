package domain;
//其实就是JavaBean
public class plee_User_roleLei {

    private Integer id;
    private Integer uid;
    private Integer role_id;

    public plee_User_roleLei() {
    }

    public plee_User_roleLei(Integer id, Integer uid, Integer role_id) {
        this.id = id;
        this.uid = uid;
        this.role_id = role_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "plee_User_roleLei{" +
                "id=" + id +
                ", uid=" + uid +
                ", role_id=" + role_id +
                '}';
    }
}