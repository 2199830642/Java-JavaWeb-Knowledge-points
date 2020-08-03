package chen.study.day11File类和IO流.缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
    java.BufferedWriter extends Writer
    字符缓冲流
    其余和前面字节流同理

    特有的成员方法：
      void newLine();写入一个行分隔符，会根据不同的操作系统获取不同的行分隔符
 */
public class Demo05BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/chen/Desktop/a.txt",true));
        bw.newLine();
        bw.write("你好我是小陈");
        bw.newLine();
        bw.write("你好，我是mac");
        bw.close();
    }
}
