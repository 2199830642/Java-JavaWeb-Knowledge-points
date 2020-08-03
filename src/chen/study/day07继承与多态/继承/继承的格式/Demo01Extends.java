package chen.study.day07继承与多态.继承.继承的格式;

/*
* 在继承的关系中，子类就是一个父类，也就是说子类可以被当作父类看待
*
* 定义父类的格式：（普通的类定义）
* public class 父类名称（）{
*      //...
* }
*
* 定义子类的格式：
* public class 子类名称 extends 父类名称{
*       //...
* }
* */
public class Demo01Extends {

    public static void main(String[] args) {
        Teacher th = new Teacher();
        //Teacher类中虽然什么都没写，但是他继承了父类的method方法
        th.method();
    }
}
