package chen.study.day06常用API2.Static;

public class Person {
    static{
        System.out.println("静态代码块执行！");
    }

    public Person(){
        System.out.println("构造方法执行");
    }
}
