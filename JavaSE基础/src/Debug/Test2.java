package Debug;

//案例求数组内各位和十位不是7并且是偶数，求符合的数据之和
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {68,27,95,88,171,996,51,210};
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i ]%10 != 7 && arr[i]/10%10 != 7 && arr[i]%2 == 0){
                count += arr[i];
            }
        }
        System.out.println("偶数之和:" + count);
    }
}
