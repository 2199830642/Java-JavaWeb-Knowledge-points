package chen.study.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
    演示获取请求头数据:referer
 */
@WebServlet("/RequestDemo04")
public class RequestDemo04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referer = request.getHeader("referer");
        System.out.println(referer);//http://localhost:8080/day22_Servlet_HTTP_war_exploded/form.html

        //防盗链操作
        if (referer!=null){
            if (referer.contains("/day22")){
                //System.out.println("播放");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("播放电影...");
            }else {
                //System.out.println("想看电影吗，来正规页面");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("想看电影吗，来优酷吧");
            }
        }
    }
}
