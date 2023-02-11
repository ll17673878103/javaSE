package Operators_Branch;

import java.util.Scanner;

public class IfelseDemo {
    //if语句格式3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期(1-7)");
        int number = sc.nextInt();
        if (number == 1){
            System.out.println("今天是星期一");
        }else if (number == 2){
            System.out.println("今天是星期二");
        }else if (number == 3){
            System.out.println("今天是星期三");
        }else if (number == 4){
            System.out.println("今天是星期四");
        }else if (number == 5){
            System.out.println("今天是星期五");
        }else if (number == 6){
            System.out.println("今天是星期六");
        }else if (number == 7){
            System.out.println("今天是星期天");
        }else if (number >=8){
            System.out.println("很抱歉你的时间不对");
        }
        System.out.println("美好的一天结束了");
    }
}
