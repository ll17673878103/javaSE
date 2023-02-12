package Object_oriented.Demo.PeopleInformation;


//用于调用PeolpeInformation类的测试类
public class PeolpeInformationDemo {
    public static void main(String[] args) {
        String name = "雷江龙";
        int age = 20;
        PeolpeInformation p = new PeolpeInformation(name, age);
        p.display();
    }


}
