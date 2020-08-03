package chen.study.day11File类和IO流.序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    java.io.ObjectOutputStream extends OutputStream
    ObjectOutputStream:对象的序列化流
    作用：
        把对象以流的方式写入文件中保存
    构造方法：
        ObjectOutputStream(OutputStream out)
        参数：
            传递一个字节输出流
    特有的成员方法：
        void writeObject(Object obj),将指定的对象写入ObjectOutputStream

    使用步骤：
        1.创建对象，构造方法中传递字节输出流
        2.使用writeObject方法把对象写入
        3.释放资源

    注意：
        写入文件的类必须实现Serializable接口，不然会抛出未序列化异常
 */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("/Users/chen/Desktop/IO流的小栗子/person.txt"));
        Person p = new Person("小陈",20);
        oos.writeObject(p);
        oos.close();
    }
}
