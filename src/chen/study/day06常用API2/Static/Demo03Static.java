package chen.study.day06常用API2.Static;
/*
 * 静态代码块的格式:
 * public class 类名称{
 *     static {
 *     //静态代码块的内容
 *     }
 * }
 *
 * 特点：当第一次用到本类时，静态代码块执行唯一的一次
 *
 * 静态内容总是优先于非静态
 *
 * 静态代码块的典型用途：
 * 用于一次性的对静态成员变量进行赋值
 * */
public class Demo03Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
