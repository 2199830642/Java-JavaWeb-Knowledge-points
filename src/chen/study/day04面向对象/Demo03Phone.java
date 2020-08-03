package chen.study.day04面向对象;

public class Demo03Phone {
    public static void main(String[] args) {
        //根据Phone类创建一个名为a的对象
        //格式：类名称 对象名 = new 类名称（）
        Phone a = new Phone();
        System.out.println(a.brand);//null
        System.out.println(a.price);//0.0
        System.out.println(a.color);//null
        System.out.println("====================");

        a.brand="iphone";
        a.color="金色";
        a.price=9999.9;
        System.out.println(a.brand);//iphone
        System.out.println(a.price);//9999.9
        System.out.println(a.color);//金色
        System.out.println("====================");

        a.call("张三");
        a.sendMessage();
    }
}
