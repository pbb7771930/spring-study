/**
 * @author pbb77
 */
public class User {
    private String name;
    /**
     * 如果将无参构造方法改成带参数的构造方法，spring的bean.xml配置需要使用构造器方式
     */

/*    public User(){
        System.out.println("我是User的默认无参构造方法");
    }*/

    /**
     * 当使用带参数的构造方法时，bean.xml需要使用constructor-arg
     * @param name 名字
     */
    public User(String name){
        this.name = name;
        System.out.println("我是User的带参数构造方法");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("User的用户名为：" + name);
    }
}
