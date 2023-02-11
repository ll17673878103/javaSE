package Method;


//本节知识点为方法参数的传递(基本数据类型)
public class MethodDemo4 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前数值为:" + number);
        change(number);
        System.out.println("调用change方法后数值为:" + number);

    }
    public static void change(int number){
        number = 200;
    }
}
