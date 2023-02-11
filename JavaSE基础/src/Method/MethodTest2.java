package Method;


//方法重载练习
public class MethodTest2 {
    public static void main(String[] args) {
        System.out.println(fn(10,20));
        System.out.println(fn((byte) 10, (byte) 20));
        System.out.println(fn((long) 10,(long) 20));
        System.out.println(fn((short) 10, (short) 20));

    }
    public static boolean fn(int a, int b){
        System.out.println("-----int-----");
        return a == b;
    }
    public static boolean fn(short a, short b){
        System.out.println("-----short-----");
        return a == b;
    }
    public static boolean fn(long a, long b){
        System.out.println("-----long-----");
        return a == b;
    }
    public static boolean fn(byte a, byte b){
        System.out.println("-----byte-----");
        return a == b;
    }
}
