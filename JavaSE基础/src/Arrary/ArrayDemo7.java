package Arrary;
/*
* 数组的常见操作
* */
public class ArrayDemo7 {
    public static void main(String[] args) {
        //遍历,获取数组的元素个数
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-----------");
//            格式:数组名.length
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
        System.out.println("-----------");
    }
}