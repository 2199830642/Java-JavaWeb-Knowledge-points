<%@ page import="java.util.List" %>
<%@ page import="chen.study.domain.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/7/29
  Time: 7:34 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<%
    List<User> list = new ArrayList<>();
    list.add(new User("张三",23,new Date()));
    list.add(new User("李四",21,new Date()));
    list.add(new User("王五",20,new Date()));
    request.setAttribute("list",list);
%>
<table border="1" width="500px" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>日期</th>
    </tr>
    <%--动态数据行--%>
    <c:forEach items="${requestScope.list}" var="user" varStatus="s">
        <c:if test="${s.count%2==0}">
            <tr bgcolor="#ffc0cb">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birstr}</td>
            </tr>
        </c:if>
        <c:if test="${s.count%2!=0}">
            <tr bgcolor="yellow">
                <td>${s.count}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.birstr}</td>
            </tr>
        </c:if>
    </c:forEach>
</table>
</body>
</html>
