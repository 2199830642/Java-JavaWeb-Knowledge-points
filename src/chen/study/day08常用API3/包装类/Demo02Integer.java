package chen.study.day08常用API3.包装类;

import java.util.ArrayList;

/*
 * 自动装箱与自动拆箱：基本类型的数据和包装类可自动的相互转换
 * */
public class Demo02Integer {
    public static void main(String[] args) {
        //自动装箱：直接将int类型的整数赋予包装类
        Integer in = 1;
        //自动拆箱：in是包装类，无法直接参加运算，可以自动转换为基本数据类型
        in = in + 2;

        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList无法直接存储整数，可存储包装类
        list.add(1);//隐含一个自动拆箱
        list.get(0);
    }
}
