package chen.study.day09集合.Map集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的第一种遍历方式，通过键找值的方式
 *       public Set<k> keySet();获取Map集合中所有的键，存储到set集合中
 *            返回此映射中包含的键的Set视图
 * 实现步骤：
 * 1.使用Map集合中的keySet方法，把Map集合中所有的键（key）取出来存储到一个Set集合中
 * 2.遍历Set集合，获取Map集合中的每一个key
 * 3.通过Map集合中的get(key)方法获得对应的value
 * */
public class Demo03MapBianLikeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("佟丽娅", 170);
        map.put("杨颖", 168);
        map.put("迪丽热巴", 171);
        map.put("杨幂", 172);

        //1.使用Map集合中的keySet方法，把Map集合中所有的键（key）取出来存储到一个Set集合中
        Set<String> set = map.keySet();

        //2.遍历Set集合，获取Map集合中的每一个key
        //迭代器遍历
        Iterator<String> list = set.iterator();
        while (list.hasNext()) {
            String key = list.next();
            System.out.print(key);
            //3.通过Map集合中的get(key)方法获得对应的value
            System.out.println(map.get(key));
            /*杨颖168
              佟丽娅170
              迪丽热巴171
              杨幂172*/
        }
        System.out.println("========================================");
        //增强for遍历
        for (String s : set) {
            System.out.println(s + "=" + map.get(s));
        }
    }
}
