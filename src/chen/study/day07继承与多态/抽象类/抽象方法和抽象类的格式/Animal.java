package chen.study.day07继承与多态.抽象类.抽象方法和抽象类的格式;

/*
 * 抽象方法：就是加上 abstract 关键字，然后去掉大括号，直接分号结束；
 * 抽象类：抽象方法所在的类，必须是抽象类，在class之前写上abstract
 *
 * 如何使用抽象类和抽象方法：
 * 1.不能直接建立抽象类对象
 * 2.必须用一个子类继承抽象父类
 * 3.子类必须覆盖重写父类所有的抽象方法
 * 覆盖重写（实现）：去掉抽象的abstract关键字，然后补上方法体
 * 4.创建子类对象进行使用
 * */
public abstract class Animal {

    //这是一个抽象方法，代表吃东西，但是吃什么怎么吃（大括号的内容）不确定
    public abstract void eat();

    //这是一个普通的成员方法
    public void normalMethod() {

    }

}
