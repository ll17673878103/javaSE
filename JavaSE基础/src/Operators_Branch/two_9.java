package Operators_Branch;

public class two_9 {
    //两只老虎比体重案例
    public static void main(String[] args) {
        //定义两只老虎的体重
        int weight1 = 180;
        int weight2 = 200;

        //用三元运算符实现老虎的体重的判断，重量想同，返回true，不同则返回false
        boolean t = weight1 == weight2 ? true:false;
        System.out.println(t);
    }
}
