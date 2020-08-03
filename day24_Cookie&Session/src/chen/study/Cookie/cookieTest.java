package chen.study.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Cookie案例：记住上一次的访问时间
            需求：
                1.访问一个servlet，如果是第一次访问，则提示"您好，欢迎您首次访问"
                2.如果不是第一次访问，则提示，欢迎回来，您上次的访问时间为：xxx

            分析：
                1.可以采用cookie来完成
                2.在服务器中的servlet中来判断，是否有一个名为lastTime的cookie
                    有：不是第一次访问
                        1.响应数据：欢迎回来，您上次的访问时间为：xxx
                        2.写回cookie：lastTime=2020年07月23日18:02:50
                    没有：是第一次访问
                        1.响应数据"您好，欢迎您首次访问"
                        2.写回cookie：lastTime=2020年07月23日18:02:50
 */

@WebServlet("/cookieTest")
public class cookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应消息体数据的编码
        response.setContentType("text/html;charset=utf-8");

        Cookie[] cookies = request.getCookies();
        boolean flag = false;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                //获取cookie的名称
                String name = cookie.getName();
                if ("lastTime".equals(name)) {
                    //证明不是第一次访问

                    //设置flag为false
                    flag = true;

                    //响应数据，获取cookie的value
                    String value = cookie.getValue();
                    //使用URL解码
                    value=URLDecoder.decode(value,"utf-8");
                    response.getWriter().write("<h1>宝贝欢迎回来，您上次的访问时间为:" + value + "</h1>");
                    //获取当前时间的字符串。重新设置lastTime的值，并重新发送cookie
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = sdf.format(date);
                    //使用URL编码,然后存储，不然空格会报错
                    str_date = URLEncoder.encode(str_date, "utf-8");
                    cookie.setValue(str_date);
                    //设置cookie的存活时间
                    cookie.setMaxAge(10);//一个月

                    response.addCookie(cookie);
                    break;
                }
            }
        }
        if (cookies == null || cookies.length == 0 || flag == false) {
            response.getWriter().write("<h1>您好，欢迎您首次访问</h1>");
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
            String str_date = sdf.format(date);
            //使用URL编码
            str_date= URLEncoder.encode(str_date, "utf-8");
            //第一次访问
            Cookie cookie = new Cookie("lastTime", str_date);
            //设置其生命周期
            cookie.setMaxAge(60 * 60 * 24 * 30);//一个月
            response.addCookie(cookie);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
