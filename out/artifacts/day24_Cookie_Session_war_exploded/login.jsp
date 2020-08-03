<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/7/24
  Time: 6:49 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script>
        window.onload = function () {
            var img = document.getElementById("img");
            img.onclick = function () {
                //加时间戳让图片缓存永不重复，欺骗服务器
                var date = new Date().getTime();
                img.src = "/day23_Response_war_exploded/check?" + date;
            }
        }
    </script>
    <style>
        div {
            color: red;
        }
    </style>
</head>
<body>
<form action="/day24_Cookie_Session_war_exploded/loginServlet" method="post">
    <table>
        <tr>
            <td>
                用户名
            </td>
            <td>
                <input type="text" name="username">
            </td>
        </tr>
        <tr>
            <td>
                密码
            </td>
            <td>
                <input type="password" name="password">
            </td>
        </tr>
        <tr>
            <td>
                验证码
            </td>
            <td>
                <input type="text" name="checkCode">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <img id="img" src="/day24_Cookie_Session_war_exploded/check">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</form>
<div>
    <%=request.getAttribute("cc_error") == null ? "":request.getAttribute("cc_error")%>
</div>
<div>
    <%=request.getAttribute("login_error") == null ? "":request.getAttribute("login_error")%>
</div>
</body>
</html>
