package chen.study.web.Servlet;

import chen.study.dao.UserDao;
import chen.study.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码
        req.setCharacterEncoding("utf-8");
        /*//获取请求参数方法1
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //封装User对象
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);*/
        
        //直接获取所有请求参数方法2
        Map<String, String[]> map = req.getParameterMap();
        //创建一个User对象
        User loginUser = new User();
        //使用beanUtils封装
        try {
            BeanUtils.populate(loginUser,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //调用UserDao的方法
        UserDao dao = new UserDao();
        User user = dao.login(loginUser);
        //判断user
        if (user == null) {
            //登录失败
            req.getRequestDispatcher("/FailServlet").forward(req, resp);
        } else {
            //登陆成功
            //存储数据
            req.setAttribute("user", user);
            //转发
            req.getRequestDispatcher("/SuccessServlet").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
