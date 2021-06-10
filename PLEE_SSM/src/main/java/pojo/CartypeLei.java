package pojo;

public class CartypeLei {
    private Integer id;
    private String cartype_name;
    private String responsible;

    public CartypeLei() {
    }

    public CartypeLei(Integer id, String cartype_name, String responsible) {
        this.id = id;
        this.cartype_name = cartype_name;
        this.responsible = responsible;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCartype_name() {
        return cartype_name;
    }

    public void setCartype_name(String cartype_name) {
        this.cartype_name = cartype_name;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    @Override
    public String toString() {
        return "cartypeLei{" +
                "id=" + id +
                ", cartype_name='" + cartype_name + '\'' +
                ", responsible='" + responsible + '\'' +
                '}';
    }
}
