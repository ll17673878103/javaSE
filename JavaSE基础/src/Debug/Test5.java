package Debug;
//案例数组反转
public class Test5 {
    //此方法实现反转的功能
    public static void reversal(int[] arr){
        //循环遍历数组，这一次初始化语句定义两个索引变量，判断条件为开始索引小于等于结束索引
        for (int start = 0, end = arr.length-1; start <=end ; start++, end--) {
            //将开始索引的值赋给start_arr变量里面
            int start_arr = arr[start];
            //修改开始索引变量的值为结束索引的值
            arr[start] = arr[end];
            //修改结束索引变量的值为开始索引的值
            arr[end] = start_arr;
        }
    }
    //此方法实现遍历数组
    public static void traversal_arr(int[] arr){
        System.out.print("[");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //判断遍历输出的值是否为最后一个
            if (i == arr.length -1){
                //是最后一个不用加逗号，不是就要在数字后面加逗号
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }
    //main方法实现创建arr数组以及调用方法
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //调用方法
        reversal(arr);
        traversal_arr(arr);
    }
}
