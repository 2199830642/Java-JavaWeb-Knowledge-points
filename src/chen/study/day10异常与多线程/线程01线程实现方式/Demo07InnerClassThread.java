package chen.study.day10异常与多线程.线程01线程实现方式;
/*
*   匿名内部类的方式实现线程的创建
*
*   匿名：没有名字。   内部类：写在其他类中的类
*
*   匿名内部类的作用：简化代码
*       把子类实现父类，重写父类的方法，创建子类的对象合为一步完成
*       把实现类实现接口，重写接口方法，创建实现类对象合为一步完成
*
*   匿名内部类最终产物:子类/实现类对象，而这个类没有名字
*
*   格式：
*      new 父类/接口(){
*      重写父类/接口中的方法
*     }
* */
public class Demo07InnerClassThread {
    public static void main(String[] args) {
        //1.使用继承
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"小陈");
                }
            }
        }.start();

        //使用接口
        Runnable r =new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"小王");
                }
            }
        };
        new Thread(r).start();

        //接口简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"酸菜");
                }
            }
        }).start();
    }
}
