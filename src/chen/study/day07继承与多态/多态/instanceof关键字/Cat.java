package chen.study.day07继承与多态.多态.instanceof关键字;


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
