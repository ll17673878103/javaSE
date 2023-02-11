package Operators_Branch;

/*
* 字符串的 "+" 操作
*
* */

public class two_2 {
    public static void main(String[] args) {
        System.out.println("阿宰" + "陈平安");
        System.out.println("阿宰" + 666);
        System.out.println(123456 + "石昊");
        // 字符串开头，后面如果是数字和数字之间相加即为拼接
        System.out.println("那年我双手插兜，根本不是到什么叫做对手" + 1 + 66);
        // 若数字加数字开头，字符串结尾 则数字为数字相加然后与字符串拼接
        System.out.println(1 + 66 + "那年我双手插兜，根本不是到什么叫做对手");

    }
}
