package chen.study.day10异常与多线程.线程01线程实现方式;

/*
 * 创建多线程程序的第一种方式：
 *                          创建Thread类的子类
 * java.lang.Thread类：是描述线程的类，我们想要实现多线程程序,就必须继承Thread类
 *
 * 实现步骤：
 *        1.创建一个Thread类的子类
 *        2.在Thread类中的子类中重写Thread类中的run方法，设置线程任务(开启线程)
 *        3.创建Thread类的子类对象
 *        4.调用Thread类中的start方法，让其开启新的线程，执行run方法
 *   void start() 使该线程开始执行；JVM调用该线程的run方法
 *   结果是两个线程并发的运行，一个是当前线程(main线程)和另一个线程(创建的新线程)
 *   多次启动一个线程是违法的，特别是当线程已经结束执行后，不能再重新启动
 *
 * */
public class Demo02Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("main:" + i);
        }

        //3.创建Thread类的子类对象
        MyThread mt = new MyThread();
        //4.调用Thread类中的start方法，让其开启新的线程，执行run方法
        mt.start();
    }
}
