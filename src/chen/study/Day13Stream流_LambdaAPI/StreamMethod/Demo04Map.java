package chen.study.Day13Stream流_LambdaAPI.StreamMethod;

import java.util.stream.Stream;

/*
    如果需要将流中的元素映射到另一个流中，就可以使用map方法
    方法签名 <R> Stream<R> map(function<? super T,? extends R> mapper)
    function接口中的抽象方法 R apply(T t),将数据类型T转化为R，也称为映射
 */
public class Demo04Map {
    public static void main(String[] args) {
        //获取一个String类型的stream流
        Stream<String> ss = Stream.of("1", "2", "3", "4");
        //使用map方法将字符串类型的整数转换为Integer类型的整数
        Stream<Integer> stream = ss.map((String s) -> Integer.parseInt(s));
        stream.forEach(s-> System.out.println(s));
    }
}
