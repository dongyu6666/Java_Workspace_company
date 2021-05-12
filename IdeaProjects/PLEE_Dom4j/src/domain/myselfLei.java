package domain;

public class myselfLei {
    private Integer id;
    private String name;
    private String age;
    private String cardid;

    public myselfLei() {
    }

    public myselfLei(Integer id, String name, String age, String cardid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cardid = cardid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    @Override
    public String toString() {
        return "myselfLei{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cardid='" + cardid + '\'' +
                '}';
    }
}
