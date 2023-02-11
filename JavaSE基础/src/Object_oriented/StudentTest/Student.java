package Object_oriented.StudentTest;

import java.util.Random;
import java.util.Scanner;

public class Student {
    //创建两个对象
    String student_name;
    int student_age;

    public static void getstudy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要学习的科目");
        String subject = scanner.next();
        System.out.println(subject + "学了很久很久");
    }

    public static void getexamination(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("请输入考试的科目");
        String subject = scanner.next();
        System.out.println("该科目成绩为:" );
        int number = random.nextInt(100);
        System.out.println(number);
        }
    public static void getclass(){
        Random random = new Random();
        System.out.println("班级班号为:" + random.nextInt(200 + 1));
    }
    public static void rangking(){
        Random random = new Random();
        System.out.println("排名为:" + random.nextInt(1000));
    }
    public static void menu() {
        System.out.println("请选择你接下来的操作: " +
                "1.学习记录  " +
                "2.查询成绩  " +
                "3.查询班级 " +
                "4.查询排名 ");
    }
}
