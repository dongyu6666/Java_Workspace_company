package pojo;

public class UserLei {
    private String department;
    private String email;
    private String group;
    private String name;
    private String phone;
    private String username;

    public UserLei() {
    }

    public UserLei(String department, String email, String group, String name, String phone, String username) {
        this.department = department;
        this.email = email;
        this.group = group;
        this.name = name;
        this.phone = phone;
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserLei{" +
                "department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
