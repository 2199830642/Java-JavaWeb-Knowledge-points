package chen.study.Day13Stream流_LambdaAPI.StreamMethod;

import java.util.ArrayList;
import java.util.Collections;

/*
    如果希望跳过前几个元素，那么可以使用skip(long n)方法
    参数是long类型
 */
public class Demo07Skip {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,0);
        list.stream().skip(3).limit(3).forEach(s-> System.out.println(s));//4,5,6
    }
}
