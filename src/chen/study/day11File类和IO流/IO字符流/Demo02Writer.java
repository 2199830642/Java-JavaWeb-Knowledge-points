package chen.study.day11File类和IO流.IO字符流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    java.io.writer字符输出流 ，是所有字符输出流最顶层的父类，是一个抽象类
        共性成员方法：
                abstract void close()关闭流，先刷新。
                abstract void flush()刷新流。
                void write(char[] cbuf)写入一个字符数组。
                abstract void write(char[] cbuf, int off, int len)写入字符数组的一部分。
                void write(int c)写一个字符
                void write(String str)写一个字符串
                void write(String str, int off, int len)写一个字符串的一部分。

     java.io.FileWriter extends OutputStreamWriter extends Writer
     FileWriter:文件字符输出流
     作用：把内存中的字符数据写入文件中
     构造方法：
          FileWriter(String filename)
          FileWriter(File file)
          FileWriter(String filename,boolean append)
          FileWriter(File file,boolean append)

     注意：字符输出流，并不是直接把数据写入文件中，而是先写在内存缓冲区进行字符到字节的转化，需要刷新
          即可以使用flush方法刷新，也可直接使用close方法(自带刷新)
          flush和close的区别：
          flush():刷新缓冲区，流对象可以继续使用
          close():先刷新缓冲区，然后通知系统释放资源，流对象不可以再使用
 */
public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/chen/Desktop/a.txt");
        fw.write("你好，我是小陈");
        fw.flush();
        fw.write(new char[]{'A','b','C','D'});
        fw.flush();
        fw.close();

        FileReader fr = new FileReader("/Users/chen/Desktop/a.txt");
        char[] ch = new char[1024];
        int len;
        while((len=fr.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
    }
}
