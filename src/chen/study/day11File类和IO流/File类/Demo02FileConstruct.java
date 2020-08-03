package chen.study.day11File类和IO流.File类;

import java.io.File;

/*
    路径：
        绝对路径：一个完整的路径
                      以盘符开始的路径 /Users/chen/a.txt
        相对路径：一个简化的路径
                      相对指的是当前项目的根目录
                      如果使用当前项目的根目录，可以简化书写
                      /Users/chen/Desktop/123.txt-->简化为123.txt


    构造方法：见以下方法
*/
public class Demo02FileConstruct {
    public static void main(String[] args) {
        /*
           File类的构造方法
        */
        show01();
        show02("/users/chen","a.txt");
        show03();
    }

    /*
        File(File parent, String child) 从父抽象路径名和子路径名字符串创建新的 File实例。
        好处：
           更加灵活
           父路径是File方法，可以使用File的方法对路径进行一些操作，再使用路径创建对象
     */
    private static void show03() {
        File parent = new File("/Users/chen");
        File f1 = new File(parent,"hello.java");///Users/chen/hello.java
        System.out.println(f1);
    }

    /*
      File(String parent, String child) 从父路径名字符串和子路径名字符串创建新的 File实例。
      把路径分为了两部分：父路径与子路径
      优点：使用起来更加灵活
    */
    private static void show02(String parent,String child) {
        File f1 = new File(parent,child);
        System.out.println(f1);///users/chen/a.txt
    }

    /*
      File(String pathname)通过将指定路径名字符串转换为抽象路径名来创建一个File实例
      参数：
         pathname：字符串的路径名称
         路径可以是以文件结尾，也可以文件夹结尾
         可以是相对路径，也可以是绝对路径
         可以是存在的，也可以是不存在的
         创建File对象，只是将字符串路径封装为File对象，不考虑路径真假
    */
    private static void show01() {
        File f1 = new File("/Users/chen/a.txt");
        System.out.println(f1);///Users/chen/a.txt   重写了Object类的toString方法
        File f2 = new File("/Users/chen");
        System.out.println(f2);///Users/chen

        File f3 = new File("b.txt");
        System.out.println(f3);//b.txt
    }
}
