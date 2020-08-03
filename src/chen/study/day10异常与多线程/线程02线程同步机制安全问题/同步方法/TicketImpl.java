package chen.study.day10异常与多线程.线程02线程同步机制安全问题.同步方法;

/*
 * 买票案例
 * 解决线程安全问题的第二种方案：使用同步方法
 * 使用步骤：
 *       1.把访问了共享数据的代码抽取出来放到一个方法中
 *       2.在方法上添加一个synchronized修饰符
 *   格式：
 *    修饰符 synchronized 返回值类型 方法名(参数列表){访问了共享数据的代码}
 * */
public class TicketImpl implements Runnable {
    //定义一个多线程共享的资源
    private int ticket = 100;

    @Override
    public void run() {
        //创建一个死循环
        while (true) {
            payTicket();
        }
    }
    /*
    * 定义一个同步方法
    * 同步方法也会把方法内部的代码锁住
    * 锁就是创建的实现类对象new TicketImpl，也就是this
    * */
    public synchronized void payTicket(){
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
        }
    }
}
