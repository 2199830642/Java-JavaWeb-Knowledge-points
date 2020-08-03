package chen.study.Day13Stream流_LambdaAPI.StreamMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
    流模型的操作很丰富，这里介绍一些常见的API，这些方法可以分为两块
    1.延迟方法：返回值类型仍然是Stream接口自身类型的方法，因此支持链式调用
    2.终结方法：返回值类型不再是Stream接口自身类型的方法，因此不再支持StringBuilder那样的链式调用。例子：count和forEach

    forEach里面的接口是consumer，消费型接口
    这个方法就一般用于遍历
 */
public class Demo02forEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c");
        list.stream().forEach((name)-> System.out.println(name));
        System.out.println("=============");
        String[] a = {"张三","李四"};
        Stream.of(a).forEach((name)-> System.out.println(name));
    }
}
