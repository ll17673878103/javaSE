package Debug;
import java.util.Scanner;
//大二学习计划案例2switch版本
public class Lose_weightTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你准备干事的星期");
        int week = sc.nextInt();;
        lose_weight(week);
    }
    public static void lose_weight(int week){
        switch (week){
            case 1:
                System.out.println("周一练习java");
                break;
            case 2:
                System.out.println("周二练习java");
                break;
            case 3:
                System.out.println("周三练习java");
                break;
            case 4:
                System.out.println("周四练习java");
                break;
            case 5:
                System.out.println("周五练习java");
                break;
            case 6:
                System.out.println("周六练习java");
                break;
            case 7:
                System.out.println("周日练习java");
                break;
            default:
                System.out.println("爪洼岛没有找到你说的星期八，你个小傻瓜");
        }
    }
}
