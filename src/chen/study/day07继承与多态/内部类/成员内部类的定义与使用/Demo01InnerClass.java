package chen.study.day07继承与多态.内部类.成员内部类的定义与使用;

/*
* 如果一个事物的内部 包含另一个事物，这就是一个类包括另外一个类
* ：身体与心脏的关系，汽车与发动机
*
* 分类
* 1.成员内部类
* 2.局部内部类（包含匿名内部类）
*
* 1.成员内部类的格式：
* 修饰符 class 类名称{      外部类名称
*  修饰符 class 类名称{}    内部类名称
* }
* 注意：内用外，随意使用，外用内，一定需要借助内部类对象
*
* 如何使用成员内部类：
* 1.间接使用：在外部类的方法中使用内部类，main只是调用外部类方法
* 2.直接使用：公式：【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】
* */
public class Demo01InnerClass {

    public static void main(String[] args) {

        //通过外部类对象调用外部类的方法，然后里面再间接使用内部类的方法
        Body body = new Body();
        body.setName("小陈");
        body.method();

        //直接调用
        Body.heart heart = new Body().new heart();
        heart.beat();
    }
}
