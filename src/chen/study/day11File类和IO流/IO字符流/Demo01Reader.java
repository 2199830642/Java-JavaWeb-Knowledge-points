package chen.study.day11File类和IO流.IO字符流;

import java.io.FileReader;
import java.io.IOException;

/*
    java.io.Reader字符输入流，是字符输入流的最顶层的父类是一个抽象类，里面定义了一些共性的成员方法
                int read();读取单个字符，并返回
                int read(char[] ch);一次性读取字符存入数组，读取多个字符
                void close();释放资源

     java.io.FileReader extends InputStreamReader extends Reader
     FileReader:文件字符输入流
     作用：把硬盘文件中的数据以字符形式读取到内存中

     构造方法：
     FileReader(String filename)   //文件路径
     FileReader(File file)     //文件
     参数：读取文件的数据源
 */
public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/chen/Desktop/信息系统开发方法知识点总结.docx");
        int len ;
        char[] ch = new char[1024];
        while((len=fr.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
    }
}
