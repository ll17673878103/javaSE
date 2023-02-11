package Object_oriented.Demo.NumberOperation;


//Number类
/*
04.构造方法 编写Java程序模拟简单的计算器。
定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
编写构造方法赋予n1和n2初始值
再为该类定义加addition、减subtration、乘multiplication、除division等公有成员方法分别对两个成员变量执行加、减、乘、除的运算。
在main方法中创建Number类的对象调用各个方法并显示计算结果。

*/

public class Number {
    //定义私有变量
    private int number1;
    private int number2;

    //构造方法
    public Number(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

}
