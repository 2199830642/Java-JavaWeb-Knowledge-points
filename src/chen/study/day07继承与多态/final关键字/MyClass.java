package chen.study.day07继承与多态.final关键字;
/*
* 当final关键字用来修饰一个类时 格式：
* public final class 类名称{
*     //...
* }
*
* 含义：当前这个类不能有任何的子类
* 其中所有的成员方法都无法覆盖重写
* */
public final class MyClass {
    public void method(){
        System.out.println("方法执行");
    }
}
