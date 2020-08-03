package chen.study.day11File类和IO流.File类;

import java.io.File;

/*
   File类遍历文件夹(目录)的功能：
                   1.public String[] list();返回一个String数组，表示该File目录中的所有子文件或目录
                   2.public File[] listFiles();返回一个file数组，表示该File目录中的所有子文件或目录
    注意：
       如果构造方法中给出的目录路径不存在，抛出空指针异常
       如果给出的路径不是目录/文件夹，也会抛出空指针异常
 */
public class Demo06FileBianli {
    public static void main(String[] args) {
        show01();
        show02();
    }

    //2.public File[] listFiles();返回一个file数组，表示该File目录中的所有子文件或目录
    //文件夹里每个文件路径都可以打印出来
    private static void show02() {
        File f1 = new File("/Users/chen/Desktop/LeetCode算法集合");
        File[] files = f1.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
        /*结果：
        /Users/chen/Desktop/LeetCode算法集合/out
        /Users/chen/Desktop/LeetCode算法集合/LeetCode算法集合.iml
        /Users/chen/Desktop/LeetCode算法集合/.idea
        /Users/chen/Desktop/LeetCode算法集合/src*/
    }

    //1.public String[] list();返回一个String数组，表示该File目录中的所有子文件或目录
    private static void show01() {
        File f1 = new File("/Users/chen/Desktop/IdeaProjects");
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("===========================");
        /*结果：
        .DS_Store
        out
        IdeaProjects.iml
        untitled
        Java学习笔记.iml
        .idea
        src*/
    }
}
