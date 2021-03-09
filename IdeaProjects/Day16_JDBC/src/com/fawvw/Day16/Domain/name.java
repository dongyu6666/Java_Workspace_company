package com.fawvw.Day16.Domain;
/*建立一个name的类*/
public class name {
    private int id;
    private String name;
    private String card_id;

    public name() {
    }

    public name(int id, String name, String card_id) {
        this.id = id;
        this.name = name;
        this.card_id = card_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    @Override
    public String toString() {
        return "name{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", card_id='" + card_id + '\'' +
                '}';
    }
}
