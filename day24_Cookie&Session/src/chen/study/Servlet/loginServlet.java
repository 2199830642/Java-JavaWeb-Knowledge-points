package chen.study.Servlet;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置request编码
        request.setCharacterEncoding("utf-8");
        //2.获取参数的map集合
        Map<String, String[]> map = request.getParameterMap();
        User loginUser = new User();
        try {
            BeanUtils.populate(loginUser, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //3.先获取生成的验证码
        HttpSession session = request.getSession();
        String checkCode_session = (String) session.getAttribute("checkCode_session");
        //生成一次性验证码，session获取到后立马删除其存储的验证码
        session.removeAttribute("checkCode_session");
        //4.判断验证码是否正确
        if (checkCode_session != null && checkCode_session.equalsIgnoreCase(loginUser.getCheckCode())) {
            //忽略大小写比较字符串,验证码一致
            //判断用户名和密码是否一致
            UserDao dao = new UserDao();
            User user = dao.login(loginUser);
            //判断user
            if (user == null) {
                //登录失败
                //存储提示信息到request
                request.setAttribute("login_error", "用户名或密码错误");
                //跳转到登录页面
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            } else {
                //登陆成功
                //存储用户信息
                session.setAttribute("user", user.getUsername());
                //重定向success.jsp
                response.sendRedirect(request.getContextPath() + "/success.jsp");
            }

        } else {
            //验证码不一致
            //存储提示信息到request
            request.setAttribute("cc_error", "验证码错误");
            //跳转到登录页面
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
