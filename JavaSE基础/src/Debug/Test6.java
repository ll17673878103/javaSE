package Debug;

import java.util.Scanner;

//案例：评委打分
/*
* 题目要求：
*    1.六个评委打分，求平均分
*   2.去除最大分和最小分
*
*
*
* 实现思路
* 1.遍历数组
* 2.创建获取最大值和最小值方法
* 3.创建求和方法
* 4.在main方法中调用创建好的方法，然后根据题目要求编写出平均值的代码即可
* */
public class Test6 {
    //getCount方法实现求和
    public static int getCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count;
    }

    //getMin方法实现求出最小值
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    //getMax方法实现求出最大值
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    //printarr方法实现数组遍历
    public static void printarr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.println(arr[i] + ",");
            }
        }
        System.out.print("]");
    }

    //main方法实现创建数组以及方法的调用和求出平均分
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        //循环六遍打分
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("第" + (i + 1) + "位评委打分:");
            arr[i] = sc.nextInt();
            //调用方法
            int max = getMax(arr);
            System.out.println(max);
            int min = getMin(arr);
            System.out.println(min);
            int count = getCount(arr);
            System.out.println(count);
            //定义avg变量按要求求平均分
            int avg = (count - max - min) / (arr.length-2);
            System.out.println("平均分为:" + avg);
        }

    }

}
