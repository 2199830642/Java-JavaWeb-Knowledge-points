package chen.study.day10异常与多线程.线程03等待唤醒机制;

/*
 * 等待唤醒案例：线程之间的通信
 *       顾客线程：告知老板要的包子的种类和数量，然后调用wait方法，放弃cpu的执行，进入waiting状态
 *       老板线程：花了五秒做包子，做好之后调用notify方法唤醒顾客吃包子
 *
 * 注意事项：1.顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒，只能有一个在执行
 *         2.同步使用的锁对象必须保持唯一
 *         3.只有锁对象可以调用wait和notify方法
 *
 * Object类中的方法：
 *         void wait(),在其他线程调用此对象的notify()或notifyAll()方法前，导致当前线程等待
 *         void notify(),唤醒在此对象监视器上等待的单个线程，会继续执行wait方法之后的代码
 * */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建一个锁对象
        Object obj = new Object();
        //创建一个顾客线程，可以使用匿名内部类
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("我要吃牛肉包子，五个");
                //顾客和老板线程必须使用同步代码块包裹起来
                synchronized (obj) {
                    //保证等待和唤醒，只能有一个在执行,使用wait方法
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("开动！！！！！");
                System.out.println("=============================");
            }
        };
        new Thread(r).start();

        //创建一个老板线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("开始做包子，需要等待5秒钟");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //保证等待和唤醒，只能有一个在执行,使用notify方法唤醒
                synchronized (obj) {
                    System.out.println("包子已经做好啦！");
                    obj.notify();
                }
            }
        }).start();
    }
}
