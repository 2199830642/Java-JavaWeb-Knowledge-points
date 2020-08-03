package chen.study.day10异常与多线程.线程03等待唤醒机制.生产者与消费者实例;
/*
* 测试类：
* 包含main方法，程序执行的入口，启动程序
* 创建包子对象
* 创建包子铺线程，启动生产包子
* 创建吃货线程，启动吃包子
* */
public class Demo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
