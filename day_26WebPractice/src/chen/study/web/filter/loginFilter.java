package chen.study.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 登录验证的过滤器
 */
@WebFilter("/*")
public class loginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //1.强制转换
        HttpServletRequest request = (HttpServletRequest) req;
        //2.获取资源的请求路径
        String uri = request.getRequestURI();
        //3.判断是否包含登录相关资源路径,要注意排除css/js/图片/验证码等资源
        if (uri.contains("/login.jsp")||uri.contains("/loginServlet")||uri.contains("/css/")||uri.contains("/js/")||uri.contains("/fonts/")||uri.contains("/checkCode")){
            //包含，证明用户就是想登录
            //放行
            chain.doFilter(req,resp);
        }else {
            //不包含
            //验证用户是否已经登录
            //4.从session中获取user
            Object user = request.getSession().getAttribute("user");
            //user不为空，放行
            if (user!=null){
                chain.doFilter(req,resp);
            }else{
                //没有登录，跳转页面
                request.setAttribute("login_msg","您尚未登录，请登录");
                request.getRequestDispatcher("/login.jsp").forward(req,resp);
            }
        }


        //chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
