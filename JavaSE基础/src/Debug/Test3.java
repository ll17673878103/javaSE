package Debug;
//案例比较两数组是否相同
public class Test3 {
    public static boolean TwoArrary(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            return true;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        //测试1
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        //测试2
//        int[] arr2 = {1,2,3,4,5,6,7,8};
        //测试3
//        int[] arr2 = {1,3,4,63,2,5,2,2,5};
        System.out.println(TwoArrary(arr1,arr2));
    }
}
