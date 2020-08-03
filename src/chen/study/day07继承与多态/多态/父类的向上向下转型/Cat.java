package chen.study.day07继承与多态.多态.父类的向上向下转型;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    //子类特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
