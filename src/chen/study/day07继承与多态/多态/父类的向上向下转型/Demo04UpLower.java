package chen.study.day07继承与多态.多态.父类的向上向下转型;

/*
 * 1.对象的向上转型，其实就是多态写法；
 * 格式：父类名称 对象名 = new 子类名称（）；
 * 含义：右侧创建一个子类对象，把他当作父类来看待使用
 * 注意事项：向上转型一定是安全的，因为从小范围转向了大范围，但是有一个弊端，
 * 对象一旦向上转型，那么就不能调用原本子类的特有方法
 * 解决方法：
 * 用对象的向下转型还原
 *
 * 2.对象的向下转型，就是一个还原的动作
 * 格式：子类名称 对象名 = （子类名称）父类对象
 * */
public class Demo04UpLower {

    public static void main(String[] args) {
        //向上转型就是父类引用指向子类对象
        Animal ani = new Cat();
        ani.eat();//猫吃鱼

        ((Cat) ani).catchMouse();

        //向下转型,进行还原动作
        Cat mimi = (Cat)ani;
        mimi.catchMouse();//猫抓老鼠

    }

}
