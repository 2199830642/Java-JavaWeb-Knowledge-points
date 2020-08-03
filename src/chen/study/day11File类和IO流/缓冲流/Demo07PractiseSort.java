package chen.study.day11File类和IO流.缓冲流;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
     要求：对无序文本文件进行排序
     按照（1，2，3）顺序排序

     步骤
     1.创建字符缓冲输入流对象，构造方法传入匿名字符输入流对象
     2.创建字符缓冲输出流对象，构造方法传入匿名字符输出流对象
     3.创建一个HashMap集合，key：存储每行的序号；value：存储每行的文本
     4.使用字符输入缓冲流的readLine方法对文本进行读取
     5.对读取到的文本进行切割，获取每行的行号和内容
     6.把切割好的文本序号和内容存入HashMap集合中(key的序号是有序的，会自动排序)
     7.遍历HashMap集合获取每一个键值对
     8.把每一个键值对拼接成一个文本行
     9.把拼接好的文本行用字符缓冲输出流的write方法写入目标文件
     10.释放资源
 */
public class Demo07PractiseSort {
    public static void main(String[] args) throws IOException {
        //1.创建字符缓冲输入流对象，构造方法传入匿名字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("/Users/chen/Desktop/IO流的小栗子/a.txt"));
        //2.创建字符缓冲输出流对象，构造方法传入匿名字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/chen/Desktop/IO流的小栗子/c.txt"));
        //3.创建一个HashMap集合，key：存储每行的序号；value：存储每行的文本
        HashMap<String, String> hm = new HashMap<>();
        //4.使用字符输入缓冲流的readLine方法对文本进行读取
        String line;
        while ((line = br.readLine()) != null) {
            //5.对读取到的文本进行切割，获取每行的行号和内容
            String[] split = line.split("\\.");
            //6.把切割好的文本序号和内容存入HashMap集合中(key的序号是有序的，会自动排序)
            hm.put(split[0],split[1]);
        }

        //7.遍历HashMap集合获取每一个键值对
        Set<Map.Entry<String, String>> e = hm.entrySet();
        for (Map.Entry<String, String> entry : e) {
            //8.把每一个键值对拼接成一个文本行
            line = entry.getKey()+"."+entry.getValue();
            //9.把拼接好的文本行用字符缓冲输出流的write方法写入目标文件
            bw.write(line);
            bw.newLine();
        }
        //10.释放资源
        br.close();
        bw.close();
    }
}
