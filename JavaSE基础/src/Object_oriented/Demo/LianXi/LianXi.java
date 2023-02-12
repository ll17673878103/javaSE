package Object_oriented.Demo.LianXi;
//定义LianXi类
/*
*get方法和set方法
* 定义一个类该类有一个私有成员变量通过构造方法将其进行赋初值并提供该成员的getXXX()和setXXX()方法
* 提示假设有private String name;
* */

public class LianXi {
    //创建对象
    private String name;
    //创建无参构造方法
    public LianXi(){

    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }
}
