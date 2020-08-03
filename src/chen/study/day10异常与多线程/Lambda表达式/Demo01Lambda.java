package chen.study.day10异常与多线程.Lambda表达式;
/*
    lambda的标准格式：
    (参数) -> {一些重写方法的代码}；
    解释说明格式：
        ():接口中抽象方法的参数列表，没有参数，就空着，有参数就写参数，参数用逗号隔开
        ->:传递，把参数传递给方法体
        {}:重写接口的抽象方法的方法体
*/
public class Demo01Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建啦");
            }
        }).start();

        //使用Lambda表达式,实现多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" 新线程创建了");
        }
        ).start();
    }
}
