package chen.study.day10异常与多线程.线程04线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    线程池：JDK1.5之后所提供
    java.util.concurrent.Executors;线程池的工厂类，用来生产线程池
    Executors中有一个静态方法用来产生线程池:
         static ExecutorService	newFixedThreadPool(int nThreads);创建一个可重用固定数量线程的线程池
         参数：
            int nThreads：创建线程池所包含的线程数
         返回值：
            ExecutorService接口，返回的是ExecutorService的实现类对象，我们可以使用ExecutorService接口来接收（面向接口编程）
     java.util.concurrent.ExecutorService:线程池接口
      用来从线程池中获取线程，调用start方法，执行线程任务
        submit(Callable<T> task)，提交一个Runnable任务用于执行
      用于关闭线程池的方法:
         void shutdown()

      线程池的使用步骤：
          1.使用线程池工厂类Executors中的静态方法newFixThreadPool生产一个指定线程数量的线程池
          2.创建一个类实现Runnable接口重写run方法，设置线程任务
          3.调用ExecutorsService中的submit方法传递线程任务，开启线程，执行run方法
          4.调用ExecutorsService中的shutdown方法关闭线程（不建议使用，除非真的没用了）
 */
public class Demo02ThreadPool {
    public static void main(String[] args) {
        //1.使用线程池工厂类Executors中的静态方法newFixThreadPool生产一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        //3.调用ExecutorsService中的submit方法传递线程任务，开启线程，执行run方法
        es.submit(new RunnableImpl());//pool-1-thread-1线程已创建
        es.submit(new RunnableImpl());//pool-1-thread-1线程已创建
        es.submit(new RunnableImpl());//pool-1-thread-2线程已创建
    }
}
