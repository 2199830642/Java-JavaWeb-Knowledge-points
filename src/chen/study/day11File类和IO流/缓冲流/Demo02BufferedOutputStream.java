package chen.study.day11File类和IO流.缓冲流;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    java.io.BufferedOutputStream extends OutputStream
    BufferedOutputStream:字节输出缓冲流

    继承自父类的成员方法：
            public void close();关闭此输出流并释放与此流相关联的任何系统资源
            public void flush();刷新此输出流并强制任何缓冲的输出字节流被写出
            public void write(byte[] b);将b.length字节从指定的字节数组中写入此输出流
            public void write(byte[] b ,int off , int len);从指定的字符数组写入len字节，从偏移量off开始输出到此输出流
            public abstract void write(int b);将指定的字节输出流

    构造方法：
        BufferedOutputStream(OutputStream out)创建一个新的字符输出流，以将数据写入指定的底层输出流
        BufferedOutputStream(OutputStream out , int size)创建一个新的字符输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流

     参数：
        OutputStream out字符输出流
        我们可以传递FileOutputStream，缓冲流会给FileOutputStream一个缓冲区，提高其写入速度
        int size 指定内部数组大小

     使用步骤：
        1.创建一个FileOutputStream对象，构造方法中传递地址
        2.创建一个BufferedOutputStream对象，里面传递FileOutputStream对象，提高FileOutputStream对象效率
        3.使用write方法，将数据写入内部缓冲区中
        4.用flush方法，将缓冲区数据刷新入硬盘文件  这一步可省略
        5.释放资源
 */
public class Demo02BufferedOutputStream {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("/Users/chen/Desktop/b.txt");
            BufferedOutputStream bis = new BufferedOutputStream(fos,1024);)
        {
            bis.write("我写入这些文件".getBytes());
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
