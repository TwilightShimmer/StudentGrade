<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改学生信息</title>
</head>
<body>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<h2>修改学生信息</h2>

<form action="${pageContext.request.contextPath}/user/update" method="post">
    <input type="hidden" name="studentId" value="${student.studentId}">
    姓名：<label>
    <input type="text" name="studentName" value="${student.studentName}">
</label><br><br>
    班级ID：<label>
    <input type="number" name="classId" value="${student.classId}">
</label><br><br>
    密码：<label>
    <input type="password" name="password" value="${student.password}">
</label><br><br>
    <input type="submit" value="更新">
</form>

</body>
</html>