package chen.study.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class FilterDemo02 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //对request对象的请求消息进行增强
        System.out.println("filterDemo02执行了");

        //放行
        chain.doFilter(req, resp);
        //对response对象的响应消息进行增强
        System.out.println("filterDemo02回来了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
