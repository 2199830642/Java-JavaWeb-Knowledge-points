package chen.study.day10异常与多线程.异常;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
* throws关键字：这是异常处理的第一种方式，交给别人处理
* 作用：
*     当方法内部抛出异常对象的时候,那么我们必须处理这个异常对象
*     可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理,最终交给jvm处理
* 使用格式：在方法声明时使用
*     修饰符 返回值类型 方法名(参数列表) throws AAAException,BBBException...{
*       throw new AAAException("异常产生的原因")
*       throw new BBBException("异常产生的原因")
* }
*
* 注意事项：
*        throws对象必须写在方法声明处
*        throws关键字后面声明的异常必须是Exception或者Exception的子类
*        方法内部如果抛出了多个异常对象，那么throws后面必须也声明多个异常
*        如果抛出的多个异常有子父类关系，那么直接声明父类异常即可
*        调用了一个声明抛出异常的方法，我们必须处理抛出的异常：要么继续使用throws声明抛出，交给方法的调用者处理
*             要么使用try...catch自己处理异常
* */

//FileNotFoundException extends IOException
public class Demo03throws {
    public static void main(String[] args) throws IOException {
        String str = "aaaaaa";
        /*readFile(str);
        readFile("d:\\a.txt");*/
        readFile("c:\\a.doc");
    }

    /*
    * 定义一个方法，对文件的路径进行合法性判断
    * 如果路径不是c:\\a.txt，那么我们就抛出找不到文件异常对象，告知方法的调用者
    * */
    public static void readFile(String fileName) throws IOException {
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("找不到文件");
        }
        /*
        * 如果路径没错，文件的后缀名不一样
        * 抛出IO异常
        * */
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件格式不对");
        }
        System.out.println("读取文件");
    }
}
