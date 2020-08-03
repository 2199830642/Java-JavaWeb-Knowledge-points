<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/7/23
  Time: 8:21 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>访问时间</title>
</head>
<body>
<%
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
                value= URLDecoder.decode(value,"utf-8");
                out.write("<h1>宝贝欢迎回来，您上次的访问时间为:" + value + "</h1>");
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
        out.write("<h1>您好，欢迎您首次访问</h1>");
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String str_date = sdf.format(date);
        //使用URL编码
        str_date= URLEncoder.encode(str_date, "utf-8");
        //第一次访问
        Cookie cookie = new Cookie("lastTime", str_date);
        //设置其生命周期
        cookie.setMaxAge(10);//一个月
        response.addCookie(cookie);
    }
%>

</body>
</html>
