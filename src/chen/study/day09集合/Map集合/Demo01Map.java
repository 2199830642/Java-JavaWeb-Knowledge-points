package chen.study.day09集合.Map集合;

/*
 * java.util.Map<k,v>
 * Map集合是一个双列集合
 * public interface Map(k,v);k指的是Key 键的类型，v指的是value 值的类型
 * 将键映射到值的对象，一个映射不能包含重复的键，每个键最多只能映射到一个值
 *
 *
 * Map集合的特点：1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
 *               2.Map集合中的元素，key和value的类型可以相同，也可以不同
 *               3.Map集合中的元素Key是不允许重复的，value是可以重复的
 *               4.key和value一一对应
 *
 * java.util.HashMap<k,v>集合 implements Map<k,v>接口
 *
 * HashMap的集合：1.HashMap集合底层是哈希表，查询速度十分快
 *                    jdk1.8之前，哈希表由数组+单向链表组成
 *                    jdk1.8之后，哈希表由数组+单向链表/红黑树(链表长度超过8变成红黑树)组成
 *               2.HashMap集合是一个无序集合，存储元素和去除元素顺序有可能不一致
 *
 *
 * java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
 *
 * LinkedHashMap<k,v>的特点：1.其底层是一个哈希表+链表，保证集合有序
 *  */
public class Demo01Map {
}
