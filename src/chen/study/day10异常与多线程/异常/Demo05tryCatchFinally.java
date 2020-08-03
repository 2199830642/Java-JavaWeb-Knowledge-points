package chen.study.day10异常与多线程.异常;

import java.io.IOException;

/*
 *   finally代码块
 * 格式：
 *   try{
 *   可能产生异常的代码
 *    }catch(定义一个异常变量，用来接收try中抛出的异常对象){
 *    异常的处理逻辑，之后怎么处理异常对象
 *    工作中，一般会把异常信息记录在一个日志中
 *    }
 *    ...
 *    catch(异常类型，变量名){
 *
 *     }finally{
 *     无论是否出现异常都会执行
 *     }
 *   注意：
 *     finally不能单独使用，必须和try一起使用
 *     finally一般用于资源释放或者资源回收，无论程序是否出现异常，我们都需要进行资源释放(IO)
 * */
public class Demo05tryCatchFinally {
    public static void main(String[] args) {
        try{
            readFile("c:\\a.tx");
        }catch(Exception e){
            System.out.println("文件后缀名不对");
        }finally{
            //无论是否出现异常都会执行
            System.out.println("资源释放");
        }
    }


    public static void readFile(String file) throws IOException {
        if (!file.endsWith(".txt")) {
            throw new IOException("文件后缀名不对");
        }
        System.out.println("文件后缀名无误");
    }
}
