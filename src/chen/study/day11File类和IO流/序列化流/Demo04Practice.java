package chen.study.day11File类和IO流.序列化流;

import java.io.*;
import java.util.ArrayList;

/*
    练习：序列化集合
        当我们想在文件中保存多个文件对象的时候，我们可以吧多个对象存储在集合中
        然后对集合进行序列化和反序列化
 */
public class Demo04Practice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建集合存储对象
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王五",20));
        //创建序列化流
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("/Users/chen/Desktop/IO流的小栗子/Person.txt")
        );
        //给文件中写入对象
        oos.writeObject(list);

        //创建反序列化流
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("/Users/chen/Desktop/IO流的小栗子/Person.txt")
        );
        //读取集合
        Object o = ois.readObject();
        //读取出的集合返回值是object类型 需要强转
        ArrayList<Person> list1 = (ArrayList<Person>)o;
        //对读取的集合进行遍历
        for (Person p : list1) {
            System.out.println(p);
        }
    }
}
