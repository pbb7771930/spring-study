import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //该方法创建对象后，执行了User的默认构造方法，输出 "我是User的默认构造方法"
        //User user = new User();

        //使用spring容器实例化
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //输出 "我是User的默认构造方法"，说明spring创建对象同样调用了默认的构造方法
        User user  = (User) context.getBean("user");
        user.show();
    }
}
