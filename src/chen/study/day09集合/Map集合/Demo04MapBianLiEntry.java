package chen.study.day09集合.Map集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map.Entry<k,v> 在Map接口中有一个内部接口Entry
 * 作用：当Map集合一创建，那么就会在Map集合中创建一个Entry对象，用来记录键与值(键值对对象，键与值的映射关系)--->结婚证
 * public Set<Map.Entry<K,V>> entrySet();获取到Map集合中所有的键值对对象的集合(Set集合)
 *
 * 实现步骤：
 * 1.使用Map集合中的entrySet方法，把Map集合中的多个entry对象取出来，然后放入一个Set集合中
 * 2.遍历Set集合获取每一个entry对象
 * 3.使用entry对象中的方法getKey(),getValue()获取键与值
 * */
public class Demo04MapBianLiEntry {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("陈凯博", "王梦涵");
        map.put("张若昀", "唐艺昕");
        map.put("杨过", "小龙女");
        map.put("唐三", "小舞");

        //1.使用Map集合中的entrySet方法，把Map集合中的多个entry对象取出来，然后放入一个Set集合中
        Set<Map.Entry<String, String>> set = map.entrySet();

        //2.遍历Set集合获取每一个entry对象
        //迭代器遍历
        Iterator<Map.Entry<String, String>> it = set.iterator();
        while (it.hasNext()) {
            //3.使用entry对象中的方法getKey(),getValue()获取键与值
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
            /*杨过=小龙女
            唐三=小舞
            陈凯博=王梦涵
            张若昀=唐艺昕*/
        }
        System.out.println("==============================");
        //增强for循环遍历
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
