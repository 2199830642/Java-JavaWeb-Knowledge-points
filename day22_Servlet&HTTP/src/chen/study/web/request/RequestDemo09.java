package chen.study.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
   解决获取请求参数中的中文乱码问题
 */
@WebServlet("/RequestDemo09")
public class RequestDemo09 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取数据
        Object wmh = request.getAttribute("wmh");
        System.out.println(wmh);
        System.out.println("demo9也被访问了。。。。。。。。");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get 获取请求参数
        this.doPost(request,response);
    }
}
