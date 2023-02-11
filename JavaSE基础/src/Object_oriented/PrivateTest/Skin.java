package Object_oriented.PrivateTest;


import java.util.Random;
import java.util.Scanner;

//本节内容为private关键字
public class Skin {
    //定义成员变量
    String seller;//卖家
    String buyer;//买家
    private int buyer_money;//买家资金
    String skin_name;//皮肤名字
    private int skin_price;//皮肤价格

    //创建set，get方法
    public int getBuyer_money() {
        return buyer_money;
    }

    public void setBuyer_money(int buyer_money) {
        if (buyer_money == 0){
            System.out.println("没钱你买啥皮肤");
        }else{
            this.buyer_money = buyer_money;
        }
    }

    public int getskin_price() {
        return skin_price;
    }

    public void setSkin_price(int skin_price1) {
        if (skin_price1 <= 0){
            System.out.println("价格不太对劲");
        }else{
            this.skin_price = skin_price1;
        }
    }

    public void show(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("请输入你要买的皮肤" );
        skin_name = sc.next();
        skin_price = random.nextInt(300);
        System.out.println("该皮肤价格在：" + skin_price + "软妹币");
        if (skin_price <= 0){
            System.out.println("天上不会掉馅饼");
        }else if (buyer_money <= skin_price){
            System.out.println("太贵了");
        }else{
            System.out.println("拿下");
        }
    }
}
