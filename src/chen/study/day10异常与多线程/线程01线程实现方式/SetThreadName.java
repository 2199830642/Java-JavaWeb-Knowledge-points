package chen.study.day10异常与多线程.线程01线程实现方式;
/*
* 设置线程名称:(了解)
*        1. void setName(String name)
*        2.创建一个带参数的构造方法参数传递线程的名称，调用父类的带参构造方法，把线程名称传递给父类，让父类起名字
*         Thread(String name)
* */
public class SetThreadName extends Thread{
    //2.创建一个带参数的构造方法参数传递线程的名称，调用父类的带参构造方法，把线程名称传递给父类，让父类起名字
    public SetThreadName(){}
    public SetThreadName(String name){
        super(name);
    }

    //1. void setName(String name)
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
