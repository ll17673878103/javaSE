package Operators_Branch;

public class two_10 {
    //3个和尚比身高案例
    public static void main(String[] args) {
        //定义三个和尚身高变量
        int heshang1 = 210;
        int heshang2 = 150;
        int heshang3 = 165;

        //用三元运算符来比较
        int a = heshang1 >heshang2 ? heshang1:heshang2;
        int b = a > heshang3 ? a:heshang3;
        System.out.println(b);
    }
}
