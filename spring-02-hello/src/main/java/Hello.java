/**
 * @author pbb
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        //从beans.xml的 property 属性中获取值
        return "hello对象的name属性值为： {" + name + "}";
    }
}
