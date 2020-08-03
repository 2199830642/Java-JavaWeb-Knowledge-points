package chen.study.web.Servlet;

import chen.study.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取request域中共享的user对象
        User user = (User) request.getAttribute("user");
        System.out.println("跳转过来啦");
        System.out.println(user.getUsername());
        if (user!=null) {
            //给页面设置编码
            response.setContentType("text/html;charset=utf-8");
            //输出到页面上
            response.getWriter().write("登陆成功！" + user.getUsername() + "欢迎您");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
