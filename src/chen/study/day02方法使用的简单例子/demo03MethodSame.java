package chen.study.day02方法使用的简单例子;

/*
 * 定义一个方法，判断两个数字是否相同*/
public class demo03MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
    }

    public static boolean isSame(int a, int b) {
        boolean same = a == b;
        return same;
    }
}
