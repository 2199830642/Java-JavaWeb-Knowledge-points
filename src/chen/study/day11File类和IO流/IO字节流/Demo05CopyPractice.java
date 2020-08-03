package chen.study.day11File类和IO流.IO字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//文件的复制
public class Demo05CopyPractice {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/Users/chen/Desktop/a");
        f1.mkdir();
        //创建一个输入流读取文件
        FileInputStream fis = new FileInputStream("/Users/chen/Desktop/1.jpeg");
        //创建一个输出流对象
        FileOutputStream fos = new FileOutputStream("/Users/chen/Desktop/a/1.jpeg");
        /*int len = 0;
        while ((len = fis.read()) != -1){
            //写入文件
            fos.write(len);
        }*/
        //利用数组进行优化
        byte[] bytes = new byte[1024];
        int len;
        while((len=fis.read(bytes))!=-1){
            //写入文件
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
