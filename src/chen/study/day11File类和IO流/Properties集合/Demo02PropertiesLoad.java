package chen.study.day11File类和IO流.Properties集合;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
    可以使用Properties集合中的load方法，把硬盘中保存的文件（键值对）读取到集合中使用
            void load(InputStream inStream)读取字节流
            void load(Reader read)读取字符流
            参数：
                InputStream inStream字节输入流，不能读取含有中文的键值对
                Reader read字符输入流，可以读取中文的键值对
            使用步骤：
                   1.创建Properties集合对象，添加数据
                   2.使用Properties集合中的方法load读取保存键值对的文件
                   3.释放资源
             注意：
                1.存储键值对的文件中，键值对的连接符号可以使用=或者空格
                2.存储键值对的文件中，可以使用#进行注释，被注释的文件不会再被读取
                3.存储键值对的文件中，键与值默认都是字符串，不用填加引号
 */
public class Demo02PropertiesLoad {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("/Users/chen/Desktop/a.txt"));
        //遍历一下集合看是否都存储
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "====" + value);
        }
    }
}
