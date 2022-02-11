package demo01;

/**
 * @author pbb77
 */ //真实的房东角色

public class HostMaster implements Host{

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
