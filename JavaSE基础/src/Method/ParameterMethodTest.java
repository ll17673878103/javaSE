package Method;
import java.util.Scanner;
//本节知识点带参数的方法定义
/*
*格式:public static void 方法名(参数){.....}
*单个参数的格式:public static void 方法名(数据类型 变量名){.....}
*多个参数的格式:public static void 方法名(数据类型 变量名1, 数据类型 变量名2....){.....}
*
* 注意:方法定义时,参数中的数据类型和变量名一个都不能少,缺少任何一个都会导致程序报错
*
* */
public class ParameterMethodTest {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("第一个数字为:");
        int a = src.nextInt();
        System.out.println("第二个数字为:");
        int b = src.nextInt();

        getMax(a,b);
    }
    public static void getMax(int a, int b){
        //三元运算符,解释:如果a>b,将a赋值给max,如果a<b,则将b赋值给max
        int max = a > b ? a:b;
        System.out.println("最大数为:");
        System.out.println(max);
    }

}
