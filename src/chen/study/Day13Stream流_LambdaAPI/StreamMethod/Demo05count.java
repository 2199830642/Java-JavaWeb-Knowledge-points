package chen.study.Day13Stream流_LambdaAPI.StreamMethod;

import java.util.ArrayList;
import java.util.Collections;

/*
    Stream流中的常用方法：count：用于统计Stream流中元素的个数
    long count(); 是一个终结方法，返回值是一个long类型的整数
 */
public class Demo05count {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7);
        long count = list.stream().count();
        System.out.println(count);//7
    }
}
