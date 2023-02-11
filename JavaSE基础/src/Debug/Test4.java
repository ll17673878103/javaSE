package Debug;
import java.util.Scanner;
//案例数组查找
public class Test4 {
    public static int Find(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("查到了");
                index = i;
                break;
            }
            System.out.println("下表位置" + i + ",遍历数组未找到该数字,将所查找的数字下标归为变量index的值");
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,43,5,46,57,7,56,85,3,456,34,52,12,34,23,534,65,47,457,56,8765,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的数字");
        int number = sc.nextInt();
        int index = Find(arr, number);
        System.out.println("他的下标位置:" + index);
    }
}
