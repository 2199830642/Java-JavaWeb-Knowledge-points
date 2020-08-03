package chen.study.Day13Stream流_LambdaAPI.方法引用.方法引用基本介绍;
/*
    定义一个打印的函数式接口
 */
@FunctionalInterface
public interface Printable {
    //定义字符串的抽象方法
    void print(String s);
}
