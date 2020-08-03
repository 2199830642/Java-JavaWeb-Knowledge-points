package chen.study.day07继承与多态.接口.接口的抽象方法的使用;
/*
* 在任何版本的Java中，接口都能定义抽象方法
* 格式：public abstract 返回值类型 方法名称（参数列表）；
* 注意：
* 1.接口当中的抽象方法，修饰符必须是两个固定的关键字 public abstrac
* 2.这两个关键字修饰符，可以选择性的省略
* 3.方法的三要素可以随意选择
* */
public interface MyInterfaceAbstract {

    //这是一个抽象方法
    public abstract void methodAbs1();

    //这也是一个抽象方法
    void methodAbs2();
}
