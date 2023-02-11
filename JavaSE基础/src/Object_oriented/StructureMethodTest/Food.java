package Object_oriented.StructureMethodTest;


//构造方法练习1
public class Food {
    //创建私有对象
    private String food_name;
    private double food_price;
    //无参构造方法
    public Food(){
        System.out.println("无参构造方法");
    }

    public Food(String food_name){
        this.food_name = food_name;
    }

    public Food(double food_price){
        this.food_price = food_price;
    }

    public Food(String food_name, double food_price) {
        this.food_name = food_name;
        this.food_price = food_price;
    }
    //show方法
    public void show(){
        System.out.println("食品:" + food_name + "," + "价格:" + food_price);
    }
}
