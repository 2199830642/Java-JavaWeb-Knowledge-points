package chen.study.day11File类和IO流.转换流;

import java.io.*;

/*
    指定GBK编码的转换流读取文件
    使用utf-8的转换流，写入文件
 */
public class Demo04Practice {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("/Users/chen/Desktop/IO流的小栗子/gbk.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("/Users/chen/Desktop/IO流的小栗子/gbk->utf.txt"),"utf-8");
        //确认一下格式是否正确 读取一下写入的文件
        InputStreamReader isr1 = new InputStreamReader(
                new FileInputStream("/Users/chen/Desktop/IO流的小栗子/gbk->utf.txt"),"gbk");
        char[] chars = new char[1024];
        int len;
        while((len = isr.read(chars))!=-1){
            osw.write(chars,0,len);
        }
        isr.close();
        osw.close();
        //确认一下格式是否正确 读取一下写入的文件
        char[] ch = new char[1024];
        int len1;
        while((len1 = isr1.read(ch))!=-1){
            System.out.println(new String(ch,0,len1));//编码错误 杩欐槸gbk鏍煎紡缂栫爜鐨勫彞瀛，乱码，
                                                             //已经变成utf-8格式，就需要用utf-8解码
        }

        isr1.close();
    }
}
