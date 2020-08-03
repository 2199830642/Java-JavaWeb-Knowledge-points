package chen.study.Day13Stream流_LambdaAPI.常用函数接口;

import java.util.function.Function;

/*
    java.util.function.Function<T,R>:接口用来根据一个类型的数据得到另一个类型的数据，前者成为前置条件，后者为后置条件
    Function接口中最主要的抽象方法为 R apply(T t),根据类型T的参数获取类型R的结果
 */
public class Demo09FunctionInterface {
    public static void change(String s, Function<String,Integer> fun){
        Integer apply = fun.apply(s);
        System.out.println(apply);//25
    }

    public static void main(String[] args) {
        String str = "25";
        change(str,(s)->Integer.parseInt(s));
    }
}
