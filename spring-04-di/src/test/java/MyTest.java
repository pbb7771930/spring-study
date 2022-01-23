import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;
import pojo.User;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    /*
    输出：
    Student{
    name=pbb,
    address= Address=null,
    books=[三国演义, 西游记, 红楼梦, 水浒传],
    hobbys=[打篮球, 踢足球, 游泳],
    card={身份证=33262584652212,
    护照=69455612},
    games=[LOL, WOW, BOB],
    wife=null,
    info={
        学号=2016056854,
        性别=男,
        姓名=pbb
        }

     */

    /*
    测试p命名空间
     */
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }
    /*
    输出：
    User{name='pbb-p空间方式注入', age='18'}
     */

    /*
        测试c命名空间
 */
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = (User) context.getBean("user2");
        System.out.println(user.toString());
    }
    /*
    输出：
    User{name='pbb-c空间方式注入', age='18'}
     */

    /*
    测试默认的scope属性是否为singleton
     */
    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = (User) context.getBean("user2");
        User user2 = (User) context.getBean("user2");
        //当scope="singleton" 时，或者 默认不加scope时，以下输出为true
        //说明每次从容器中get对象的时候，获取的是同一个对象;单线程的时候用
        //System.out.print(user==user2);

        //当scope="prototype" 时，以下输出为false,两个对象不同
        //说明每次从容器中get对象的时候，都会产生一个新的对象;多线程的时候用
        System.out.println(user==user2);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
    }

}
