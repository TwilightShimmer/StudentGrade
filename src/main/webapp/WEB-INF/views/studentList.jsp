<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>学生列表</title>
</head>
<body>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<h2>学生列表</h2>

<table border="1">
  <tr>
    <th>学号</th>
    <th>姓名</th>
    <th>班级ID</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${students}" var="student">
    <tr>
      <td>${student.studentId}</td>
      <td>${student.studentName}</td>
      <td>${student.classId}</td>
      <td>
        <a href="${pageContext.request.contextPath}/user/update?studentId=${student.studentId}">修改</a>
        <a href="${pageContext.request.contextPath}/user/delete?studentId=${student.studentId}"
           onclick="return confirm('确定要删除该学生吗？')">删除</a>
      </td>
    </tr>
  </c:forEach>
</table>

<br/>
<a href="${pageContext.request.contextPath}/user/add">添加学生</a>

</body>
</html>