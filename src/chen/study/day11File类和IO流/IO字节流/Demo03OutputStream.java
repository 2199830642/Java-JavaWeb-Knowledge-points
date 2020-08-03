package chen.study.day11File类和IO流.IO字节流;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    数据的追加续写和换行
    追加写（续写）：
                FileOutputStream(String name,boolean append);创建一个具有指定name的文件中写入数据的输出文件流
                FileOutputStream(File file , boolean append);创建一个向指定File对象表示的文件中写入数据的文件输出流
                参数：
                   String name/File file:写入数据的目的地
                   boolean append：追加写开关，true创建对象不会覆盖文件，会追加写
                                             false 创建一个新文件

     换行：写换行符号
     windows：：\r\n
     linux/unix:\n
     mac:\r
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/chen/Desktop/b.txt",true);
        fos.write("你好".getBytes());
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r".getBytes());
        }
        fos.close();
    }
}
