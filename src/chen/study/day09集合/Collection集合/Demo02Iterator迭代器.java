package chen.study.day09集合.Collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 迭代：Collection集合元素的通用获取方式，在取元素之前，先判断集合中有无元素，如果有，就把这个元素取出来，继续再判断，
 * 如果还有继续取出，直到集合中所有元素都被取出。这个过程称为迭代
 * java.util.Iterator接口：迭代器，对集合元素进行遍历
 *
 * 其常用方法：boolean hasNext();如果仍有元素可以迭代，则返回true
 *            E  next();返回迭代的下一个元素
 * Iterator迭代器是一个接口无法直接使用，需要调用其实现类对象，获取实现类对象方式比较特殊
 * Collection接口中有一个方法，叫iterator(),这个方法返回的就是迭代器的对象
 *      Iterator<E> iterator();返回在此Collection的元素上进行迭代的迭代器
 *
 * 迭代器的使用步骤：
 * 1.先使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收(多态)
 * 2.使用Iterator接口中的hasNext()方法判断集合中有没有下一个元素
 * 3.使用Iterator接口中的next()方法取出集合中的下一个元素
 * */
public class Demo02Iterator迭代器 {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> col = new ArrayList<>();
        //加入元素
        col.add("姚明");
        col.add("科比");
        col.add("麦迪");
        col.add("乔丹");
        col.add("詹姆斯");

        /*
        * 获取迭代器
        * 注意：Iterator<E>接口是有泛型的，迭代器的泛型跟着集合走。
        * */
        //多态  接口                实现类对象
        Iterator<String> it = col.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
