<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>试题列表</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
</head>


<body>

<div class="container">
  <h2>试题列表</h2>

  <a href="${pageContext.request.contextPath}/question/add" class="btn">添加新试题</a>

  <table class="data-table">
    <thead>
    <tr>
      <th>题号</th>
      <th>题目内容</th>
      <th>A</th>
      <th>B</th>
      <th>C</th>
      <th>D</th>
      <th>正确答案</th>
      <th>难度</th>
      <th>科目</th>
      <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${questions}" var="q">
      <tr>
        <td>${q.questionId}</td>
        <td>${q.content}</td>
        <td>${q.optionA}</td>
        <td>${q.optionB}</td>
        <td>${q.optionC}</td>
        <td>${q.optionD}</td>
        <td>${q.correctAnswer}</td>
        <td>${q.difficulty}</td>
        <td>${q.subject}</td>
        <td>
          <a href="${pageContext.request.contextPath}/question/update?questionId=${q.questionId}">修改</a>
          <a href="${pageContext.request.contextPath}/question/delete?questionId=${q.questionId}" onclick="return confirm('确定要删除吗？')">删除</a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>