package chen.study.day10异常与多线程.线程02线程同步机制安全问题.Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 买票案例
 * 解决线程安全问题的第三种方案：使用Lock锁
 * java.util.concurrent.locks.lock接口
 * lock实现提供了比synchronized方法和语句可获得的更广泛的锁定操作
 * Lock接口中的方法：
 *               void lock();获取锁
 *               void unlock();释放锁
 * java.util.concurrent.locks.ReentrantLock implements lock接口
 *
 * 使用步骤：
 *        1.在成员位置创建一个ReentrantLock的对象
 *        2.在可能出现安全问题的代码前面调用lock()方法，获取锁
 *        3.在可能出现安全问题的代码前面调用unlock()方法，释放锁
 * */
public class TicketImpl implements Runnable {
    //定义一个多线程共享的资源
    private int ticket = 100;

    //1.在成员位置创建一个ReentrantLock的对象
    Lock suo = new ReentrantLock();

    //重写run方法
    @Override
    public void run() {
        //创建一个死循环
        while (true) {
            //2.在可能出现安全问题的代码前面调用lock()方法，获取锁
            suo.lock();
            //判断票是否存在
            if (ticket > 0) {
                //增加线程安全问题出现率
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在售卖第" + ticket + "张票");
                ticket--;
                //3.在可能出现安全问题的代码前面调用unlock()方法，释放锁
                suo.unlock();
            }
        }
    }
}
