package chen.study.day03数组;

/*
 * 数组元素的反转
 * 数组元素反转其实就是对称位置数组元素的交换
 *
 * 通常遍历数组使用一个索引
 * 数组的反转需要用两个
 * int i= o；
 * int j = array.length-1；
 *
 * 如何交换两个对称位置的值 用第三个杯子
 *
 * 什么时候停止交换    可以想成什么时候交换 即min<max时就该交换*/
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("数组本来的样子");
        System.out.println("======================");

        int temp;
        for (int j = 0, k = array.length-1; j < k; j++, k--) {
            temp = array[j];
            array[j] = array[k];
            array[k] = temp;
        }
        //再次打印输出反转后的样子
        for (int l =0;l<array.length;l++){
            System.out.println(array[l]);
        }
    }
}
