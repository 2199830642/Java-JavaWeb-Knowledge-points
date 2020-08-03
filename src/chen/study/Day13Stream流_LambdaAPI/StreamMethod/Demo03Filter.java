package chen.study.Day13Stream流_LambdaAPI.StreamMethod;

import java.util.ArrayList;
import java.util.Collections;

/*
    过滤
    其里面的接口是predicate返回一个true/false
    如果是true 继续操作
    如果是false 过滤掉
 */
public class Demo03Filter {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,34,4,5,6,4,3);
        list.stream().filter((s)->s>5).forEach((s)-> System.out.println(s));//34,6

        /*
        Stream流属于管道流 只能使用一次
        第一个Stream流使用完毕，数据就会流转到下一个Stream流上
        而这第一个流已经使用完毕，就会关上了
        所以第一个流就不能再调用方法
         */
    }
}
