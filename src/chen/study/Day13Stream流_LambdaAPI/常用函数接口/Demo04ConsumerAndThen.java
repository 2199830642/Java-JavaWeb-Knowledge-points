package chen.study.Day13Stream流_LambdaAPI.常用函数接口;

import java.util.function.Consumer;

/*
    Consumer接口的默认方法andThen
    作用：需要两个Consumer接口，它可以把两个Consumer接口组合到一起，然后再进行数据消费

    例如：
    Consumer<String> con1;
    Consumer<String> con2;
    String s = "hello";
    con1.accept(s);
    con2.accept(s);
    效果等同于
    con1.andThen(con2).accept(s);谁写前面谁先消费
 */
public class Demo04ConsumerAndThen {
    //定义一个方法，方法的参数传递一个字符串和两个Consumer接口
    public static void method(String str, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(str);
    }

    public static void main(String[] args) {
        method("hEllo",
                (str)->{
                    System.out.println(str.toUpperCase());//HELLO
                },
                (str)->{
                    System.out.println(str.toLowerCase());//hello
                });
    }
}
