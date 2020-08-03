package chen.study.day11File类和IO流.转换流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    java.io.InputStreamReader extends Reader
    作用：
        是字节流通往字符流的桥梁，它使用指定的charset读取字节并解码为字符
    共性方法：
                int read();读取单个字符，并返回
                int read(char[] ch);一次性读取字符存入数组，读取多个字符
                void close();释放资源
    构造方法：
            InputStreamWriter(InputStream out)创建使用默认的InputStreamWriter
            InputStreamWriter(InputStream out, String charsetName)创建使用指定的InputStreamWriter
            参数：
                字节输入流，用来读取文件中保存的字节
                编码表名称
 */
public class Demo03InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("/Users/chen/Desktop/IO流的小栗子/utf.txt"),"GBK");
        char[] a = new char[1024];
        int len;
        while((len = isr.read(a))!=-1){
            System.out.println(new String(a,0,len));//杩欐槸utf-8鏍煎紡缂栫爜鐨勫彞瀛 编码表不对，乱码
        }
        isr.close();
    }
}
