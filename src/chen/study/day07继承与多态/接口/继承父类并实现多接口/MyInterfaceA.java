package chen.study.day07继承与多态.接口.继承父类并实现多接口;

public interface MyInterfaceA {

    public abstract void methodA();
    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("AAA");
    }
}
