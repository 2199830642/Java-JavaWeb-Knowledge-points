package chen.study.day02方法使用的简单例子;
/*
* 求1加到100的和*/
public class demo04MethodSum {
    public static void main(String[] args) {
        System.out.println("100!="+isSum());
    }

    public static int isSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
