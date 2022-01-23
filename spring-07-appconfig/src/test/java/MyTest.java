import config.AppConfig;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.User;

public class MyTest {
    @Test
    public void test1(){
        //如果完全使用了配置类方式去做,我们就只能通过 Annotationconfig 上下文来获取容器,通过配置类的class对象加载!
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //class对象
        User user = (User) context.getBean("user"); //方法名getUser
        System.out.println(user.toString());

    }
}
