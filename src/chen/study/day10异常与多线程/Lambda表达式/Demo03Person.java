package chen.study.day10异常与多线程.Lambda表达式;

import java.util.Arrays;

/*
    有参数有返回值：
    需求：使用数组存储多个person对象
         对数组中的person对象用Arrays的sort方法通过年龄进行升序排序
 */
public class Demo03Person {
    public static void main(String[] args) {
        //使用数组存储多个person对象
        Person[] arr = {
                new Person("aaa",18),
                new Person("bbb",130),
                new Person("ccc",11),
        };
        //进行按年龄升序排序
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        //使用lambda表达式进行简化
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o1.getAge()-o2.getAge();
        });

        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
