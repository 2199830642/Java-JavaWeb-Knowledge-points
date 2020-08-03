package chen.study.day07继承与多态.继承.继承中构造方法的访问特点;

/*
 * 继承关系中，父子类构造方法的访问特点
 *
 * 1.子类构造方法中默认隐含一个“super()”调用，所以一定是先调用父类的构造方法，再调用子类的，
 * 子类必须调用父类的构造方法
 * 2.可以通过super关键字来进行子类构造调用父类重载构造
 * 3.super的父类构造调用，必须是子类构造方法的第一个语句
 *
 * 总结：
 * 子类必须调用父类的构造方法，不写则默认赠送一个super();写了则用写的
 * */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
