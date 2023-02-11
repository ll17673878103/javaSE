package Debug;
//案例百钱百鸡，公鸡五文钱一只，母鸡三文钱一只，小鸡一文钱三只，请问百钱百鸡，公鸡，母鸡，小鸡可以买多少只
public class Test {
    public static void main(String[] args) {
        //设公鸡的范围
        for (int i = 0; i < 20; i++) {
            //假设母鸡的范围
            for (int j = 0; j < 33; j++) {
                //小鸡的范围
                int x = 100 - i - j;
                //满足条件买小鸡的单价要为0且三类鸡的价格为100文钱
                if (x % 3 ==0 && 5*i + 3*j + x/3 == 100){
                    System.out.println("公鸡:" + i + "," + "母鸡:" + j + "," + "小鸡:" + x);
                }
            }
        }
    }
}
