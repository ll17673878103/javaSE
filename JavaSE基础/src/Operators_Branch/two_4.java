package Operators_Branch;

public class two_4 {
    //自增自减运算符
    //++是每次加1 --是每次减1
    public static void main(String[] args) {
        //定义变量，单独使用的时候++或--放前放后都一样
        int i = 1;
        System.out.println(i);
        i ++;
        System.out.println(i);

        int x = 10;
        System.out.println(x);
        x --;
        System.out.println(x);

        //参与操作使用
        int j = i ++;
        System.out.println(i);
        System.out.println(j);
        //j输出为2，i输出为3，因为++在参数后面，他会先将参数赋值给j，然后i再++
        //如果是++i的话，会先将i加1，然后赋值给j，最后输出都是3
    }
}
