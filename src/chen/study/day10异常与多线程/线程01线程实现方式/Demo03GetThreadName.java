package chen.study.day10异常与多线程.线程01线程实现方式;

public class Demo03GetThreadName {
    public static void main(String[] args) {
        GetThreadName gt = new GetThreadName();
        gt.start();//Thread-0

        new GetThreadName().start();//Thread-1
        new GetThreadName().start();//Thread-2

        System.out.println(Thread.currentThread().getName());//main
    }
}
