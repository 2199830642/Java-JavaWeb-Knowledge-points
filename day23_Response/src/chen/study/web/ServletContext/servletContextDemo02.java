package chen.study.web.ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 获取MIME类型
 */
@WebServlet("/servletContextDemo02")
public class servletContextDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过HttpServlet先获取ServletContext对象
        ServletContext context = this.getServletContext();
        //定义文件名称
        String filename = "a.jpg";
        //获取MIME类型
        String mimeType = context.getMimeType(filename);
        System.out.println(mimeType);// image/jpeg
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
