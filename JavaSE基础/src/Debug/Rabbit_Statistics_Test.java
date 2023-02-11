package Debug;


//不死神兔案例
/*
* 一对兔子长到第三个月开始生一对崽，兔崽子等长到第三个月也生一对
* 请问第二十个月有多少对兔子
* */
public class Rabbit_Statistics_Test {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        rabbot_statistics(arr);
        System.out.println("第二十个月的数量" + arr[19]);
    }
    public static void rabbot_statistics(int[] arr){
        for (int i = 2; i < arr.length ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
    }
}
