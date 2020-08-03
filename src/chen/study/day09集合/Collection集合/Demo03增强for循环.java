package chen.study.day09集合.Collection集合;

import java.util.ArrayList;
import java.util.Collection;

/*
* 增强for循环(foreach)：底层也是用的Iterator迭代器，使用for循环的格式，简化了迭代器的书写
* 就是用来遍历集合和数组：
*            格式：
*                 for(集合/数组的数据类型 变量名：集合名/数组名){
*                           sout(变量名)
*                   }
* */
public class Demo03增强for循环 {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        Collection<String> col = new ArrayList<>();
        col.add("姚明");
        col.add("詹姆斯");
        col.add("乔丹");
        col.add("科比");
        for (String s: col) {
            System.out.print(s);
        }
    }

    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for (int i:arr) {
            System.out.println(i);
        }
    }
}
