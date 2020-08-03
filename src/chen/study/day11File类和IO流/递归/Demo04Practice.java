package chen.study.day11File类和IO流.递归;

import java.io.File;

/*
   文件搜索
   搜索LeetCode算法集合文件夹里的java文件
 */
public class Demo04Practice {
    public static void main(String[] args) {
        File file = new File("/Users/chen/Desktop/LeetCode算法集合");
        printJava(file);
    }
    public static void printJava(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isDirectory()){
                //递归调用
                printJava(f);
            }else{
                //输出只要java的文件
                //把File对象转换为String对象，再用String类的endWith方法判断
                //1.String name = f.getName();
                //2.String path = f.getPath();  这几种方法都可行
                if(f.toString().toLowerCase().endsWith(".java")){
                    System.out.println(f);
                }
            }
        }
    }
}
