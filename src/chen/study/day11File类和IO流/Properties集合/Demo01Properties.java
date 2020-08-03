package chen.study.day11File类和IO流.Properties集合;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties extends Hashtable<k,v> implements Map<k,v>
    所以其也是一个双列集合
    Properties类表示了一个持久的属性集，Properties可保存在流中或从流中加载
    Properties集合是唯一一个与IO流相结合的集合
        可以使用Properties集合中的store方法，把集合中的临时数据持久化写入到硬盘中存储
            void store(OutputStream out , String comments)字节输出流
            void store(Write write , String comments)字符输出流
            参数：
                OutputStream out  不能写中文
                Write write    可以写中文
                String comments：注释，用来解释说明保存的文件是用来做什么的
                                   不能使用中文 ，因为会产生乱码 ， 一般使用""空字符串
            使用步骤：
                    1.创建Properties集合对象，添加数据
                    2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
                    3.使用Properties集合中的方法store写入数据
                    4.释放资源



    属性列表中每一个键及其对应值都是一个字符串
        Properties集合是一个双列集合，key和value都默认是字符串，意思不用写泛型了
 */
public class Demo01Properties {
    public static void main(String[] args) {
        show01();
    }

    /*
        使用Properties集合存储数据，并且遍历取出集合中存储的数据
        Properties集合有一些操作字符串的特有方法
            Object setProperty（String key, String value）;调用了map集合中的put方法
            Object getProperty（String key）;通过指定的键获取对应的属性，此方法相当于mao集合中的get方法

            用来遍历的方法
            Set(String) stringPropertyNames();返回属性列表的键集，其中该键与其对应值是字符串
     */
    private static void show01() {
        //创建Properties集合对象
        Properties prop = new Properties();
        //使用setProperty往集合中添加一些数据
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "170");
        prop.setProperty("杨幂", "172");

        //遍历集合
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            //获取对应属性值
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }

        //2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
        try {
            FileWriter fw = new FileWriter("/Users/chen/Desktop/a.txt");
            prop.store(fw, "save data");
        }catch(IOException e){
            System.out.println(e);
        }

    }
}
