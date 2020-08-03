package chen.study.day09集合.Collection集合.Set集合;

import java.util.HashSet;

/*
* HashSet存储自定义类型元素
*
* set集合保证元素唯一
*     存储的元素必须重写hashCode方法和equals方法
*
* 要求：同名同年龄的人视为同一个人，只能存储一次
* */
public class Demo03HashSetSavingPerson {
    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<>();
        Person p1 = new Person("张三",26,1704010321);
        Person p2 = new Person("张三",26,1704010321);
        Person p4 = new Person("张三",26,1704010320);
        Person p3 = new Person("张三",19,1827374482);
        hs.add(p1);
        hs.add(p2);
        hs.add(p3);
        hs.add(p4);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(hs);
    }
}
