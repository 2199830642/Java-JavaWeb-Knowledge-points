package chen.study.day10异常与多线程.异常;

import java.io.IOException;

/*
 * try...catch:异常处理的第二种方式，自己处理异常
 *  格式：
 *   try{
 *   可能产生异常的代码
 *    }catch(定义一个异常变量，用来接收try中抛出的异常对象){
 *    异常的处理逻辑，之后怎么处理异常对象
 *    工作中，一般会把异常信息记录在一个日志中
 *    }
 *    ...
 *    catch(异常类型，变量名){
 *
 *     }
 *   注意：
 *     1.try中可能抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
 *     2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完后继续执行后续代码
 *  */
public class Demo04TryCatch {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
            //System.out.println("catch---文件后缀名不对");
            /*
             * Throwable类中定义了三个异常处理的方法
             * String getMessage() 返回此throwable的简短描述
             * String toString() 返回此throwable的详细信息
             * void printStackTrace() JVM打印异常对象，默认此方法，打印的异常信息是最全面的
             * */
            //System.out.println(e.getMessage());//文件后缀名不对
            //System.out.println(e.toString());//java.io.IOException: 文件后缀名不对
            //System.out.println(e);//java.io.IOException: 文件后缀名不对
            e.printStackTrace();
              /*
              * java.io.IOException: 文件后缀名不对
	          at cn.itcast.day10异常与多线程.异常.Demo04TryCatch.readFile(Demo04TryCatch.java:43)
	          at cn.itcast.day10异常与多线程.异常.Demo04TryCatch.main(Demo04TryCatch.java:25)
              * */
        }
        System.out.println("后续代码");
    }

    public static void readFile(String file) throws IOException {
        if (!file.endsWith(".txt")) {
            throw new IOException("文件后缀名不对");
        }
        System.out.println("文件后缀名无误");
    }
}
