package Method;


//定义一个静态初始化数组，创建一个方法，方法实现功能遍历数组
public class ArraryMethodTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr[1]);
        arr(arr);
    }
    public static void arr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
