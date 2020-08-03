package chen.study.day07继承与多态.接口.继承父类并实现多接口;

/*
 * 使用接口时应该注意：
 * 1.接口没有静态代码块和构造方法
 * 2.一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
 * 格式：
 * public class MyInterfaceImpl implments MyInterfaceA,MyInterfaceB{
 *        //覆盖重写所有的抽象方法
 * }
 * 3.如果实现类所实现的多个接口中有重复的抽象方法，那么只需要覆盖重写一次即可
 * 4.如果实现类没有覆盖所有接口中的所有抽象方法，那么实现类肯定是一个抽象类
 * 5.如果实现类实现的多个接口中重复存在的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写
 * 6.一个类如果直接父类当中的一个方法与一个接口中的方法产生了冲突，那么会优先用父类中的方法，只会使用父类的方法
 * */
public class Demo06MyInterface {
    public static void main(String[] args) {
        MyInterfaceImpl imp = new MyInterfaceImpl();
        imp.methodA();
        imp.methodB();
        imp.methodAbs();
        imp.methodDefault();
    }
}
