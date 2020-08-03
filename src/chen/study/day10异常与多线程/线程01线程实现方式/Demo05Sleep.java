package chen.study.day10异常与多线程.线程01线程实现方式;
/*
* public static void sleep(long millis);使当前正在执行的线程以指定的毫秒数暂停(暂停执行)
* 毫秒数结束后，线程继续执行
* */
public class Demo05Sleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);
            //使用Thread类中的sleep方法使其睡眠一秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
