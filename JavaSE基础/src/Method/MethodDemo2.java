package Method;


//本节知识点讲解带返回值和参数的方法调用
public class MethodDemo2 {
    public static void main(String[] args) {
        int max = getMax(10,20);
        System.out.println(max);
    }
    public static int getMax(int a, int b){
        //三元运算符,解释:如果a>b,将a赋值给max,如果a<b,则将b赋值给max
        int max = a > b ? a:b;
        System.out.println("最大数为:");
//        System.out.println(max);
        return max;
    }


}
