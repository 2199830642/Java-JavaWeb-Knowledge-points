<%@ page import="chen.study.domain.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/7/28
  Time: 8:24 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取数据</title>
</head>
<body>
        <%
            User user = new User();
            user.setName("张三");
            user.setAge(23);
            user.setBirthday(new Date());

            request.setAttribute("user",user);
        %>
<h3>获取对象中的值</h3>
${requestScope.user}<!-- chen.study.domain.User@13d62efc 地址值 -->
<%--
    获取里面的数据 通过对象的属性获取
        set或get方法，去掉set或get，将剩余本分首字母变小写
        setName-->name
    --%>
${requestScope.user.name}//张三
</body>
</html>
