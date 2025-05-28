<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生仪表盘</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css"></head>
<body>

<div class="container">
    <c:set var="student" value="${sessionScope.student}" />
    <h1>欢迎${student.studentName}使用本系统！</h1>
    <h1>欢迎使用学生仪表盘！</h1>

    <div class="module">
        <h2>试题管理</h2>
        <p>查看和练习已发布试题</p>
        <a href="${pageContext.request.contextPath}/question/list" class="btn">进入题库</a>
    </div>

    <div class="module">
        <h2>考试安排</h2>
        <p>查看当前考试计划与时间安排</p>
        <a href="${pageContext.request.contextPath}/exam/schedule" class="btn">查看考试安排</a>
    </div>
    <div class="module">
        <h2>成绩统计</h2>
        <p>查看历史考试成绩与分析</p>
        <a href="${pageContext.request.contextPath}/grade/analysis/${student.studentId}" class="btn">成绩分析报告</a>
    </div>
</div>

</body>
</html>