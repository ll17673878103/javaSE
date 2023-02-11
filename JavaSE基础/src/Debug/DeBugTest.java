package Debug;


import java.util.Scanner;

//Debug查看方法的调用
public class DeBugTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字a");
        int a = sc.nextInt();
        System.out.println("请输入一个数字b");
        int b = sc.nextInt();
        int max = getmax(a,b);
        System.out.println("两者比较跟大的为:" + max);
    }
    public static int getmax(int a, int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }
}
