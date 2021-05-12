package domain;

public class TestLei {
    private Integer id;
    private String user_name;

    public TestLei() {
    }

    public TestLei(Integer id, String user_name) {
        this.id = id;
        this.user_name = user_name;
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

    @Override
    public String toString() {
        return "TestLei{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}