package Object_oriented.PhoneTest;
public class PhoneTest {
    //此方法负责调用Phone类测试
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.phone_name);
        System.out.println(phone.phone_price);
        phone.phone_name = "鸭梨牌山寨手机";
        phone.phone_price = 1000;
        System.out.println(phone.phone_name);
        System.out.println(phone.phone_price);
        //调用成员方法
        Phone.getshort_message();
        Phone.getcall();
    }
}
