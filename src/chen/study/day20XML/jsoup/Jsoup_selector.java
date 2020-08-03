package chen.study.day20XML.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Jsoup_selector {
    public static void main(String[] args) throws IOException, URISyntaxException {
        //获取xml文件
        String path = Jsoup_selector.class.getClassLoader().getResource("users.xml").toURI().getPath();
        //获取Document对象
        Document docu = Jsoup.parse(new File(path), "utf-8");
        //查询name标签
        Elements name = docu.select("name");
        System.out.println(name);
        System.out.println("-------------------");
        //查询属性
        Elements select = docu.select("#1");
        System.out.println(select);
    }
}
