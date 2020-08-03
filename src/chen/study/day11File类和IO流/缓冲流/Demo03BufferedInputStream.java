package chen.study.day11File类和IO流.缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.BufferedOutputStream extends OutputStream
    BufferedOutputStream:字节输出缓冲流

    继承自父类的成员方法：
             int read();从输入流中读取数据的下一个字节
             int read(byte[] b);从输入流中一次读取出多个字节，并将其存储到缓冲区数组b中
             close();释放资源
     构造方法：
        BufferedInputStream(InputStream out)
        BufferedInputStream(InputStream out , int size)
 */
public class Demo03BufferedInputStream {
    public static void main(String[] args) {
        try(
        FileInputStream fis = new FileInputStream("/Users/chen/Desktop/b.txt");
        BufferedInputStream bis = new BufferedInputStream(fis,1024);){
            byte[] bytes = new byte[1024];
            int len;
            while((len=bis.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
