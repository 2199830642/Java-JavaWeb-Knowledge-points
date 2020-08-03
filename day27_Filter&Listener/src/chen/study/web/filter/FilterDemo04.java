package chen.study.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(value="/*",dispatcherTypes = DispatcherType.REQUEST)//浏览器直接请求资源时，该过滤器会被执行
//@WebFilter(value="/index.jsp",dispatcherTypes = DispatcherType.FORWARD)//只有转发访问该资源时，该过滤器会被执行
//@WebFilter(value="/*",dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST})
//转发或直接访问，该过滤器都会被执行
public class FilterDemo04 implements Filter {

    public void destroy() {

    }


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilterDemo04...");
        chain.doFilter(req, resp);
    }


    public void init(FilterConfig config) throws ServletException {
    }

}
