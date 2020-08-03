package chen.study.Day13Stream流_LambdaAPI.常用函数接口;

import java.util.function.Predicate;

/*
    java.util.function.Predicate<T>接口
    作用：
        对某种数据类型的数据进行判断，结果返回一个布尔值

    Predicate中含有一个抽象方法：
        boolean text(T t):用来对指定数据类型数据进行判断的方法
 */
public class Demo06PredicateInterface {
    //定义一个方法，参数传递String类型的字符串，再传递一个Predicate接口，泛型也得使用String
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String str = "helloWorld";
        boolean b = checkString(str, (s) ->
                s.length() > 5
        );
        System.out.println(b);
    }
}
