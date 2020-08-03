package chen.study.day11File类和IO流.IO字节流;

import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.InputStream;字节输入流
    此抽象类是所有字节输入流的一个超类
    定义了所有子类共性的方法:
             int read();从输入流中读取数据的下一个字节
             int read(byte[] b);从输入流中一次读取出多个字节，并将其存储到缓冲区数组b中
             close();释放资源

    java.io.FileInputStream extends InputStream;
    FileInputStream:文件字节输入流
    作用：
        把硬盘中文件数据，读取到内存中使用
    构造方法：
       FileInputStream(String name);
       FileInputStream(File file);
       参数：读取文件的数据源 name：路径，file：文件
     作用：
        创建一个对象
        会把对象指向构造方法中要读取得文件
 */
public class Demo04InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/chen/Desktop/b.txt");
        //1.int read();从输入流中读取数据的下一个字节
        /*int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println((char) len);
        }*/


        //int read(byte[] b);从输入流中一次读取出多个字节，并将其存储到缓冲区数组b中
        //byte[] b = new byte[10];//存储读取到的多个字节
        int len;
        int len2;
        int len3;
        while ((len = fis.read()) != -1) {
            if (!(len < 128 && len >= 0)) {
                len2 = fis.read();                //utf-8是三个字节组成一个汉字
                len3 = fis.read();
                System.out.println(new String(new byte[]{(byte) len, (byte) len2, (byte) len3}));
                continue;
            }
            System.out.println((char) len);
        }
        fis.close();
    }
}
