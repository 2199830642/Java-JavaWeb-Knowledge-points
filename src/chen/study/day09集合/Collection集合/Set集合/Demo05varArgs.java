package chen.study.day09集合.Collection集合.Set集合;

/*
 * 可变参数时JDK1.5之后出现的新特性
 * 使用前提：
 *   当方法的参数列表数据类型已经确定，但是参数的个数不定，就可使用可变参数
 * 定义方法时使用
 *   修饰符 返回值类型 方法名（数据类型...变量名）{}
 * 可变参数的原理：
 *   可变参数底层就是一个数组，根据传递参数的不同，会创建不同长度的数组，来存储这些参数
 *   传递的参数个数可以是0个，1个，2个，多个
 * */
public class Demo05varArgs {
    public static void main(String[] args) {
        //定义一个方法，用来计算0个到n个整数的和
        int sum = demo01(10, 20,99,2020,44,33,6,35552,3451,3232);
        System.out.println(sum);
    }

    /*
    *可变参数的注意事项；
    *  1.一个方法的参数列表，只能有一个可变参数
    *  2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
    * */


    public static int demo01(int... arr) {
        int num = 0;
        for (int i : arr) {
            num += i;
        }
        return num;
    }

    /*
    * 可变参数的终极写法
    * */

    public static void method(Object...obj){}
}
