package chen.study.day07继承与多态.内部类.局部内部类的定义与使用;

public class Demo03Main {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.methodOuter();

        MyOuter myOuter = new MyOuter();
        myOuter.methodMyOuter();
    }
}
