package chen.study.day08常用API3.System类;

import java.util.Arrays;

public class DemoSystem {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /*
    * arrayCopy方法
    * */
    private static void demo02() {
        int[] A = {1,2,3,4,5};
        int[] B = {6,7,8,9,10};
        System.out.println(Arrays.toString(B));
        System.arraycopy(A,0,B,0,3);
        System.out.println(Arrays.toString(B));
    }

    /*
    * public static long currentTimeMills();返回以毫秒为单位的时间
    * 可以用来看程序的效率
    * 验证for循环打印1-9999所需要的时间
    * */
    private static void demo01() {
        //程序执行前获取一次毫秒值
        long s = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序共耗时"+(end-s)+"毫秒");
    }
}
