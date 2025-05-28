<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生注册</title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<body>
<h2>学生注册</h2>
<form action="${pageContext.request.contextPath}/student/register" method="post">
    学生姓名: <label>
    <input type="text" name="studentName" required>
</label><br>
    班级ID: <label>
    <input type="number" name="classId">
</label><br>
    密码: <label>
    <input type="password" name="password" required>
</label><br>
    <input type="submit" value="注册">
<%--    <span style="color:red">${error}</span>--%>
</form>
<a href="${pageContext.request.contextPath}/student/login">已有账号？登录</a>
</body>
</html>