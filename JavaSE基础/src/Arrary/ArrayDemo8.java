package Arrary;
/*
* 数组的常见操作:取最大值或最小值
* */
public class ArrayDemo8 {
    public static void main(String[] args) {
        int[] arr = {1,34,65,76,7,8,9,123};
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值为:" + max);
    }
}
