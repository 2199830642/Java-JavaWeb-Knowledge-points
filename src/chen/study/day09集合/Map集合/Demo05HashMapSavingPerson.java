package chen.study.day09集合.Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *    HashMap存储自定义类型键值
 *    Map集合保证key唯一，作为key的元素必须重写hashCode()方法和equals()方法
 * */
public class Demo05HashMapSavingPerson {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
    * key为Person类型，value为String类型
    * 由show01方法可知，我们必须要在Person类中重写hashCode和equals方法
    * */
    private static void show02() {
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("小陈",22),"小王");
        map.put(new Person("范闲",23),"林婉儿");
        map.put(new Person("张若昀",24),"唐艺昕");
        map.put(new Person("小陈",22),"小王");

        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"---->"+value);
        }
        /*Person{name='范闲', age=23}---->林婉儿
        Person{name='小陈', age=22}---->小王
        Person{name='张若昀', age=24}---->唐艺昕*/
    }

    /*
    *key值类型为String，value为person
    * 因为k值相同,string类里已经重写hashCode和equals方法,所以可以确保k值不相等,若相等则覆盖
    * */
    private static void show01() {
        Map<String,Person> map = new HashMap<>();
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("西安",new Person("王五",20));
        map.put("北京",new Person("张三",20));

        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+"--->"+map.get(s));
        }
        /*上海--->Person{name='李四', age=19}
        西安--->Person{name='王五', age=20}
        北京--->Person{name='张三', age=20}*/
    }
}
