package chen.study.day11File类和IO流.序列化流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    java.io.ObjectInputStream extends InputStream
    ObjectInputStream:对象的反序列化流
    作用：
        把文件中保存的类对象，以流的方式取出来使用

    构造方法：
        ObjectInputStream(InputStream in)
        参数：
            传递一个字节输入流
    特有的成员方法：
        Object readObject();读取对象

    使用步骤：
        1.创建对象，构造方法中传入字节输入流
        2.使用readObject()读取对象
        3.释放资源
        4.使用一下读取的对象，打印看看

    注意：ClassNotFoundException，当不存在对象的class文件时抛出此异常
 */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("/Users/chen/Desktop/IO流的小栗子/person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
    }
}
