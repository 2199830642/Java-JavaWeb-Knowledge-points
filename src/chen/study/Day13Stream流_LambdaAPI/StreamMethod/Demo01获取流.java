package chen.study.Day13Stream流_LambdaAPI.StreamMethod;

import java.util.*;
import java.util.stream.Stream;

/*
    java.util.Stream.Stream<T>接口是Java1.8加入的最常用的流接口(并不是函数式接口)

    获取一个流十分简单，有两种简单的方式
    1.所有的Collection集合都可以通过Stream默认方法获取流
        default Stream<T> stream()
    2.Stream接口的静态方法of可以获取数组相对应的流
        static <T> Stream<T> of(T...values),参数是一个可变参数，可变参数的底部就是数组，所以我们可以传递一个数组进去
 */
public class Demo01获取流 {
    public static void main(String[] args) {
        //1.把集合转化为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        //对于不是Collection集合的map集合
        Map<String , String> map = new HashMap<>();
        //获取键，存储到一个Set集合中
        Set<String> set1 = map.keySet();
        Stream<String> stream3 = set1.stream();
        //获取值，存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        //获取键值对,存储到一个Set集合中
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        //2.把数组转化为Stream流
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
        //可变参数可以传递数组
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer> arr1 = Stream.of(arr);
    }
}
