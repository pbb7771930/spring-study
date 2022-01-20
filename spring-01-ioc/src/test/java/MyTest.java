
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserServiceImpl;


public class MyTest {
    public static void main(String[] args) {

/*        //用户实际调用的是业务层，dao层不用去接触
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDao2Impl());
        //((UserServiceImpl)userService).setUserDao(new UserDao3Impl());
        //((UserServiceImpl)userService).setUserDao(new UserDaoImpl());
        userService.getUser();
 */
        //使用spring后，不用再去new对象，直接读取配置文件
        //获取ApplicationContext，拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");


        //需要什么直接get bean.xml中对象的id值；
        // 当需要改实现的时候，不需要修改代码，直接修改bean.xml文件中的 ref<property name="userDao" ref="dao2Impl" ></property>
       UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
       userService.getUser();
    }


}
