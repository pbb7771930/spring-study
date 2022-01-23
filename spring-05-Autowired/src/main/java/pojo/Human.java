package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author pbb77
 */
public class Human {
    //如果显示定义了Autowired的required属性为false，说明这个对象可以为null,否则不能为空
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog1") //当bean对象有多个，并且无法通过自动装配找到对象时使用该注解
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
