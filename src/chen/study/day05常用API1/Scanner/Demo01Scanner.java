package chen.study.day05常用API1.Scanner;
import java.util.*;
/*
* Scanner类的功能：可以实现键盘输入数据到程序当中
*
* 引用类型的一般使用步骤：
* 1.导包：import 包路径.类名称;只有java.lang包下的内容不需要导包
* 2.创建： 类名称 对象名 = new 类名称（参数）；
* 3.使用：对象名.成员方法名
* */
public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//System.in代表从键盘开始输入
        int num = sc.nextInt();
        System.out.println("输入的数字是"+num);
        String str = sc.next();
        System.out.println("输入的字符串是"+str);
    }
}
