package chen.study.day11File类和IO流.IO字符流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK7新特性：
        在try后面可以加一个括号，在括号里可以定义流对象
        那么这个流对象就对整个try都有效
        try中代码执行完毕，会自动把流对象释放，不用写finally
        格式：
          try(定义流对象；定义流对象。。。){
         可能产生异常的代码
        }catch(异常类变量 变量名){
          异常的处理逻辑
        }
 */
public class Demo04JDK7 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("/Users/chen/Desktop/1.jpeg");
            FileOutputStream fos = new FileOutputStream("/Users/chen/Desktop/IdeaProjects/1.jpeg")){
            int len;
            byte[] bytes = new byte[1024];
            while((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
