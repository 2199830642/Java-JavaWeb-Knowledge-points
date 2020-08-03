package chen.study.Day13Stream流_LambdaAPI.StreamMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo09StreamPractice {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"迪丽热巴","宋远桥","苏星河","石破天","石中玉","老子","庄子","洪七公");
        Stream<String> stream1 = list1.stream().filter(name -> name.length() == 3).limit(3);

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"古力娜扎","张无忌","赵丽颖","张三丰","尼古拉斯凯奇","张二河","张二狗");
        Stream<String> stream2 = list2.stream().filter(name -> name.startsWith("张")).skip(2);

        Stream.concat(stream1, stream2).map(name->new person(name)).forEach(name-> System.out.println(name));
        //person{name='宋远桥'}
        //person{name='苏星河'}
        //person{name='石破天'}
        //person{name='张二河'}
        //person{name='张二狗'}

    }
}
