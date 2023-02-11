package Operators_Branch;

public class two_8 {
    //三元运算符
    public static void main(String[] args) {
        //格式：关系表达式1 ? 表达式1:表达式2
        //计算规则：
        //首先计算关系表达式的值
        //如果值为true，表达式1的值就是运算结果
        //如果值为false，表达式2的值就是运算结果

        //定义两个变量
        int a = 10;
        int b = 20;

        //获取两个数据中的较大值
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
