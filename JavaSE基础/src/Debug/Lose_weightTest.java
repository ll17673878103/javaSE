package Debug;


import java.util.Scanner;

//减肥计划if版本
public class Lose_weightTest {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入一个星期数");
        int number = sc.nextInt();
        lose_weight(number);
    }
    public static void lose_weight(int number){
        if (number < 1 || number > 7){
            System.out.println("你的时间观有问题");
        }else if (number == 1){
            System.out.println("周一跑步");
        }else if (number == 2){
            System.out.println("周二游泳");
        }else if (number == 3){
            System.out.println("周三慢走");
        }else if(number == 4){
            System.out.println("周四动感单车");
        }else if(number == 5){
            System.out.println("周五拳击");
        }else if (number == 6){
            System.out.println("周六爬山");
        }else if (number == 7){
            System.out.println("周日打游戏");
        }
    }
}
