package chen.study.Day13Stream流_LambdaAPI.Stream流式思想;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
    循环遍历的弊端：
        java8中的lambda表达式让我们可以专注于做什么（what）而不是怎么做（how）
        对for循环遍历可以分析得到：for循环就是强调"怎么做"，for循环的循环体才是"做什么"
        为什么要使用循环？
        因为要遍历
        但循环是遍历的唯一方式吗？
        遍历是指每一个元素逐一进行处理，而并不是从第一个到最后一个元素顺次处理的循环，前者是目的，后者是方式

        接下来将传统方式和Stream流方式进行对比
 */
public class Demo01传统遍历方式 {
    public static void main(String[] args) {
        //使用传统方式筛选符合条件的人
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"周芷若","张三丰","张三","李四","张无忌");

        //对list集合中元素进行过滤，只要以张开头的元素，存储到新的集合中
        ArrayList<String> a = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                a.add(s);
            }
        }
        //对a进行过滤，只要名字长度为3的人
        ArrayList<String> b = new ArrayList<>();
        for (String s : a) {
            if (s.length()==3){
                b.add(s);
            }
        }
        //遍历b
        for (String s : b) {
            System.out.println(s);
        }
        //迭代器方式遍历
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
