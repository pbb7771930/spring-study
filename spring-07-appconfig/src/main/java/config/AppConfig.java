package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pojo.User;

/**
 * @author pbb77
 */

/*
这个也会Spring容器托管,注册到容器中,因为他本米就是一个@Component;
@Configuration表示这是一个配置类,就像我们之前看的beans.xml，类似于<beans>标签。
要么使用@Bean，要么使用@Component和ComponentScan，两种效果一样。
 */
@Configuration
@ComponentScan ("pojo") //开启扫描
@Import(AppConfig2.class) //当有多个配置类,用Import导入
public class AppConfig {

    //注册一个bean , 就相当于我们之前写的一个bean 标签
    //这个方法的名字,就相当于bean 标签中的 id 属性 ->getUser
    //这个方法的返同值,就相当于bean 标签中的class 属性 ->User
    @Bean
    public User getUser(){
        return new User(); //就是返回要注入到bean的对象!
    }
}
