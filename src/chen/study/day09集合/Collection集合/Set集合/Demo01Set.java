package chen.study.day09集合.Collection集合.Set集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* java.util.Set  extends Collection
*    Set接口的特点：
*             1.不允许存储重复元素
*             2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
*
* set集合存储元素不重复的原理：
* set集合在调用Add方法时，Add方法会调用hashCode方法和equals方法
*
*
* java.util.HashSet集合实现了Set接口
*    HashSet的特点：
*             1.不允许存储重复元素
*             2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
*             3.无序的集合，存储元素和取出元素的顺序有可能不一致
*             4.底层是一个哈希表结构，查询的速度非常的快
* */
public class Demo01Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        //使用add方法往集合中添加
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(1);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next());//1 2 3
        }
    }
}
