package chen.study.day11File类和IO流.File类;

import java.io.File;

/*
    File类创建删除的方法：
                     1.public boolean createNewFile();当且仅当该文件不存在时，创建一个新的空文件
                     2.public boolean delete();删除由此file表示的文件或目录
                     3.public boolean mkdir();创建一个单级文件夹
                     4.Public boolean mkdirs();创建一个多级文件夹
*/
public class Demo05DeleteMethod {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    /*
    3.public boolean mkdir();创建一个单级文件夹
    4.Public boolean mkdirs();即可以创建单级文件夹，也可以创建多级文件夹
     */
    private static void show02() {
        File f1 = new File("/Users/chen/Desktop/a");
        boolean mkdir = f1.mkdir();
        System.out.println(mkdir);
        f1.delete();

        File f2 = new File("/Users/chen/Desktop/b/a/a");
        boolean mkdirs = f2.mkdirs();
        System.out.println(mkdirs);
        f1.delete();//如果文件夹有内容是不会删除的，必须一层一层删除
    }



    /*1.public boolean createNewFile();当且仅当该文件不存在时，创建一个新的空文件
    创建文件的路径和名称在构造方法中给出（构造方法的参数）
    2.public boolean delete();删除由此file表示的文件或目录

    private static void show01() {
        File f1 = new File("/Users/chen/Desktop/a.txt");
        boolean newFile = false;
        try {
            newFile = f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("创建是否成功："+newFile);
        f1.delete();

        File f2 = new File("b.txt");
        System.out.println(f2.getAbsolutePath());
        boolean newFile1 = false;
        try {
            newFile1 = f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("创建是否成功："+newFile1);
        f2.delete();
    }*/
}
