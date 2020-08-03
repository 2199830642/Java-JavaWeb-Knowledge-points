<%@ page import="org.w3c.dom.stylesheets.LinkStyle" %>
<%@ page import="java.awt.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Collections" %><%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/7/29
  Time: 6:22 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if标签</title>
</head>
<body>
<%--
c:if标签
    必须的属性 test ：接收boolean表达式
        如果表达式为true，则显示if标签体内容
        反之不显示
        一般情况下，test属性值会结合el表达式一起使用
    注意：c:if标签没有else情况，想要else选项，可以再定义一个c:if标签
--%>
<c:if test="true">
    <h1>我。。。</h1>
</c:if>

<%
    //判断request域中list集合是否为空，如果不为空，则遍历
    List<String> list = new ArrayList<>();
    Collections.addAll(list, "aaaa", "bbbb", "cccc");
    request.setAttribute("list", list);
    request.setAttribute("number", 3);
%>
<c:if test="${not empty list}">
    <h3>遍历集合。。。</h3>
</c:if>

<c:if test="${requestScope.number % 2 == 0}">
    ${requestScope.number}为偶数
</c:if>

</body>
</html>
