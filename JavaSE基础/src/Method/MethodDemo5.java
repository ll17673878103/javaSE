package Method;
//本节知识点为方法参数传递(引用数据类型)
public class MethodDemo5 {
    public static void main(String[] args) {
        int[] arr = {10,20,40};
        System.out.println(arr[1]);
            //调用方法
        change(arr);
        System.out.println(arr[1]);
    }
    public static void change(int[] arr){
        arr[1] = 200;
    }
}
