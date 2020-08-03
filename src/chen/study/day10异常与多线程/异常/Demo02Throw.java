package chen.study.day10异常与多线程.异常;

/*
 * throw关键字：
 *    作用：
 *        可以使用throw关键字在指定的方法中抛出指定的异常
 *    使用格式：
 *        throw new xxxException("异常产生的原因");
 *    注意：
 *       1.throw关键字必须写在方法的内部
 *       2.throw后面new的对象必须是Exception或者Exception的子类对象
 *       3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
 *                throw后面new的如果是RunTimeException或者RunTimeException的子类对象，我们可以不处理默认交给JVM处理（打印异常对象，终止程序）
 *                若产生的是其他的则必须处理，要么throws要么try...catch
 * */
public class Demo02Throw {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int e = showEle(arr1, -1);
        System.out.println(e);
    }

    //定义一个方法，获取数组的索引处的元素
    //以后在工作中首先必须对方法传递过来的参数进行合法性校验
    //如果参数不合法，那我们就必须使用抛出异常的方式，告知方法的调用者传递的参数有问题
    public static int showEle(int[] arr, int index) {
        /*
         * 先对传过来的参数数组，进行合法性校验
         * 如果数组arr值为null
         * 那我们就抛出空指针异常，告诉调用者"传递的数组的值为空"
         * */
        if (arr == null) {
            throw new NullPointerException("传递的数组为空");
        }
        if (index > arr.length - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException("数组传递的索引超越了数组的适用范围");
        }
        int ele = arr[index];
        return ele;
    }
}
