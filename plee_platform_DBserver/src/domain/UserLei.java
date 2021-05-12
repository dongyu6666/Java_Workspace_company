package domain;
//其实就是JavaBean
public class UserLei {

    private Integer id;
    private String username;
    private String password;

    private String gender;


    public UserLei() {
    }

    public UserLei(Integer id, String username, String password, String gender) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    //Hehe的set和get
    public void setHehe(String gender) {
        this.gender = gender;
    }
    public String getHehe() {
        return gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLei{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}