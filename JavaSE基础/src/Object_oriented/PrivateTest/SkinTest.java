package Object_oriented.PrivateTest;

import java.util.Random;
import java.util.Scanner;
//此代码负责调用Skin类用于测试
public class SkinTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Skin skin = new Skin();
        System.out.println("请输入卖家");
        skin.seller = sc.next();
        System.out.println("请输入买家");
        skin.buyer = sc.next();
        System.out.println("买家的软妹币有:");
        skin.setBuyer_money(random.nextInt(300));
        System.out.println(skin.getBuyer_money());
        skin.show();

    }
}
