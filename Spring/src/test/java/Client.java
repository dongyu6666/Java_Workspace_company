import pojo.Host;
import pojo.Proxy;

public class Client {
    public static void main(String[] args) {
        //房东租房子
        Host host = new Host();

        //代理帮你
        Proxy proxy = new Proxy();

        //直接找中介就行
        proxy.rent();
    }
}
