package chen.study.day10异常与多线程.线程01线程实现方式;

public class MyThread01 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}
