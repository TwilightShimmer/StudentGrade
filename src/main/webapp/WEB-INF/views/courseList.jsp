<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>课程列表</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/student.css">
</head>
<body>

<div class="container">
    <h2>课程列表</h2>

    <table>
        <thead>
        <tr>
            <th>课程编号</th>
            <th>课程名称</th>
            <th>学分</th>
            <th>授课教师</th>
            <th>课程描述</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${courses}" var="course">
            <tr>
                <td>${course.courseId}</td>
                <td>${course.courseName}</td>
                <td>${course.credit}</td>
                <td>${course.teacherName}</td>
                <td>${course.description}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/course/update?courseId=${course.courseId}" class="button">修改</a>
                    <a href="${pageContext.request.contextPath}/course/delete?courseId=${course.courseId}" class="button" onclick="return confirm('确定要删除吗？')">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <a href="${pageContext.request.contextPath}/course/add" class="button">添加课程</a>
</div>

</body>
</html>