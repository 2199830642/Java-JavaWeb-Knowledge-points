package chen.study.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class FilterDemo03 implements Filter {
    /**
     * 在服务器关闭后，filter对象被销毁，如果服务器正常关闭，则会调用这个方法，用于释放资源
     */
    public void destroy() {
        System.out.println("destroy...");
    }

    /**
     * 每一次请求拦截时，会执行，会执行多次
     * @param req
     * @param resp
     * @param chain
     * @throws ServletException
     * @throws IOException
     */
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter...");
        chain.doFilter(req, resp);
    }

    /**
     * 在服务器启动后会创建filter对象然后调用init方法，用于加载资源
     * @param config
     * @throws ServletException
     */
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init...");
    }

}
