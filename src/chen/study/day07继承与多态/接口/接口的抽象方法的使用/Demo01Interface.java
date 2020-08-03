package chen.study.day07继承与多态.接口.接口的抽象方法的使用;

/*
 * 接口就是多个类的公共规范
 * 接口是一种引用数据类型，最重要的内容就是其中的抽象方法
 * 定义接口的格式：
 *
 * public Interface 接口名称{
 *     //接口内容
 * }
 *
 *如果是java7，Java中可包含内容为：常量，抽象方法
 *如果是java8还可以额外包含：默认方法，静态方法
 *如果是java9还可以包括：私有方法
 *
 * 接口使用步骤：
 * 1.接口不能直接使用，必须有一个实现类，来实现该接口
 * 格式：
 * public class 实现类名称 implements 接口名称{
 *    //...
 * }
 * 2.接口的实现类必须覆盖重写接口中所有的抽象方法，去掉abstract关键字，加上方法体和大括号。
 * 3.创建实现类的对象，进行使用
 *
 * 注意事项：如果实现类没有实现接口中的所有抽象方法，那么这个实现类就必须是抽象类
 * */
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl inter = new MyInterfaceAbstractImpl();
        inter.methodAbs1();
        inter.methodAbs2();
    }
}
