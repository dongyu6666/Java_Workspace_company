import org.junit.Test;
import pojo.Host;
import pojo.Proxy;
import pojo.ProxyInvocationHandler;
import pojo.Rent;

public class Client2 {

    public static void main(String[] args) {
        //真实角色：房东，租房子
        Host host = new Host();

        //代理帮你
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        
        //设置要代理的对象host
        pih.setTarget(host);

        //动态生成代理类
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();


    }
}
