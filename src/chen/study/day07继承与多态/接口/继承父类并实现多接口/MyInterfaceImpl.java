package chen.study.day07继承与多态.接口.继承父类并实现多接口;

public class MyInterfaceImpl extends Fu implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }


    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口都有的Abs方法");
    }

    /*@Override
    public void methodDefault() {
        System.out.println("对多个接口中冲突的默认方法进行了覆盖重写");
    }*/
}
