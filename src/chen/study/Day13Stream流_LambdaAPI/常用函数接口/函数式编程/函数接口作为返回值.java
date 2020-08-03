package chen.study.Day13Stream流_LambdaAPI.常用函数接口.函数式编程;

import java.util.Arrays;
import java.util.Comparator;

/*
    如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个lambda表达式
    当需要通过一个方法获取java.util.Comparator接口类型的对象作为排序器时，就可以用该方法获取
 */
public class 函数接口作为返回值 {
    //定义一个方法，方法的返回值类型用函数式接口Comparator
    public static Comparator<String> getComparator() {
        return (String o1, String o2) -> o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"aaa","b","cccc","ddddddd"};
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));//[ddddddd, cccc, aaa, b]
    }
}
