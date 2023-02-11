package Object_oriented.StudentTest;

import java.util.Scanner;
//用于测试Student类的方法
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("请输入学生姓名");
        student.student_name = sc.next();
        System.out.println(student.student_name);
        System.out.println("请输入年纪");
        student.student_age = sc.nextInt();
        System.out.println(student.student_age);
        System.out.println("-------分界线------");
        Student.menu();
        int serial_number;
        String line = "yes";
        do {
            System.out.println("请选择:");
            serial_number = sc.nextInt();
            switch (serial_number) {
                case 1:
                    Student.getstudy();
                    break;
                case 2:
                    Student.getexamination();
                    break;
                case 3:
                    Student.getclass();
                    break;
                case 4:
                    Student.rangking();
                    break;
            }
            System.out.println("请问还要继续操作吗(输入yes返回菜单,输入其他数字，符号，字母结束程序运行)");
            line = sc.next();
        }while (line.equalsIgnoreCase("yes"));
        System.out.println("拜拜");
    }
}
