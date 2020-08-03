package chen.study.day09集合.Collection集合.Collections工具类;

import java.util.ArrayList;
import java.util.Collections;

/*
* java.util.Collections是集合工具类，用来对集合进行操作：
*
*  常用方法：
*         public static <T> boolean addAll(Collection<T> c,T... elements);往集合中添加一些元素
*         public static void shuffle(List<?> list);打乱集合中元素顺序
*         public static <T> void sort(List<T> list);将集合中元素按默认规则排序，升序排序
*         public static <T> void sort(List<T> list,Comparator<? super T>);将集合中元素按指定规则排序
*
* 注意：如果想对自定义类型进行排序，那必须显要实现Comparable接口，然后对其compareTo方法进行重写
* */
public class Demo01Collections {
    public static void main(String[] args) {
        /*
        public static <T> boolean addAll(Collection<T> c,T... elements);往集合中添加一些元素
        public static void shuffle(List<?> list);打乱集合中元素顺序
        */
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"a","b","c","d","e");
        System.out.println(list1);//[a, b, c, d, e]

        Collections.shuffle(list1);
        System.out.println(list1);//[e, c, b, a, d]

        /*
        public static <T> void sort(List<T> list);将集合中元素按默认规则排序
        */
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,3,63,7,23,4,6,32,4,6,2);

        Collections.sort(list2);
        System.out.println(list2);//[2, 3, 4, 4, 6, 6, 7, 23, 32, 63]


        /*
        * 对自定义类型元素进行排序
        * */
        ArrayList<Person> list3 = new ArrayList<>();
        list3.add(new Person("张三",18));
        list3.add(new Person("李四",35));
        list3.add(new Person("王五",12));
        System.out.println(list3);//[Person{name='张三', age=18}, Person{name='李四', age=35}, Person{name='王五', age=12}]

        Collections.sort(list3);
        System.out.println(list3);//[Person{name='王五', age=12}, Person{name='张三', age=18}, Person{name='李四', age=35}]
    }
}
