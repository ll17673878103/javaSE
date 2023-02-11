package Object_oriented.Demo.TrafficTool;

import javafx.scene.Scene;

import java.util.Random;
import java.util.Scanner;

//交通工具类
/*
* 类的成员变量
* 请定义一个交通工具(TrafficToolBan)的类其中有:
* 属性速度(speed)体积(size)等等 方法移动(move())设置速度(setSpeed(int speed))加速speedUp(),减速speedDown()等等.
* 最后在测试类Vehicle中的main()中实例化一个交通工具对象并通过方法给它初始化speed,size的值并且通过打印出来。
* 另外调用加速减速的方法对速度进行改变。
* */
public class TrafficToolBan {
    private int speed;//速度
    private String size;//体积
    //移动方法
    public void move(){
        System.out.println("I am moving");
    }

    //设置速度方法
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        System.out.println("acceleration");
        TrafficToolBan t = new TrafficToolBan();
        if (speed <= 0 || speed >60) {
            System.out.println("Error message");
        }else {
            this.speed = speed;
            System.out.println("The car speed is " + this.speed + " per hours");
        }
    }
    public void speedUp(){
        System.out.println("deceleration");
        TrafficToolBan t = new TrafficToolBan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your acceleration code");
        t.setSpeed(sc.nextInt());
    }
    public void speedDown() {
        TrafficToolBan t = new TrafficToolBan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the deceleration code");
        t.setSpeed(sc.nextInt());
    }
}
