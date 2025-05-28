<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>选择角色 - 在线考试系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
</head>
<body>

<div class="container">
    <h1 class="welcome">欢迎使用在线考试系统！</h1>
    <h2 class="subtitle">请选择您的角色</h2>

    <table class="role-table">
        <tr>
            <td>
                <form action="${pageContext.request.contextPath}/admin/login" method="get">
                    <input class="btn admin-login" type="submit" value="管理员登录">
                </form>
            </td>
            <td>
                <form action="${pageContext.request.contextPath}/admin/register" method="get">
                    <input class="btn admin-register" type="submit" value="管理员注册">
                </form>
            </td>
        </tr>
        <tr>
            <td>
                <form action="${pageContext.request.contextPath}/student/login" method="get">
                    <input class="btn student-login" type="submit" value="学生登录">
                </form>
            </td>
            <td>
                <form action="${pageContext.request.contextPath}/student/register" method="get">
                    <input class="btn student-register" type="submit" value="学生注册">
                </form>
            </td>
        </tr>
    </table>
</div>

</body>
</html>