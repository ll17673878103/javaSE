package Method;


//本节所学方法的定义以及调用
//先定义方法才能调用
public class MethodDemo1 {
    public static void main(String[] args) {
        //方法的调用
        isEvenNumber();
    }
    //方法的定义
    public static void isEvenNumber(){
        int number = 9;
        if (number%2 == 0){
            System.out.println("此数字为偶数");
        }else {
            System.out.println("次数为奇数");
        }
    }
}
