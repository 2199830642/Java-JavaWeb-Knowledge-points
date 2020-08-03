package chen.study.day10异常与多线程.线程04线程池;

//2.创建一个类实现Runnable接口重写run方法，设置线程任务
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程已创建");
    }
}
