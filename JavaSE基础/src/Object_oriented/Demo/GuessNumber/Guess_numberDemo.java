package Object_oriented.Demo.GuessNumber;


import java.util.Scanner;

//用于调用Guess_number方法实现猜数字
public class Guess_numberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guess_number guess_number = new Guess_number();
        while (1 == 1){
            System.out.println("请输入一个数字");
            int number = sc.nextInt();
            if (number < guess_number.number) {
                System.out.println("数字猜小了");
            }else if (number > guess_number.number){
                System.out.println("你猜大了");
            }else {
                System.out.println("恭喜你才对了");
                break;
            }
        }
    }
}
