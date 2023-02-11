package Arrary;
/*
* 数组访问方式
* 格式: 数组名
*
* 数组内部保存的数据的访问方式
* 格式: 数组名[索引]
*
* */
//本节讲解数组的访问
public class ArrayDemo2 {
    public static void main(String[] args){
        //java数组必须初始化才能使用
//        String[] arr = new String[3];
        //输出null
//        int[] arr = new int[3];
        //输出0
//        double[] arr = new double[3];
        //输出0.0
        boolean[] arr = new boolean[3];
        //输出false
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
