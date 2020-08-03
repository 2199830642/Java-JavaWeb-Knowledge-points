package chen.study.day11File类和IO流.递归;

import java.io.File;

/*
    递归打印多级目录
    遍历输出文件夹中所有内容，发现一次遍历只能输出文件和文件夹的名字，输出不了文件夹的内容
    所以增加判断语句，遍历发现如果是文件夹，则递归调用本身的方法
 */
public class Demo03printDirectory {
    public static void main(String[] args) {
        File file = new File("/Users/chen/Desktop/LeetCode算法集合");
        printDir(file);
    }

    public static void printDir(File dir){
        System.out.println(dir);//打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                printDir(file);
            }
            System.out.println(file);
        }
    }
}
