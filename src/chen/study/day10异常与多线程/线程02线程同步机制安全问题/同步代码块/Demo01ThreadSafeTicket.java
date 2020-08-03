package chen.study.day10异常与多线程.线程02线程同步机制安全问题.同步代码块;

public class Demo01ThreadSafeTicket {
    public static void main(String[] args) {
        TicketImpl ti = new TicketImpl();

        Thread t = new Thread(ti);
        Thread t1 = new Thread(ti);
        Thread t2 = new Thread(ti);
        t.setName("售票窗口1");
        t1.setName("售票窗口2");
        t2.setName("售票窗口3");
        t.start();
        t1.start();
        t2.start();

    }
}
