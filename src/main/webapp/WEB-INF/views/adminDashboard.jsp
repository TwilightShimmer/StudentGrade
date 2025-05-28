<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>管理员仪表盘</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
</head>
<body>
<div class="container">
    <c:set var="admin" value="${sessionScope.admin}" />
    <h1>欢迎${admin.adminName}使用本系统！</h1>
    <!-- 学生管理 -->
    <section class="management-section">
        <h2>学生信息管理</h2>
        <a href="${pageContext.request.contextPath}/user/list">查看并管理所有学生的信息</a>
    </section>
<%--    <!-- 学生管理 -->--%>
<%--    <section class="management-section">--%>
<%--        <h2>学生成绩管理</h2>--%>
<%--        <c:set var="admin" value="${sessionScope.admin}" />--%>
<%--        <a href="${pageContext.request.contextPath}/teacher/manageStudents/${admin.adminId}">查看学生成绩</a>--%>
<%--        <a href="${pageContext.request.contextPath}/teacher/addGrade/${admin.adminId}">添加学生成绩</a>--%>
<%--    </section>--%>
    <!-- 课程管理 -->
    <section class="management-section">
        <h2>课程信息管理</h2>
        <a href="${pageContext.request.contextPath}/course/list">查看并管理所有课程</a>
    </section>

    <!-- 选课情况 -->
    <section class="management-section">
        <h2>学生选课情况</h2>
        <a href="${pageContext.request.contextPath}/selectedCourse/list">查看学生选课情况</a>
    </section>
</div>
</body>
</html>