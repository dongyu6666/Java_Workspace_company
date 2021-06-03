package pojo;

public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        pay();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带看房子");
    }
    //付中介费
    public void pay(){
        System.out.println("付中介费用");
    }

}
