package chen.study.web.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 服务器输出字符数据到浏览器案例
 */
@WebServlet("/responseDemo03")
public class ResponseDemo03 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取流对象之前设置流对象的默认编码
        //这句话可以不用写 resp.setCharacterEncoding("utf-8");
        //告诉浏览器，服务器发出的消息体数据的编码，建议浏览器使用该编码解码
        resp.setHeader("content-type","text/html;charset=utf-8");

        //简单的形式设置编码
        resp.setContentType("text/html;charset=utf-8");

        //1.获取字符输出流
        PrintWriter pw = resp.getWriter();
        //2.输出数据
        pw.write("<h1>你好啊 response</h1>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
