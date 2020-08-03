package chen.study.Day13Stream流_LambdaAPI.StreamMethod;

import java.util.stream.Stream;

/*
    limit();可以对流进行截取，只取前n个
    Stream<T> limit(long maxSize) 参数是一个long类型
 */
public class Demo06limit {
    public static void main(String[] args) {
        Stream.of("张三丰","张无忌","周芷若").limit(2).forEach(s-> System.out.println(s));
                                                                                        //张三丰
                                                                                        //张无忌
    }
}
