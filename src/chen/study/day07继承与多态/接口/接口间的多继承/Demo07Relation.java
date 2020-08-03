package chen.study.day07继承与多态.接口.接口间的多继承;

/*
 * 1.类与类之间是单继承的，直接父类只有一个
 * 2.类与接口之间是多实现的，一个类可以实现多个接口
 * 3.接口与接口之间是多继承的
 *
 * 注意：
 * 1.多个父接口中的抽象方法重复是没有关系的
 * 2.多个父接口中的默认方法如果重复,那么子接口必须进行默认方法的覆盖重写
 * */
public class Demo07Relation {
    public static void main(String[] args) {
        MyInterfaceImpl imp = new MyInterfaceImpl();
        imp.method();
        imp.methodA();
        imp.methodB();
        imp.methodCommon();
    }
}
