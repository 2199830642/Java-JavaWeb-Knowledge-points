package chen.study.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
    演示request对象获取请求行数据
 */
@WebServlet("/RequestDemo01")
public class RequestDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
                        1.获取请求方式：GET
                            String getMethod()
                        2.获取虚拟目录：/day22_Servlet_HTTP_war_exploded             重点掌握
                            String getContextPath()
                        3.获取Servlet的路径：/RequestDemo01
                            String getServletPath()
                        4.获取get方式的请求参数：name=zhangsan
                            String getQueryString()
                        5.获取请求的URI：/day14/demo1        重点掌握
                            String getRequestURI()  /day22_Servlet_HTTP_war_exploded/RequestDemo01
                            StringBuffer getRequestURL() http://localhost:8080/day22_Servlet_HTTP_war_exploded/RequestDemo01
                        6.获取协议及版本
                            String getProtocol()    HTTP/1.1
                        7.获取客户机的IP地址
                            String getRemoteAddr()
         */
        //1.获取请求方式：GET
        String method = request.getMethod();
        System.out.println(method);
        //获取虚拟目录
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        //获取Servlet路径
        String servletPath = request.getServletPath();
        System.out.println(servletPath);
        //以get的方法请求参数
        String queryString = request.getQueryString();
        System.out.println(queryString);
        //获取请求的URI
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestURL);
        //获取协议及版本号
        String protocol = request.getProtocol();
        System.out.println(protocol);
        //获取客户机IP地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
