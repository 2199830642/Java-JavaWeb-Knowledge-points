package chen.study.day03数组;

/*
 * 一个方法可以有多个参数，但只能有一个返回值
 * 如果希望一个方法中产生多个返回值 怎么办？
 * 解决方案：使用一个数组作为返回值类型即可
 *
 *
 * 任何数据类型都可以作为方法的参数类型，或返回值类型
 *
 * 数组作为方法的参数传递进方法的其实是数组的地址值
 * 数组作为方法的返回值传递回去的也是数组的地址值
 * */
public class Demo09ArrayReturn {
    public static void main(String[] args) {
        int[] result = re(2.1,2.2,4);
        System.out.println("总和为："+result[0]);
        System.out.println("平均数为："+result[1]);
        System.out.println("========================");
        System.out.println(re(2.1,2.2,3));//返回值为数组地址的哈希值
    }

    public static int[] re(double a, double b, int c) {
        int sum = (int) (a + b + c);
        int avg = sum / 3;
        int[] arr = new int[2];
        arr[0] = sum;
        arr[1] = avg;
        return arr;
    }
}
