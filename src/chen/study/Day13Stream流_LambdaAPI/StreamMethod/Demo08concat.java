package chen.study.Day13Stream流_LambdaAPI.StreamMethod;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
    如果有两个流，我们希望把两个流合并为一个流可以使用concat()方法，这是一个静态方法，和java.lang.String中的concat()是不同的
 */
public class Demo08concat {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,0);
        Stream<Integer> stream1 = list.stream();
        Stream<String> stream2 = Stream.of("张三丰", "张无忌", "周芷若");
        //组合
        Stream<? extends Serializable> concat = Stream.concat(stream1, stream2);
        concat.forEach(s-> System.out.println(s));
    }
}
