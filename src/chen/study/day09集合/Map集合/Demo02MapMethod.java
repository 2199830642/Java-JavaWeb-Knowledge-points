package chen.study.day09集合.Map集合;

import java.util.HashMap;
import java.util.Map;

/*
 * Map集合的常用方法：
 *                  1. public V put(K key,V value);把指定的键和指定的值添加到Map集合中
 *                  2. public V remove(Object key);把指定的键所对应的键值对元素在Map集合中删除，返回被删除的元素的值
 *                  3. public V get(Object key);根据指定的值，获取在Map集合中对应的值
 *                  4. boolean containsKey(Object key);判断集合中是否包含指定的键
 *                  5. public Set<k> keySet();获取Map集合中所有的键，存储到set集合中
 *                  6. public Set<Map.Entry<K,V>> entrySet();获取到Map集合中所有的键值对对象的集合(Set集合)
 * */
public class Demo02MapMethod {
    public static void main(String[] args) {
        show01();
        show02();
    }

    //1. public V put(K key,V value);把指定的键和指定的值添加到Map集合中
    //         返回值：V
    //              1.存储键值对的时候，key不重复，返回值为V是NULL
    //              1.存储键值对的时候，key重复，会使用新的value替换Map中重复的value，返回被替换的value值

    private static void  show01() {
        //创建Map集合对象
        Map<String,String> map = new HashMap<>();
        String str1 = map.put("黄晓明", "杨颖");
        System.out.println("str1:"+str1);//str1:null

        String str2 = map.put("黄晓明", "杨颖2");
        System.out.println("str2:"+str2);//str2:杨颖

        System.out.println(map);//{黄晓明=杨颖2}

        map.put("陈凯博","王梦涵");
        map.put("张若昀","唐艺昕");
        map.put("杨过","小龙女");
        map.put("唐三","小舞");
        System.out.println(map);//{杨过=小龙女, 唐三=小舞, 黄晓明=杨颖2, 范闲=林婉儿}
    }


    //2. public V remove(Object key);把指定的键所对应的键值对元素在Map集合中删除，返回被删除的元素的值
    //         返回值：V
    //              1.k存在，返回被删除的value值
    //              2.k不存在，返回NULL
    //3. public V get(Object key);根据指定的值，获取在Map集合中对应的值
    private static void show02() {
        Map<String,Integer> map = new HashMap<>();
        map.put("佟丽娅",170);
        map.put("杨颖",168);
        map.put("迪丽热巴",171);
        map.put("杨幂",172);
        System.out.println(map);//{杨颖=168, 佟丽娅=170, 迪丽热巴=171, 杨幂=172}

        Integer i1 = map.remove("迪丽热巴");
        System.out.println("i1:"+i1);//i1:171
        System.out.println(map);//{杨颖=168, 佟丽娅=170, 杨幂=172}

        Integer i2 = map.get("杨颖");
        Integer i3 = map.get("杨洋");
        System.out.println(i2);//168
        System.out.println(i3);//null

        System.out.println(map.containsKey("佟丽娅"));//true
        System.out.println(map.containsKey("杨洋"));//false
    }

}
