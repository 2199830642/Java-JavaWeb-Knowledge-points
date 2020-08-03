package chen.study.day11File类和IO流.File类;

import java.io.File;

/*
   File判断功能的方法：
                    1.public boolean exists();判断文件或目录是否存在
                    2.public boolean isFile();判断是否为文件
                    3.public boolean isDirectory();判断是否为文件夹/目录
 */
public class Demo04JudgeMethod {
    public static void main(String[] args) {
        File f1 = new File("/Users/chen/a.txt");
        File f2 = new File("/Users/chen");
        //1.public boolean exists();判断文件或目录是否存在
        System.out.println(f1.exists());//false
        System.out.println(f2.exists());//true

        //2.public boolean isFile();判断是否为文件 如果是则为true，如果不是则为fou
        System.out.println(f1.isFile());//因为文件不存在，所以为false
        File f3 = new File("/Users/chen/Desktop/1.jpeg");
        System.out.println(f3.isFile());//true

        //3.public boolean isDirectory();判断是否为文件夹/目录
        System.out.println(f2.isDirectory());//true
    }
}
