package Object_oriented.Demo.GuessNumber;


import java.util.Random;

//猜数字案例
/*
* 类的成员变量
* 猜数字游戏
* 一个类A有一个成员变量v有一个初值100。
* 定义一个类对A类的成员变量v进行猜。
* 如果大了则提示大了小了则提示小了。等于则提示猜测成功。
* */
public class Guess_number{
    Random random = new Random();
    public int number = random.nextInt(100);
}
