package chen.study.web.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 完成重定向
 */
@WebServlet("/responseDemo01")
public class ResponseDemo01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //访问/responseDemo01,会自动跳转到/responseDemo02
        System.out.println("Demo01被访问了");
        /*//1.设置状态码为302
        resp.setStatus(302);
        //2.设置响应头
        resp.setHeader("location","/day23_Response_war_exploded/responseDemo02");*/

        //简单的重定向方法
        resp.sendRedirect("/day23_Response_war_exploded/responseDemo02");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
