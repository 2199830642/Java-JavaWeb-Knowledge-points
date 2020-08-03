package chen.study.day06常用API2.Math;

/*
 * java.util.Math是与数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作
 *
 * public static double abs(double num)。获取绝对值。
 * public static double ceil(double num)。向上取整。
 * public static double floor(double num)。向下取整。
 * public static long round(double num)。四舍五入。
 *
 * Math.PI代表近似的圆周率
 * */
public class Demo01Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));//3.14
        System.out.println(Math.abs(-2));//2
        System.out.println("============================");

        //向上取整
        System.out.println(Math.ceil(3.9));//4.0
        System.out.println(Math.ceil(4.1));//5.0
        System.out.println(Math.ceil(41));//41.0
        System.out.println("=============================");

        //向下取整
        System.out.println(Math.floor(4.9));//4.0
        System.out.println("=============================");

        //四舍五入
        System.out.println(Math.round(4.5));//5
        System.out.println(Math.round(20.4));//20
        System.out.println(Math.round(45));//45
        System.out.println("==============================");

        double num = Math.PI;
        System.out.println(num);
    }
}
