package Operators_Branch;

public class IfDemo {
    //if语句1
    /*
    * 格式：
    * if(关系表达式){
    *    语句体
    * }
    * */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a == b){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
        int c = 10;
        if (c == a){
            System.out.println("相等1");
        }
        System.out.println("结束");
    }
}
