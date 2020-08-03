package chen.study.web.day22Servlet和HTTP请求协议;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo02 implements Servlet {
    /**
     * 初始化方法
     * 在Servlet被创建时，执行这个方法，只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init.....");
    }

    /**
     * 获取ServletConfig对象
     * ServletConfig：Servlet的配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法
     * 每一次Servlet被访问时，会执行，会执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service...");
    }

    /**
     * 获取Servlet的一些信息：版本，作者等
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在Servlet被杀死时，执行，在服务器正常关闭时执行
     */
    @Override
    public void destroy() {
        System.out.println("destroy....");
    }
}
