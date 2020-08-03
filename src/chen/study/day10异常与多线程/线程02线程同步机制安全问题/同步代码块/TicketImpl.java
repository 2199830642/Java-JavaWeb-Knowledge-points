package chen.study.day10异常与多线程.线程02线程同步机制安全问题.同步代码块;

/*
 * 买票案例
 *
 * 但是其出现了线程安全问题，卖出了重复的票
 *
 * 解决线程安全问题的第一种方案：使用同步代码块
 * 格式：
 *    synchronized(锁对象){
 *     可能会出现线程安全问题的代码（访问了共享数据的代码）
 *    }
 * 注意：
 *     1.同步代码块中的锁对象可以是任意的对象
 *     2.必须保证多个线程使用的锁对象是同一个
 *     3.锁对象作用：可以把同步代码块锁住，只让一个线程在同步代码块中执行
 * 总结：同步中的线程，没有执行完毕是不会释放锁的，同步外的线程没有锁进不去同步，处于阻塞状态
 *
 * 同步保证了只有一个线程在同步中执行共享数据
 * 保证了安全
 * 但是程序会频繁的判断锁，获取锁，释放锁,程序的效率会降低，但是影响不大
 * */
public class TicketImpl implements Runnable {
    //定义一个多线程共享的资源
    private int ticket = 100;
    //创建一个锁对象
    Object obj = new Object();


    @Override
    public void run() {
        //创建一个死循环
        while (true) {
            //增加线程安全问题出现率
            synchronized (obj) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //判断票是否存在
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在售卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}