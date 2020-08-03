package chen.study.day07继承与多态.接口.接口间的多继承;
/*
* 这个子接口中有几个抽象方法？答：四个
* methodA()
* methodB()
* methodCommon()
* method()
* */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {

    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
