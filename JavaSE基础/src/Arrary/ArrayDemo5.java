package Arrary;


//本节内容讲解内存分配(多个数组指向相同)
public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("------------------");
        //手动将数组的三个索引赋值
        int[] arr2 = arr;
        arr2[0] = 4;
        arr2[1] = 5;
        arr2[2] = 6;
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
//        System.out.println(arr2[2]);
    }
}
