package chen.study.day09集合.Map集合;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
* java.util.LinkedHashMap<K,V> extends HashMap<k,v>
    有序的集合
    * 底层原理：
    * 哈希表（数组+链表/红黑树）+链表（记录顺序）
* */
public class Demo06LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> hm = new LinkedHashMap<>();
        hm.put("a","b");
        hm.put("c","d");
        hm.put("e","f");
        hm.put("g","h");
        System.out.println(hm);
    }
}
