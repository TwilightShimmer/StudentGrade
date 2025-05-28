<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生选课情况</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/student.css">
</head>
<body>

<div class="container">
    <h2>学生选课情况</h2>

    <table>
        <thead>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>课程编号</th>
            <th>课程名称</th>
            <th>学分</th>
            <th>授课教师</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${selectedCourses}" var="sc">
            <tr>
                <td>${sc.studentId}</td>
                <td>${sc.studentName}</td>
                <td>${sc.courseId}</td>
                <td>${sc.courseName}</td>
                <td>${sc.credit}</td>
                <td>${sc.teacherName}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>