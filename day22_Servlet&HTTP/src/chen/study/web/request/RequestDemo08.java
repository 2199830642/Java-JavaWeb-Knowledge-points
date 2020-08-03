package chen.study.web.request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
   解决获取请求参数中的中文乱码问题
 */
@WebServlet("/RequestDemo08")
public class RequestDemo08 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Demo8被访问了");
        //转发到demo9资源
        /*RequestDispatcher requestDispatcher = request.getRequestDispatcher("/RequestDemo09");
        requestDispatcher.forward(request,response);*/

        //存储数据到request域中
        request.setAttribute("wmh","520");
        //转发
        request.getRequestDispatcher("/RequestDemo09").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get 获取请求参数
        this.doPost(request,response);
    }
}
