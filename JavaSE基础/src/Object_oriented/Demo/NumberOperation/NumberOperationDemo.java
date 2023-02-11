package Object_oriented.Demo.NumberOperation;

public class NumberOperationDemo {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;
        Number number = new Number(number1,number2);
        number.getPlus();
        System.out.println();
        number.getMinus();
        System.out.println();
        number.getTimes();
        System.out.println();
        number.getDivided();
        System.out.println();
        System.out.println("The number1 and number2 are:" + number1 + "," + number2);



    }
}
