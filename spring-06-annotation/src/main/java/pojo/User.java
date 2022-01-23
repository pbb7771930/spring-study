package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author pbb77
 */
//@Component 组件,等价于<bean id="user" classs"pojo.User"/>
@Component
public class User {
    //相当于<property name="name" value="pbb"/>
    @Value("pbb")
    public String name ;

    //也可以放在set方法上面
    //@value("pbb")
    public void setName(String name) {
        this.name = name;
    }
}
