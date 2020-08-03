package chen.study.day20XML.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/*
    Jsoup快速入门
 */
public class Demo01Jsoup {
    public static void main(String[] args) throws IOException, URISyntaxException {
        //获取Document对象，根据XML文档来获取
        //获取student.xml的路径
        String path = Demo01Jsoup.class.getClassLoader().getResource("student.xml").toURI().getPath();
        //解析xml文档，加载文档进内存，获取dom树
        Document document = Jsoup.parse(new File(path), "utf-8");
        //获取元素对象
        Elements name = document.getElementsByTag("name");
        System.out.println(name.size());//2
        //获取第一个name的Element对象
        Element element = name.get(0);
        //获取数据
        String na = element.text();
        System.out.println(na);//张三
    }
}
