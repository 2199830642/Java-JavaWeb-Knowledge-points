package chen.study.day09集合.Collection集合.Set集合;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
* java.util.LinkedHashSet extends HashSet集合
*LinkedHashSet的集合特点：
*     底层是一个哈希表(数组+链表/红黑树)+链表,多了一条链表(记录元素的存储顺序)，有序
* */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("www");
        lhs.add("abc");
        lhs.add("abc");
        lhs.add("com");
        System.out.println(lhs);//[www, abc, com]有序，不允许重复

        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("com");
        System.out.println(set);//[com, abc, www]无序，不允许重复
    }
}
