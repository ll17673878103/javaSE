package Object_oriented.Demo.TimeOperation;

public class MyTimeDemo {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(12,13,14);
        myTime.display();
        System.out.println();
        int sec = 5;
        int hou = 4;
        int min = 2;
        myTime.addHour(hou);
        System.out.println();
        myTime.addMinute(min);
        System.out.println();
        myTime.addSecond(sec);
        System.out.println();
        myTime.subHour(hou);
        System.out.println();
        myTime.subMinute(min);
        System.out.println();
        myTime.subSecond(sec);
        System.out.println();
        System.out.println("The hour:" + hou + "," + "The minute:" + min + "," + "The second:" + sec);
        System.out.println();

    }

}
