package Cycle;


import java.util.Scanner;

public class SwitchDEmo {
    /**
     * 格式说明
     * 表达式: 取值byte，short,int,char,JDK5以后可以是枚举，JDK7以后可以为String
     * case: 后面跟的是要和表达式进行比较的值
     * break: 表达式中断，结束的意思，用来结束switch语句
     * default: 表示所有情况都不匹配的时候，就会执行该处的内容，和if语句的else很想
     *
     *执行流程：
     * 首先计算表达式的值
     *依次和case后面的值进行比较，如果有对应得值，就会执行相应得语句，，在执行得过程中，遇到break就会终止运行
     *如果所有得case后面得值和表达式都不匹配， 就会执行default里面得语句，然后程序结束
     *
     *
     * */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //输入一个1-7的数字
        System.out.println("请输入一个数字");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("今天星期一");
                break;
            case 2:
                System.out.println("今天星期二");
                break;
            case 3:
                System.out.println("今天星期三");
                break;
            case 4:
                System.out.println("今天星期四");
                break;
            case 5:
                System.out.println("今天星期五");
                break;
            case 6:
                System.out.println("今天星期六");
                break;
            case 7:
                System.out.println("今天星期天");
                break;
            default:
                System.out.println("你的脑子瓦特了，没有星期八或者超过星期天的");
        }
        System.out.println("程序结束");
    }
}
