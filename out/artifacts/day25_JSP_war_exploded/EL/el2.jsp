<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/7/28
  Time: 8:11 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
        //在域中存储数据
        request.setAttribute("name","张三");
        session.setAttribute("name","李四");
        %>

        ${requestScope.name}
        ${sessionScope.name}
</body>
</html>
