package Object_oriented.StructureMethodTest;


//负责调用Food方法用于测试
public class FoodDemo {
    public static void main(String[] args) {
        //创建对象
        //无参构造方法
        Food food = new Food();
        food.show();


        //一个参数的构造方法
        Food food1 = new Food("蚂蚁上树");
        food1.show();

        Food food2 = new Food(100);
        food2.show();
        


        //两个参数的构造方法
        Food food3 = new Food("蒜蓉小龙虾",50);
        food3.show();
    }
}
