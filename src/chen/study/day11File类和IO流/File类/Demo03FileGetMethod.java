package chen.study.day11File类和IO流.File类;

import java.io.File;

/*
   File获取功能的方法：
                  1.public String getAbsolutePath();返回此file的绝对路径名字符串
                  2.public String getPath();将此file转换为路径名字符串
                  3.public String getName();返回由此file表示的文件或目录的名称
                  4.public Long length();返回此文件大小
 */
public class Demo03FileGetMethod {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

    //4.public Long length();返回此文件大小
    //获取构造方法指向的文件大小,如果文件不存在返回0
    private static void show04() {
        File f1 = new File("/Users/chen/Desktop/1.jpeg");
        System.out.println(f1.length());//74010
    }

    //3.public String getName();返回由此file表示的文件或目录的名称
    //传递的就是构造方法中路径的结尾部分(文件/文件夹)
    private static void show03() {
        File f1 = new File("/Users/chen/a.txt");
        System.out.println(f1.getName());//a.txt
    }

    //2.public String getPath();将此file转换为路径名字符串
    private static void show02() {
        File f1 = new File("/Users/chen/a.txt");
        System.out.println(f1.getPath());//  /Users/chen/a.txt
        File f2 = new File("a.txt");
        System.out.println(f2.getPath());// a.txt
    }

    /*
       1.public String getAbsolutePath();返回此file的绝对路径名字符串
       获取的构造方法中传递的路径
       无论路径是绝对的还是相对的，返回的都是绝对路径
     */
    private static void show01() {
        File f1 = new File("/Users/chen/a.txt");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);//  /Users/chen/a.txt

        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);//  /Users/chen/Desktop/IdeaProjects/a.txt
    }
}
