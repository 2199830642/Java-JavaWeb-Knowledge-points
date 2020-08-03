package chen.study.day11File类和IO流.IO字符流;

import java.io.FileWriter;
import java.io.IOException;

/*
    在jdk1.7之前，我们可以使用try catch finally处理流中的异常
    格式：try{
      可能产生异常的代码
    }catch(异常类变量 变量名){
     异常的处理逻辑
    }finally{
       一定会执行的代码
       资源释放
    }
 */
public class Demo03TryCatch {
    public static void main(String[] args) {
        //提高变量的作用域
        //变量定义时可以没有值，使用时必须要有值
        FileWriter fw = null;
        try {
            fw = new FileWriter("/Users/chen/Desktop/a.txt", true);
            for (int i = 0; i < 10; i++) {
                fw.write("\r" + "HelloWorld!!!" + " " +i);
            }
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            //一定会执行的代码
            if (fw != null) {
                try {
                    //fw.close声明抛出了异常对象
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}