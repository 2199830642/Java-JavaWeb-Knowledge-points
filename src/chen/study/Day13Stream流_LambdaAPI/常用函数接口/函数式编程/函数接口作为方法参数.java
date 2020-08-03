package chen.study.Day13Stream流_LambdaAPI.常用函数接口.函数式编程;

public class 函数接口作为方法参数 {
    //定义一个threadStart方法，方法的参数用函数是接口Runnable
    public static void threadStart(Runnable a){
        new Thread(a).start();
    }

    public static void main(String[] args) {
        threadStart(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));
    }
}
