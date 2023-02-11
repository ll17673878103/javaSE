package Object_oriented.Demo.TrafficTool;

import java.util.Scanner;

public class TrafficToolDemo {
    public static void main(String[] args) {
        TrafficToolBan t = new TrafficToolBan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the starting speed：");
        int speed = sc.nextInt();
        System.out.println("Please enter the starting size：" );
        String size = sc.next();
        System.out.println("speed is" + speed + "," + "size is" + size);
        t.move();
        t.speedUp();
        t.speedDown();
        System.out.println("speed is" + speed + "," + "size is" + size);
    }
}
