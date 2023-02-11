package Operators_Branch;

import java.util.Scanner;

public class Ifelse_exercise {
    public static void main(String[] args) {
        /*小明考试，根据成绩不同奖励不同
            95-100分奖励一辆自行车
            90-94分奖励游乐园玩一次
            80-89分奖励机器人一个
            80分一下皮燕子一顿
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("罗阳考的分数为：");
        int num = sc.nextInt();
        if (num >=95 && num <=100){
            System.out.println("奖励一辆自行车");
        }else if (num >=90 && num <=94){
            System.out.println("奖励罗阳游乐园一次");
        }else if (num >=80 && num <=89) {
            System.out.println("奖励罗阳机器人一个");
        }else if (num > 100 || num < 0){
            System.out.println("成绩错误");
        }else {
            System.out.println("奖励罗阳皮燕子一顿");
        }
    }
}
