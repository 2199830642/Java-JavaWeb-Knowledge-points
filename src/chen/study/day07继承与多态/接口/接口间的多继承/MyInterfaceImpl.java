package chen.study.day07继承与多态.接口.接口间的多继承;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method() {
        System.out.println("我自己的方法");
    }

    @Override
    public void methodA() {
        System.out.println("A接口的方法");
    }

    @Override
    public void methodB() {
        System.out.println("B接口的方法");
    }

    @Override
    public void methodCommon() {
        System.out.println("A,B共有的方法");
    }
}
