package demo01;

//客户要租房子
public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new HostMaster();
        //中介帮房东出租房子，但也收取一定费用（增加一些房东不做的操作）
        Proxy proxy = new Proxy(host);
        //看不到房东，但通过代理，还是租到了房子
        proxy.rent();

    }
}
