package chen.study.day07继承与多态.接口.接口间的多继承;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodCommon();
    public default  void methodDefault(){
        System.out.println("AAA");
    }
}
