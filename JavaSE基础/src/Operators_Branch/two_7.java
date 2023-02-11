package Operators_Branch;

public class two_7 {
    //短路逻辑运算符
    //&& 短路与   ||短路或
    public static void main(String[] args) {
        //定义变量
        int i = 10;
        int x = 20;
        int t = 30;

        //&&(短路逻辑与) 有false就false，有true不一定true
        System.out.println("短路与");
        System.out.println((i > x) && (i > t));
        System.out.println((i < x) && (i > t));
        System.out.println((i > x) && (i < t));
        System.out.println((i < x) && (i < t));

        // ||(短路逻辑或) 有一个是true就能返回ture
        System.out.println("短路或");
        System.out.println((i > x) || (i > t));
        System.out.println((i < x) || (i > t));
        System.out.println((i > x) || (i < t));
        System.out.println((i < x) || (i < t));

        System.out.println("逻辑与");
        System.out.println((i ++ >100) & (x ++ >100));
        System.out.println(i);
        System.out.println(x);

        System.out.println("短路与");
        System.out.println((i ++ >100) && (x ++ >100));
        System.out.println(i);
        System.out.println(x);
        //短路与和逻辑与的区别：作用相似
        /*
        * 逻辑与：无论左边真假，右边都套执行
        * 短路与：因为一边的判断是false，所以返回的结果就是false，导致右边的x没有运行
        *
        *逻辑或和短路或区别类似：作用相似
        * 逻辑或：无论左边真假，右边都套执行
        * 短路或其中左边为true，返回的便是true，右边将不会执行
        *
        * */

    }
}
