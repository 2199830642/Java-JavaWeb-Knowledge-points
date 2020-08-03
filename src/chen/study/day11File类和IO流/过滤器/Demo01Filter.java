package chen.study.day11File类和IO流.过滤器;

import java.io.File;
import java.io.FilenameFilter;

/*
   文件搜索
   搜索LeetCode算法集合文件夹里的java文件
   我们可以使用过滤器来实现
   在File类中有两个和listFiles重载的方法，方法的参数传递的就是过滤器
   File[] listFiles(FileFilter filter)
        java.io.FileFilter接口：用于抽象路径名(file 对象)的过滤器
        作用：用来过滤文件(File 对象)
        抽象方法：用来过滤文件的方法
            boolean accept(File pathname)
            参数：就是我们listFiles方法遍历目录得到的每一个文件对象

   File[] listFiles(FilenameFilter filter)
        java.io.FilenameFilter接口
        作用：用于过滤文件名称
        抽象方法：
            boolean accept(File dir,String name)
            参数：dir：构造方法中传递的被遍历的目录
                 name：使用listFiles方法遍历目录获取的每一个文件/文件夹的名称

   注意：
        两个过滤器接口是没有实现类的，需要自己定义实现类，重写accept方法，在方法中自己定义过滤的规则
 */
public class Demo01Filter {
    public static void main(String[] args) {
        File file = new File("/Users/chen/Desktop/LeetCode算法集合");
        printDir(file);
    }

    public static void printDir(File dir) {
        //使用FileFilter  传递过滤器对象
        /*File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //如果pathname是一个文件夹，也得让其返回true，然后遍历，继续判断
                if (pathname.isDirectory()){
                    return true;
                }
                return pathname.getName().toLowerCase().endsWith(".java");
            }
        });*/

        //使用FilenameFilter 传递过滤器对象
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
            }
        });

        for (File file : files) {
            if (file.isDirectory()) {
                printDir(file);
            } else {
                System.out.println(file);
            }
        }
    }
}