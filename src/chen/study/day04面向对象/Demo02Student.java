package chen.study.day04面向对象;

/*
 * 通常一个类不能直接使用，需要根据类创建一个对象，才能使用
 * 创建对象过程：1.导包：如果不在一个包内，需要用import.cn.itcast.day01.demo02,如果在一个包内则不需要导包
 * 2.创建：格式：
 * 类名称 对象名 = new 类名称（）；
 * 3.使用：分两种方法：
 * （1）：如何使用成员变量：对象名.成员变量名
 * （2）：如何使用成员方法：对象名.成员方法名（参数）
 *
 *
 * 如果成员变量没有赋值，则会有一个默认值，其规则与数组一样*/
public class Demo02Student {
    public static void main(String[] args) {
        //1.导包：我需要的student类在同一个包下，所以不用导包。
        //2.创建：格式：
        //类名称 对象名 = new 类名称（）
        //根据Student类创建一个名为stu的对象
        Student stu = new Student();

        //3.使用其中的成员变量
        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        System.out.println("============================");

        //改变对象当中的成员变量的内容
        stu.name="张三";
        stu.age=20;
        System.out.println(stu.name);//张三
        System.out.println(stu.age);//20
        System.out.println("+++++++++++++++++++++++++++++++++");

        //使用对象的成员方法，格式：
        //对象名.成员方法（参数）
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
