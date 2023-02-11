package Method;
//本节练习数组求最大值
public class ArraryMethodDemo2 {
    public static void main(String[] args) {
        int[] arr = {1,23,45,6,7,8};
        int number = sysolist(arr);
        System.out.println("最大值:" + number);
    }
    public static int sysolist(int[] arr){
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
