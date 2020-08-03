package chen.study.day06常用API2.数组工具类Arrays;

import java.util.Arrays;

/*
 * java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作
 * public static String toString(数组)，将参数数组变成字符串（按照默认格式：[元素1，2，3...]）。
 * public static void sort（数组），按照默认升序对数组元素进行排序
 *
 * ps:如果是数值 sort 默认从小到大
 *  如果是字符串，sort默认按字符升序
 *  如果是自定义的类型，那么这个自定义的类需要有Comparable或Comparator接口的支持（今后学习）
 * */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        //将int数组按默认格式转换为字符串
        String str = Arrays.toString(array);
        System.out.println(str);//[10, 20, 30]

        int[] array1 = {2, 1, 4, 3, 7, 4, 6, 5, 9};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));//[1, 2, 3, 4, 4, 5, 6, 7, 9]

        String[] array2 = {"aaa", "bbb", "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));//[aaa, bbb, ccc]

    }
}
