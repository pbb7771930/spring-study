package demo01;

/**
 * @author pbb77
 */
//代理类
public class Proxy {
    public Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        super();
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        fee();
        sign();
    }
    //看房
    public void seeHouse() {
        System.out.println("看房子");
    }
    //收费
    public void fee() {
        System.out.println("收中介费");
    }
    //合同
    public void sign() {
        System.out.println("签合同");
    }
}
