package chen.study.day10异常与多线程.线程01线程实现方式;

/*
 * 创建一个新线程
 * */
//1.创建一个Thread类的子类
public class MyThread extends Thread {
    //2.在Thread类中的子类中重写Thread类中的run方法，设置线程任务(开启线程)
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:" + i);
        }
    }
}
