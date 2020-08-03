<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/7/29
  Time: 7:18 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>foreach标签</title>
</head>
<body>
        <%--
        foreach相当于for循环
            1.完成重复的操作
                属性：
                    begin：开始值
                    end：结束值
                    var：临时变量
                    step：步长
                    varStatus:循环状态对象
                           如：varStatus="s"   ${s.index}:元素的索引从0开始
                                               ${s.count}:代表循环次数从1开始
            2.遍历
                属性：
                    items：容器对象
                    var：元素临时变量
                    varStatus:循环状态对象
                           如：varStatus="s"   ${s.index}:元素的索引从0开始
                                               ${s.count}:代表循环次数从1开始

        --%>
</body>
<c:forEach begin="0" end="10" var="i" step="1">
    ${i}<br>
</c:forEach>
<hr>
<%
    List list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    request.setAttribute("list",list);
%>
<c:forEach items="${requestScope.list}" var="str" varStatus="s">
    ${s.index}${s.count}${str}
</c:forEach>
</html>
