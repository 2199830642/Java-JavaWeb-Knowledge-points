package chen.study.Day13Stream流_LambdaAPI.Stream流式思想;

import java.util.ArrayList;
import java.util.Collections;

/*
    更加优雅的完成Demo01概述里的任务
    使用Stream流的方式
    Stream流是jdk1.8之后出现的，它关注的是做什么而不是怎么做
 */
public class Demo02Stream流遍历 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"周芷若","张三丰","张三","李四","张无忌");

        //采用Stream流
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach((name)-> System.out.println(name));//张三丰
                                                            //张无忌

        for (String s : list) {
            System.out.print(s);//周芷若张三丰张三李四张无忌
        }
    }
}
