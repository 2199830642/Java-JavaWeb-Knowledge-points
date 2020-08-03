package chen.study.day11File类和IO流.转换流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
    java.io.OutputStreamWriter extends Writer
    作用：
         是字符流通往字节流的桥梁；可使用指定的charset将要写入的字符转换为字节(编码)

    继承自父类的共性成员方法：
                abstract void close()关闭流，先刷新。
                abstract void flush()刷新流。
                void write(char[] cbuf)写入一个字符数组。
                abstract void write(char[] cbuf, int off, int len)写入字符数组的一部分。
                void write(int c)写一个字符
                void write(String str)写一个字符串
                void write(String str, int off, int len)写一个字符串的一部分。

    构造方法：
            OutputStreamWriter(OutputStream out)创建使用默认的OutputStreamWriter
            OutputStreamWriter(OutputStream out, String charsetName)创建使用指定的OutputStreamWriter
            参数：
                OutputStream out：字节输出流
                String charsetName：指定的编码表名称不区分大小写
 */
public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_UTF_8();
    }

    private static void write_UTF_8() throws IOException {
        //创建其对象，构造方法中传递的是字节输出流
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("/Users/chen/Desktop/IO流的小栗子/gbk.txt"),"GBK");
        osw.write("这是gbk格式编码的句子");
        osw.flush();
        osw.close();
    }
}
