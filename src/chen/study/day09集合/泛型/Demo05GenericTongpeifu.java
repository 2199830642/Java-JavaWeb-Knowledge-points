package chen.study.day09集合.泛型;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 泛型的通配符
*   ？：代表任意的数据类型
*  使用方式：
*   不能作为对象使用，只能作为方法的参数使用
* */
public class Demo05GenericTongpeifu {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<String> list01 = new ArrayList<>();
        list01.add("张三");
        list01.add("李四");

        printArray(list);
        printArray(list01);

    }

    //定义一个方法，要求可以遍历所有的集合
    public static void printArray(ArrayList<?> a){
        //使用迭代器
        Iterator<?> it = a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
