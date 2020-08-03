package chen.study.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/sessionDemo03")
public class sessionDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取Session
        HttpSession session = request.getSession();
        System.out.println(session);
        //期望客户端关闭后，也能使获取的session相同
        Cookie c = new Cookie("JSESSIONID",session.getId());
        c.setMaxAge(60*60);//一个小时
        response.addCookie(c);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
