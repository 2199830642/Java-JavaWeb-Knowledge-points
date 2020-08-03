package chen.study.day11File类和IO流.打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    java.io.printStream:打印流
    特点：
        1.只负责数据的输出，不负责数据的读取
        2.与其他的输出流不同，它永远不会抛出IOException
        3.里面有特有的方法：print，println

    构造方法：
        printStream(File file):输出的目的地是一个文件
        printStream(OutputStream out)：输出的目的地是一个字节输出流
        printStream(String fileName)：输出目的地是一个文件路径

    printStream extends OutputStream
    继承自父类的成员方法;
            public void close();关闭此输出流并释放与此流相关联的任何系统资源
            public void flush();刷新此输出流并强制任何缓冲的输出字节流被写出
            public void write(byte[] b);将b.length字节从指定的字节数组中写入此输出流
            public void write(byte[] b ,int off , int len);从指定的字符数组写入len字节，从偏移量off开始输出到此输出流
            public abstract void write(int b);将指定的字节输出流

    注意：
        如果使用父类的write方法写数据，那么查询的数据会查询编码表: 97-->a
        如果使用自身的print方法写数据，name写的数据原样输出：97-->97
 */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("/Users/chen/Desktop/IO流的小栗子/PrintStream.txt");
        ps.write(97);
        ps.println(97);
        ps.close();
    }
}
