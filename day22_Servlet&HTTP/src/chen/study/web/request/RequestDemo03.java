package chen.study.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
    演示获取请求头数据:user-agent
 */
@WebServlet("/RequestDemo03")
public class RequestDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String agent = request.getHeader("user-agent");
        //判断使用的浏览器版本
        if(agent.contains("Chrome")){
            //谷歌
            System.out.println("这是谷歌浏览器");
        }else if (agent.contains("FireFox")){
            //火狐
            System.out.println("这是火狐浏览器");
        }
    }
}
