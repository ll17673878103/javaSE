package API;

//String的构造方法
/*
*  方法名                                         说明
            public String()                  | 创建一个空白字符串对象，不含有任何对象
            public String(char[] chs)        | 根据字符数组的内容，来创建字符串对象
            public String(byte[] bys)        | 根据字节数组的内容，来创建字符串对象
            String s = "abc"                 | 直接赋值的方式创建字符串对象，内容为abc
* */
public class StringDemo1 {
    public static void main(String[] args) {
        // public String()
        String s1 = new String();
        System.out.println("s1:" + s1);

        System.out.println("--------------");

        //public String(char[] chs)
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        System.out.println("--------------");

        //public String(byte[] bys)
        byte[] bys = {};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        System.out.println("-------------");

        //推荐
        String s4 = "雷江龙";
        System.out.println("s4:" + s4);

    }
}
