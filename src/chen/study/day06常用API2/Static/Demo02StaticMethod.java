package chen.study.day06常用API2.Static;
/*
* 一旦使用static修饰成员方法，那么这就成了静态方法，静态方法不属于对象，而属于整个类
*
* 如果没有static关键字，那么必须先创建对象才可以使用他
*
* 无论是成员变量，还是成员方法都推荐用类名直接进行调用；
* 静态变量：类名称.静态变量
* 静态方法：类名称.静态方法（）
*
* 注意：
* 1.静态不能直接访问非静态
* 原因：因为在内存中是先有的静态内容后有的非静态内容  “先人不知道后人，后人知道先人”
* 2.静态方法中不能使用this关键字
* */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj =new MyClass();
        //首先创建对象，才能使用没有static关键字的内容
        obj.method();

        //对于静态方法来说，可以直接通过对象名来调用，也可以直接通过类名称来调用
        obj.methodStatic();//正确的，但是不推荐，这种方法再javac编译之后也会成为"类名称.静态方法名"
        MyClass.methodStatic();//正确的，推荐使用这个
    }
}
