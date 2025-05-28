<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>添加学生</title>
</head>
<body>

<h2>添加学生</h2>

<form action="${pageContext.request.contextPath}/user/add" method="post">
  姓名：<label>
  <input type="text" name="studentName">
</label><br><br>
  班级ID：<label>
  <input type="number" name="classId">
</label><br><br>
  密码：<label>
  <input type="password" name="password">
</label><br><br>
  <input type="submit" value="提交">
</form>

</body>
</html>