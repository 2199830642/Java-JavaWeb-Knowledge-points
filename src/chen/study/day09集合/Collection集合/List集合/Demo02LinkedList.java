package chen.study.day09集合.Collection集合.List集合;

import java.util.LinkedList;

/*
Java.util.LinkedList集合  implements list 接口
* LinkedList集合是链表结构，查询慢，增删快
  特点：
      1.链表，查询慢，增删快
      2.里面包含了大量操作首尾元素的方法
      注意：使用LinkedList的特有方法时，不可以使用多态，因为多态看不到子类特有的方法

      public void addFirst(E e);将指定元素插入此链表的开头 等同于 public void push(E e);
      public void addLast(E e);将指定元素插入此链表的结尾
      public E getFirst();返回此链表的第一个元素
      public E getLast();返回此链表的最后一个元素
      public E removeFirst();移除此链表的第一个元素并返回   等同于 public E pop();
      public E removeLast();移除此链表的最后个元素并返回
      public boolean isEmpty();如果链表不为空，则返回true

* */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
    }


    private static void show01() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("科比");
        ll.add("詹姆斯");
        ll.add("乔丹");
        System.out.println(ll);

        ll.addFirst("艾佛森");
        ll.addLast("库里");
        System.out.println(ll);
        ll.push("张伯伦");
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        ll.removeFirst();
        ll.removeLast();
        ll.pop();
        System.out.println(ll);

        boolean empty = ll.isEmpty();
        System.out.println(empty);
    }
}
