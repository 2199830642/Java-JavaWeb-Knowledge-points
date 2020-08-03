package chen.study.day09集合.Collection集合.List集合;

import java.util.ArrayList;
import java.util.List;

/*
 * java.util.list接口继承Collection接口
 * list接口三大特点：
 *     1.有序的集合，存储元素，和取出元素的顺序一致
 *     2.有索引
 *     3.允许存储重复元素
 * list接口中带索引的方法：
 * 1.public void add(int index,E element);将制定的元素添加到集合中指定的位置上
 * 2.public E remove(int index);移除集合中指定位置的元素，返回的是被移除的元素
 * 3.public E get(int index);返回集合中指定位置的元素
 * 4.public E set(int index,E element);用指定元素替换集合中指定位置的元素，返回值是更新前的元素
 *
 * 注意：
 *     操作索引时，一定要注意索引越界异常IndexOutOfBoundsException
 *
 * ArrayList集合是数组结构：查询快，增删慢
 * LinkedList集合是链表结构：查询慢，增删快
 * */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个list集合对象
        List<String> list = new ArrayList<>();
        //使用add方法向集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        System.out.println(list);

        //在c和b之间添加一个新元素 小陈
        list.add(2,"小陈");
        System.out.println(list);

        //删除c
        String remove = list.remove(3);
        System.out.println(remove);
        System.out.println(list);

        //set方法，小王替换最后一个a
        String ss = list.set(3, "小王");
        System.out.println(ss);
        System.out.println(list);

        //get方法
        String s = list.get(3);
        System.out.println(s);
    }
}
