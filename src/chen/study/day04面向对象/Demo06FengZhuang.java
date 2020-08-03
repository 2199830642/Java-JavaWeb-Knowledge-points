package chen.study.day04面向对象;

/*
 * 面向对象三大特征：封装、继承、多态
 *
 * 封装性在Java中的体现：
 * 1.方法就是一种封装
 * 2.关键字private也是一种封装
 *
 * 封装就是将一些信息细节隐藏起来，对于外界不可见
 * */
public class Demo06FengZhuang {
    public static void main(String[] args) {
        int[] array = {2, 4, 62, 5, 6, 4};

        int a = getMax(array);
        System.out.println("最大值"+a);
    }


    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

