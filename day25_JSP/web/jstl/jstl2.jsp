<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/7/29
  Time: 6:37 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>choose标签</title>
</head>
<body>
      <%--
      完成数字编号对应星期几案例
        1.域中存储一数字
        2.使用choose标签取出数字        相当于switch的声明
        3.使用when标签做数字的判断       相当于case
        4.otherwise标签做一个其他情况的声明，相当于default
      --%>
    <%
        request.setAttribute("number",5);
    %>

    <c:choose>
            <c:when test="${requestScope.number==1}">
                星期一
            </c:when>
        <c:when test="${requestScope.number==2}">
            星期二
        </c:when>
        <c:when test="${requestScope.number==3}">
            星期三
        </c:when>
        <c:when test="${requestScope.number==4}">
            星期四
        </c:when>
        <c:when test="${requestScope.number==5}">
            星期五
        </c:when>
        <c:when test="${requestScope.number==6}">
            星期六
        </c:when>
        <c:when test="${requestScope.number==7}">
            星期天
        </c:when>
        <c:otherwise>数字输入有误</c:otherwise>
    </c:choose>
</body>
</html>
