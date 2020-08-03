package chen.study.day07继承与多态.接口.接口的静态方法的使用;

public class Demo03Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        //错误写法
        //impl.methodStatic();

        //正确写法，直接通过接口名称调用
        MyInterfaceStatic.methodStatic();
    }
}
