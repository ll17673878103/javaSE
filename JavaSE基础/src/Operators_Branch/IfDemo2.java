package Operators_Branch;

import java.util.Scanner;

public class IfDemo2 {
    //if判断2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("是偶数");
        }else {
            System.out.println("不是偶数，是基数");
        }
        System.out.println("判断结束");
    }
}
