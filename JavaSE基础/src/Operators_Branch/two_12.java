package Operators_Branch;

import java.util.Scanner;

public class two_12 {
    //三个和尚身高案例升级版
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高：");
        int hs1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高：");
        int hs2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高：");
        int hs3 = sc.nextInt();

        //利用三元运算符比较获得最高身高
        int a = hs1 > hs2 ? hs1:hs2;
        int max = a >hs3 ? a:hs3;
        System.out.println("最高身高为:");
        System.out.println(max);
    }
}
