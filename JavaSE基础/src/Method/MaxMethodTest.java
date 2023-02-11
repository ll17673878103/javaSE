package Method;
//本节知识点讲解创建方法并实现功能区较大值
public class MaxMethodTest {
    public static void main(String[] args){
        getMax();
    }
    public static void getMax(){
        int a = 10;
        int b = 20;
        //三元运算符,解释:如果a>b,将a赋值给max,如果a<b,则将b赋值给max
        int max = a > b ? a:b;
        System.out.println(max);
    }
}