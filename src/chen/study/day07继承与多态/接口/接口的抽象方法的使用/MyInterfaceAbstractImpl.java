package chen.study.day07继承与多态.接口.接口的抽象方法的使用;

public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void methodAbs1() {
        System.out.println("这是第一个方法");
    }

    @Override
    public void methodAbs2() {
        System.out.println("这是第二个方法");
    }
}
