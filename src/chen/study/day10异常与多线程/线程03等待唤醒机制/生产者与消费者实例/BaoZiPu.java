package chen.study.day10异常与多线程.线程03等待唤醒机制.生产者与消费者实例;

/*
 * 生产者类：包子铺：是一个线程类，可继承Thread也可实现Runnable
 * 设置线程任务(run)：生产包子
 * 对包子状态进行判断
 * true：有包子，包子铺进入等待状态
 * false：没有包子，包子铺开始生产包子
 *       可以生产两种包子，有两种状态(i%2==0)
 *       包子铺生产好包子，将包子状态改为true
 *       唤醒消费者线程，让其吃包子
 *
 * 注意：
 *     包子铺线程和吃货线程（通信关系-->互斥关系）
 *     必须使用同步关系，保证两个线程只有一个在执行
 *     锁对象必须一致，可以使用包子对象作为锁对象
 *     包子铺类和吃货类就需要把包子对象作为参数进行传递
 *          1.需要在成员位置创建一个包子变量
 *          2.使用带参数的构造方法，为包子赋值
 * */
public class BaoZiPu extends Thread {
    //1.需要在成员位置创建一个包子变量
    private BaoZi bz;

    //为包子添加构造方法
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        //设置一个死循环
        while (true) {
            synchronized (bz) {
                //对包子状态进行判断
                if (bz.flag == true) {
                    //包子铺进行睡眠状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行操作
                //没有包子开始生产包子,可以生产两种包子
                if (count % 2 == 0) {
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                } else {
                    bz.pi = "冰皮";
                    bz.xian = "牛肉馅";
                }
                count++;
                //开始生产包子
                System.out.println("包子铺正在生产" + bz.pi + bz.xian + "的包子,请稍等");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //包子铺生产好包子，将包子状态改为true
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺已经做好了" + bz.pi + bz.xian + "的包子，吃货快来吃");
            }
        }
    }
}
