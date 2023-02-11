package Operators_Branch;

public class two_6 {
    //逻辑运算符
    /*
    * 逻辑运算符使用来连接关系表达式的运算符
    * 逻辑运算符也可以直接连接布尔类型的常量或者变量
    * */
    public static void main(String[] args) {
        //定义变量
        int i = 10;
        int x = 20;
        int t = 30;

        //&(逻辑与) 有false就false，有true不一定true
        System.out.println((i > x) & (i > t));
        System.out.println((i < x) & (i > t));
        System.out.println((i > x) & (i < t));
        System.out.println((i < x) & (i < t));

        // |(逻辑或) 有一个是true就能返回ture
        System.out.println((i > x) | (i > t));
        System.out.println((i < x) | (i > t));
        System.out.println((i > x) | (i < t));
        System.out.println((i < x) | (i < t));

        //^ 两个比较是相同的为false，不同的为true
        System.out.println((i > x) ^ (i > t));
        System.out.println((i < x) ^ (i > t));
        System.out.println((i > x) ^ (i < t));
        System.out.println((i < x) ^ (i < t));

        //! 结果与原来的相反
        System.out.println((i > x));
        System.out.println(!(i < x));
        System.out.println(!!(i > x));
        System.out.println(!!!(i < x));
    }
}
