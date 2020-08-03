package chen.study.day10异常与多线程.线程03等待唤醒机制.生产者与消费者实例;
/*
* 消费者(吃货)类：是一个线程类，科技城Thread，也可实现Runnable
* 设置线程任务(run)：吃包子
* 对包子状态进行判断：
* false：吃货进入等待状态
* true：吃货开始吃包子，吃完包子，将包子状态改为true，吃货唤醒包子铺线程，开始做包子
* */
public class ChiHuo extends Thread {
    //1.需要在成员位置创建一个包子变量
    private BaoZi bz;

    //为包子添加构造方法
    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }
    //设置线程任务

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                //判断包子状态
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //吃货被唤醒开始吃包子
                System.out.println("吃货正在吃" + bz.pi + bz.xian + "的包子");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                //吃完后
                System.out.println("吃货已经吃完啦");
                //修改包子状态
                bz.flag = false;
                //唤醒包子铺做包子
                bz.notify();
                System.out.println("=====================");
            }
        }
    }
}
