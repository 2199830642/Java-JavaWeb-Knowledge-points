package chen.study.day11File类和IO流.缓冲流;
/*
    可以高效读写的流 ，是基于四种最基础的File流而创建
    相当于是给基础流穿上铠甲，进行强化

    缓冲流的基本原理：是在创建流对象时，会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数 从而提高读写效率
    字节缓冲流：
             BufferedInputStream 字节输入流
             BufferedOutputStream 字节输出流
    字符缓冲流：
             BufferedReader 字符输入流
             BufferedWriter 字符输出流
 */
public class Demo01Buffer {
}
