package chen.study.day07继承与多态.内部类.匿名内部类的定义与使用;

public class MyInterFaceIMPL implements MyInterFace {
    @Override
    public void method1() {
        System.out.println("实现类实现了这个方法！！！");
    }

    @Override
    public void method2() {
        System.out.println("第二个抽象方法被调用");
    }
}
