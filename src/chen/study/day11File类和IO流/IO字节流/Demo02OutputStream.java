package chen.study.day11File类和IO流.IO字节流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    public abstract class OutputStream
    此抽象类时表示输出字节流的所有类的超类
    java.io.OutputStream：字节输出流
    定义了一些子类都可以使用的成员方法
            public void close();关闭此输出流并释放与此流相关联的任何系统资源
            public void flush();刷新此输出流并强制任何缓冲的输出字节流被写出
            public void write(byte[] b);将b.length字节从指定的字节数组中写入此输出流
            public void write(byte[] b ,int off , int len);从指定的字符数组写入len字节，从偏移量off开始输出到此输出流
            public abstract void write(int b);将指定的字节输出流

    java.io.FileOutputStream extends OutputStream
    FileOutputStream:文件字节输出流
    作用：把内存中的数据写入硬盘的文件中

    构造方法：
           FileOutputStream(String name);创建一个向有指定名称的文件中写入数据的输出文件流
           FileOutputStream(File file);创建一个向指定File对象表示的文件中写入数据的文件输出流
           参数：写入数据的目的地
              String name；目的地是一个文件的路径
              File file：目的地是一个文件
           构造方法的作用：
              创建一个FileOutputStream对象
              会根据构造方法中传递的文件/文件路径，创建一个空的文件
              会把对象指向创建好的文件

     写入数据的原理：
         java程序---JVM虚拟机---os操作系统--os调用写数据的方法--把数据写入文件

     字节输出流的使用步骤(学习重点)：
        1.创建FileOutputStream对象，构造方法中传递写入数据的目的地
        2.调用对象的write方法，将数据写入文件
        3.释放资源(流使用会占用一定内存，使用完毕需要将内存清空，提供程序的效率)
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        /*先创建一个文件
        File f1 = new File("/Users/chen/Desktop/a.txt");
        f1.createNewFile();*/
        FileOutputStream fos = new FileOutputStream("/Users/chen/Desktop/a.txt");
        fos.write(97);//a
        fos.close();

        //写入多个字节
        FileOutputStream fos1 = new FileOutputStream(new File("/Users/chen/Desktop/b.txt"));
        //写入一百就得写三个字节
        fos1.write(49);//1
        fos1.write(48);//0
        fos1.write(48);//0

        // public void write(byte[] b);将b.length字节从指定的字节数组中写入此输出流
        //如果写入的第一个字节为正数，会直接查询ASCII码表
        //如果第一个为负数，那他会和第二个字节组成一个中文显示，默认查询系统GBK（简体中文）码表
        byte[] a= {65,66,67,68,69,70};//A B C D E F
        //byte[] a= {-65,-66,-67,68,69,70};//烤侥EF
        fos1.write(a);

        byte[] bytes = "你好".getBytes();
        System.out.println(Arrays.toString(bytes));//[-28, -67, -96, -27, -91, -67],因为用的是utf-8不是GBK
        fos1.write(bytes);                                //utf-8三个字节代表一个中文 GBK是两个

        // public void write(byte[] b ,int off , int len);从指定的字符数组写入len字节，从偏移量off开始输出到此输出流
        //off:数组的开始索引，len：写几个

        byte[] b = {99,100,101,102,103,104,105,106};//c d e f g h i j
        fos1.write(b,3,4);//f g h i
        fos1.close();
    }
}
