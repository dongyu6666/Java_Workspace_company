package pojo;

import org.springframework.stereotype.Component;

import java.util.*;

//等价于 <bean id="user" class="pojo.User"/>
//Component就是组件
@Component
public class User {
private String name;
private Address address;
private String[] books;
private List<String> hobbys;
private Map<String,String> card;
private Set<String> games;
private String wifi;
private Properties info;

    public User() {
    }

    public User(String name, Address address, String[] books, List<String> hobbys, Map<String, String> card, Set<String> games, String wifi, Properties info) {
        this.name = name;
        this.address = address;
        this.books = books;
        this.hobbys = hobbys;
        this.card = card;
        this.games = games;
        this.wifi = wifi;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", card=" + card +
                ", games=" + games +
                ", wifi='" + wifi + '\'' +
                ", info=" + info +
                '}';
    }
}
