package Object_oriented.Demo.LianXi;

//调用Lianxi类用于测试
public class LianXiDemo {
    public static void main(String[] args) {
        String name = "雷江龙";
        LianXi lianXi = new LianXi();
        String name1 = lianXi.setName(name);
        System.out.println("该小伙名字叫做：" + name);
        System.out.println("--------------------");
        System.out.println("该小伙名字叫做：" + name1);

    }
}
