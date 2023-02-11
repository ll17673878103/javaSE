package Method;


//本节知识点为方法重载
public class MethodDemo3 {
    public static void main(String[] args) {
        System.out.println(fn(10));
        System.out.println("------------");
        System.out.println(fn(1,2));
        System.out.println("------------");
        System.out.println(fn(1,2,3));

    }
    public static int fn(int a){
        return a;
    }
    public static int fn(int a, int b){
        return a + b;
    }
    public static int fn(int a, int b, int c){
        return a + b + c;
    }
}
