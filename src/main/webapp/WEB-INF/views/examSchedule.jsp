<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>考试安排</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
</head>
<body>

<div class="container">
    <h2>考试安排</h2>

    <table class="data-table">
        <thead>
        <tr>
            <th>考试科目</th>
            <th>考试日期</th>
            <th>开始时间</th>
            <th>结束时间</th>
            <th>考场地点</th>
            <th>说明</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${schedules}" var="schedule">
            <tr>
                <td>${schedule.subject}</td>
                <td>${schedule.examDate}</td>
                <td>${schedule.startTime}</td>
                <td>${schedule.endTime}</td>
                <td>${schedule.location}</td>
                <td>${schedule.description}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>