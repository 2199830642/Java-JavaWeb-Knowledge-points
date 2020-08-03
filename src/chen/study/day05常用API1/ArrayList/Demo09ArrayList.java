package chen.study.day05常用API1.ArrayList;

import java.util.ArrayList;

/*
* 数组的长度不可以发生改变
* 但是ArrayList的长度是可以随意变化的
*
* 对于ArrayList来说后面的尖括号<E>代表泛型。
* 泛型：也就是装在集合中的所有元素统一是什么类型
* 注意：这里的类型只能是引用类型，不能是基本类型
*
* 注意事项：对于ArrayList来说直接打印得到的不是地址值，而是内容，如果内容为空
* 则打印出来的是[]
* */
public class Demo09ArrayList {
    public static void main(String[] args) {
        //创建一个ArrayList的集合，名称为list，里面装的全都是String类型的字符串
        //ps：从JDK1.6开始右边的<>可以不写内容，但是左边本身的还是要写
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        list.add("鹿晗");//[鹿晗]
        System.out.println(list);

        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);//[鹿晗, 张三, 李四, 王五]
    }
}
