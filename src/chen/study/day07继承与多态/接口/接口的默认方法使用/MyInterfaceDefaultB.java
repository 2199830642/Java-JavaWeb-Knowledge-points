package chen.study.day07继承与多态.接口.接口的默认方法使用;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("覆盖重写抽象方法实现，bbb");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写接口的默认方法");
    }
}
