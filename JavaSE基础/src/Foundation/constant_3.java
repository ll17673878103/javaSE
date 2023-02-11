package Foundation;

// java基础-常量
public class constant_3 {
    // 常量加了final就不可以修改常量的值
    // finall static String name = "阿宰"
    static String name = "阿宰";
    public static void main(String[] args) {
        name = "陈平安";
        System.out.println(name);
        // 输出字符串常量
        System.out.println("陈平安");
        // 输出整数常量
        System.out.println(525);
        // 输出小数常量
        System.out.println(5.25);
        // 输出字符常量
        System.out.println('宰');
        // 输出布尔值
        System.out.println(true);
        // 输出空值
        System.out.println();
    }
}
