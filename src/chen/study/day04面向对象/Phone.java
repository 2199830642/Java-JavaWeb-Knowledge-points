package chen.study.day04面向对象;
/*
* 定义一个类，模拟手机
* 属性：品牌，颜色，价格
* 行为：打电话，发短信
*
* 成员变量：
* String brand；品牌
* double price；价格
* String color；颜色
* 成员方法：
* public void call（）{}；打电话
* public void sendMessage（）{}；群发短信*/
public class Phone {
    //成员变量
    String brand;
    double price;
    String color;

    //成员方法
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }

    public  void  sendMessage(){
        System.out.println("群发短信");
    }
}
