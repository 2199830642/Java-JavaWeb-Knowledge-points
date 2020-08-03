package chen.study.day09集合.泛型;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 泛型：是一种未知的数据类型，当我们不知道使用什么数据类型时，可以使用泛型
* 泛型可以看作是一个变量，用来接收数据类型。
* eg：E e：Element元素
*     T t：Type  类型
* ArrayList集合在使用时如果不知道存储什么类型， 就可以使用泛型：ArrayList<E>
*
* */
public class Demo01Generic {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
    * 创建集合对象，使用泛型
    * 好处：
    *   1.避免了类型转化的麻烦，存储的是什么类型，取出的就是什么类型
    *   2.把运行期异常(代码运行后会抛出的异常)，提升到了编译器(写代码时就会报错)
    * 弊端：
    *   泛型是什么类型，就只能存储什么类型的数据
    * */
    private static void show02() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abc");
        //list1.add(1);  直接会提示错误
        Iterator<String> it2 = list1.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next().length());
        }
    }

    /*
    * 创建集合对象，不使用泛型
    * 好处：
    *   集合不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
    * 弊端：
    *   集合不安全，会引发异常
    * */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        //获取迭代器遍历
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
            //现在想用String的length方法获取集合元素长度
            //会出现ClassCastException类型转换错误
            //String s = (String)obj;
            //System.out.println(s.length());
        }

    }
}
