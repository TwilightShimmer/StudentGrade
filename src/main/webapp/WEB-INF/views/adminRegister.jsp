<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员注册</title>
</head>
<body>
<h2>管理员注册</h2>
<form action="${pageContext.request.contextPath}/admin/register" method="post">
    管理员姓名: <label>
    <input type="text" name="adminName" required>
</label><br>
    密码: <label>
    <input type="password" name="password" required>
</label><br>
    <input type="submit" value="注册">
<%--    <span style="color:red">${error}</span>--%>
</form>
<a href="${pageContext.request.contextPath}/admin/login">已有账号？登录</a>
</body>
</html>