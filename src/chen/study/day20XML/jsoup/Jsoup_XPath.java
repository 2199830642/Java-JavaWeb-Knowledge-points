package chen.study.day20XML.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Jsoup_XPath {
    public static void main(String[] args) throws IOException, URISyntaxException, XpathSyntaxErrorException {
        //获取xml文件
        String path = Jsoup_XPath.class.getClassLoader().getResource("users.xml").toURI().getPath();
        //获取Document对象
        Document docu = Jsoup.parse(new File(path), "utf-8");
        //根据document对象创建单独的JXDocument对象
        JXDocument jxDocument = new JXDocument(docu);
        //结合XPath的语法来查询

        //查询所有的user标签
        List<JXNode> jxNodes1 = jxDocument.selN("//user");
        for (JXNode jxNode : jxNodes1) {
            System.out.println(jxNode);
        }
        System.out.println("----------------------");
        //查询所有user标签下的name标签
        List<JXNode> jxNodes2 = jxDocument.selN("//user/name");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
        }
    }
}
