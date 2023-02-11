package Method;
import java.util.Scanner;
//练习
public class MethodTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 2; i >=0; i--) {
            System.out.println("请输入数字密码(你一共有三次机会)");
            int password = sc.nextInt();
            if (getpwd(password) == "密码正确") {
                System.out.println(getpwd(password));
                break;
            }else if (i <= 0){
                System.out.println("你还剩" + i + "次机会");
                System.out.println("账号登录过于频繁");
            }else {
                System.out.println(getpwd(password) + "," + "请重新输入密码");
                System.out.println("你还剩" + i + "次机会");
            }
        }
    }
    public static String getpwd(int password){
        int true_pwd = 123456;
        if (password == true_pwd){
            return "密码正确";
        }else{
            return "密码错误";
        }
    }
}
