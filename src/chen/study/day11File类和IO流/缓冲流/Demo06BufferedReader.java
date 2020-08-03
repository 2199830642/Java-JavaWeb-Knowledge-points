package chen.study.day11File类和IO流.缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    java.io.BufferedReader extends Reader;
    字符缓冲流
    和字符输出流同理

    特有的成员方法：
    String readLine();读取一行文本
 */
public class Demo06BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/chen/Desktop/a.txt"));
        String len;
        while((len=br.readLine())!=null){
            System.out.println(len);
        }
        br.close();
    }

}
