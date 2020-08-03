package chen.study.Day13Stream流_LambdaAPI.常用函数接口;

import java.util.function.Consumer;

/*
    java.util.function.Consumer<T>接口正好与Supplier接口相反，它不生产数据，而是消费一个数据，其数据类型由泛型决定
    Consumer<T>接口中包含一个抽象方法void accept(T t),意为消费一个指定泛型的数据

    Consumer接口是一个消费型接口，泛型指定什么类型数据，就可以使用accept()方法消费什么类型数据
    至于怎么消费需要自定义
 */
public class Demo03ConsumerInterface {
    /*
    定义一个方法
    方法的参数传递一个字符串的姓名
    方法的参数传递Consumer接口，泛型使用String
    可以使用Consumer接口消费字符串的姓名
     */
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        method("嘉文",(name)->{
            //字符串的截取
            String substring = name.substring(1);
            System.out.println(substring);//文    左闭右开区间
            //字符串的翻转
            String a = new StringBuffer(name).reverse().toString();
            System.out.println(a);//文嘉
        });
    }
}
