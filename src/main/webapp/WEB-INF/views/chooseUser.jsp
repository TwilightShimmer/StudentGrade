<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>选择角色</title>
</head>
<body>
<h1>选择您的角色</h1>
<form action="${pageContext.request.contextPath}/user/getAllStudentsInfo" method="get">
    <input type="submit" value="学生页面">
</form>
<form action="${pageContext.request.contextPath}/user/getAllTeachersInfo" method="get">
    <input type="submit" value="教师页面">
</form>
</body>
</html>
