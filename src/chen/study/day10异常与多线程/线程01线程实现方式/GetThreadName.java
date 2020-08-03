package chen.study.day10异常与多线程.线程01线程实现方式;
/*
* 获取线程的名称：
*        1.使用Thread类中的getName方法
*        String getName();返回线程的名字
*        2.可以先获取到当前执行的线程，再用线程中的getName方法获取线程名称
*        static Thread currentThread();返回对当前正在执行的线程对象的引用
* */
public class GetThreadName extends Thread{
    @Override
    public void run() {
        String name = getName();
        System.out.println(name);

        Thread t = Thread.currentThread();
        System.out.println(t);
        //Thread[Thread-0,5,main]
        //Thread[Thread-1,5,main]
        //Thread[Thread-2,5,main]

    }

}
