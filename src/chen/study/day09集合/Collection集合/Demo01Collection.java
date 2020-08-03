package chen.study.day09集合.Collection集合;

import java.util.ArrayList;
import java.util.Collection;

/*
 * java.util.Collection接口
 * 所有单列集合最顶层的接口，里面定义了所有单列集合共性的方法
 *
 * 共性方法：
 * 1.public boolean add(E e)； 把给定的对象添加到当前的集合中
 * 2.public void clear();  清空集合中所有的元素
 * 3.public boolean remove(E e);  把给定的对象从当前集合中删除
 * 4.public boolean contains(E e);  判断当前集合是否包含给定的对象
 * 5.public boolean isEmpty();  判断当前集合是否为空
 * 6.public int size();  返回集合中元素的个数
 * 7.public Object[] toArray();  把集合中的元素存储到数组中
 * */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建一个集合对象，可以使用多态
        Collection<String> col = new ArrayList<>();
        System.out.println(col);//[]  说明重写了toString方法

        /*
         * 1.public boolean add(E e)； 把给定的对象添加到当前的集合中
         * */
        boolean b1 = col.add("张三");
        System.out.println("b1：" + b1);//true
        System.out.println(col);//[张三]
        col.add("李四");
        col.add("王五");
        col.add("赵六");
        col.add("田七");
        System.out.println(col);//[张三, 李四, 王五, 赵六, 田七]

        /*
         *3.public boolean remove(E e);  把给定的对象从当前集合中删除
         * */
        boolean b2 = col.remove("赵六");
        boolean b3 = col.remove("赵四");
        System.out.println("b2：" + b2);
        System.out.println("b3：" + b3);
        System.out.println(col);

        /*
         * 4.public boolean contains(E e);  判断当前集合是否包含给定的对象
         * */
        boolean b4 = col.contains("李四");
        boolean b5 = col.contains("赵四");
        System.out.println("b4：" + b4);
        System.out.println("b5：" + b5);

        /*
         * 5.public boolean isEmpty();  判断当前集合是否为空
         * */
        boolean b6 = col.isEmpty();
        System.out.println("b6：" + b6);

        /*
         * 6.public int size();  返回集合中元素的个数
         * */
        int A = col.size();
        System.out.println(A);

        /*
         * 7.public Object[] toArray();  把集合中的元素存储到数组中
         * */
        Object[] arr = col.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*
         * 2.public void clear();  清空集合中所有的元素，不删除集合
         * */
        col.clear();
        System.out.println(col);//[]
        System.out.println(col.isEmpty());//true
    }
}
