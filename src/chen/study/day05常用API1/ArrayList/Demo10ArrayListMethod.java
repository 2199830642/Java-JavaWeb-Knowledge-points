package chen.study.day05常用API1.ArrayList;

import java.util.ArrayList;

/*
 * ArrayList当中的常用方法：
 *
 * （1）Public bollean add（E e）,向集合中添加元素，参数的类型和泛型一致，返回值代表添加类型是否成功
 * ps：对于ArrayList集合来说，add动作一定是成功的，所以返回值可用可不用，
 * 但对于其他集合（今后学习）来说，add添加动作不一定成功
 * （2）Public E get（int index），从集合中获取元素，参数是索引编号，返回值就是对应位置的元素
 * （3）Public E remove（int index），从集合中删除元素，参数是索引编号，返回值就是被删除的元素
 * （4）Public int size（），获取集合的尺寸长度，返回值是集合中包括元素的个数
 * */
public class Demo10ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //向集合中添加元素：add
        list.add("张三");//直接添加
        boolean suc = list.add("李四");//可查看返回值，也可添加
        System.out.println(list);
        System.out.println("数据是否添加成功：" + suc);
        list.add("王五");
        list.add("陈六");
        System.out.println(list);//[张三, 李四, 王五, 陈六]

        //从集合list中获取元素：get
        String name = list.get(2);
        System.out.println("二号索引位置：" + name);//王五

        //从集合中删除元素：remove
        String whoRemoved = list.remove(1);
        System.out.println("被删除的人是："+whoRemoved);
        System.out.println(list);

        //获取集合的长度：size
        int size = list.size();
        System.out.println("集合的长度为："+size);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
