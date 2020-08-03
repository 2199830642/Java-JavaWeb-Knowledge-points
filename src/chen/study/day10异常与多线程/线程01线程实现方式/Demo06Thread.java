package chen.study.day10异常与多线程.线程01线程实现方式;
/*
* 创建多线程程序的第二种方式：实现Runnable接口
* java.lang.Runnable
* Runnable应该由那些打算通过某一线程执行其实例的类来实现，类必须定义一个run的无参数构造方法
*
* 实现步骤：
* 1.传建一个Runnable接口的实现类
* 2.在实现类中重写Runnable接口中的run方法设置线程任务
* 3.创建一个Runnable接口的实现类对象
* 4.创建Thread类的对象，在其构造方法中传递Runnable实现类对象
* 5.调用Thread类的start方法
* */
public class Demo06Thread {
    public static void main(String[] args) {
        MyThread01 mt = new MyThread01();
        Thread t = new Thread(mt);
        t.setName("酸菜");
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"  "+i);
        }
    }
}
