import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Human;

public class MyTest {
    @Test
    public void  test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Human human = context.getBean("human",Human.class);
        human.getCat().shout();
        human.getDog().shout();

    }
}
