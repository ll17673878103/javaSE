package Object_oriented.Demo.PeopleInformation;
//PeolpeInformation类
/*
 * 构造方法 编写Java程序用于显示人的姓名和年龄。
 * 定义一个人类Person该类中应该有两个私有属性姓名name和年龄age。
 * 定义构造方法用来初始化数据成员。
 * 再定义显示display方法将姓名和年龄打印出来。
 * 在main方法中创建人类的实例然后将信息显示。
 * */
public class PeolpeInformation {
    private String name;
    private int age;
    public PeolpeInformation(String name1, int age1){
        this.name = name1;
        this.age = age1;
    }
    public void display(){
        System.out.println("该用户姓名为：" + name + "," + "年龄为：" + age);
    }
}
