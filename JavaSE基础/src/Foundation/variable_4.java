package Foundation;
/*
* 变量定义的注意事项：
*              1.变量没有赋值，不能直接使用
*              2.变量只在他所属的范围内有效,变量属于他所在的那对花括号里面
*              3.一行代码上可以定义多个变量，但是不要这么定义
*
*
*
* */

public class variable_4 {
    public static void main(String[] args) {
        int a = 10;
        int b;
        System.out.println(a);
        b = 10;
        System.out.println(b);
        {
            byte c = 50;
            System.out.println(c);

        }
        }


}
