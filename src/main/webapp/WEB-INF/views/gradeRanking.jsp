<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>成绩排名</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>成绩排名 - 课程ID: ${courseId}</h1>--%>
<%--<c:if test="${not empty ranking}">--%>
<%--    <table border="1">--%>
<%--        <thead>--%>
<%--        <tr>--%>
<%--            <th>排名</th>--%>
<%--            <th>学生ID</th>--%>
<%--            <th>分数</th>--%>
<%--        </tr>--%>
<%--        </thead>--%>
<%--        <tbody>--%>
<%--        <c:forEach items="${ranking}" var="rank">--%>
<%--            <tr>--%>
<%--                <td>${rank.rank}</td>--%>
<%--                <td>${rank.student_id}</td>--%>
<%--                <td>${rank.score}</td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--        </tbody>--%>
<%--    </table>--%>
<%--</c:if>--%>
<%--<c:if test="${empty ranking}">--%>
<%--    <p>没有成绩信息。</p>--%>
<%--</c:if>--%>
<%--<a href="${pageContext.request.contextPath}/grade/chooseGrade/${ranking[0].student_id}">返回</a>--%>
<%--</body>--%>
<%--</html>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>成绩排名</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
</head>
<body>

<div class="container">
    <h2>课程成绩排名</h2>

    <table class="data-table">
        <thead>
        <tr>
            <th>学生ID</th>
            <th>成绩</th>
            <th>排名</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ranking}" var="r">
            <tr>
                <td>${r.student_id}</td>
                <td>${r.score}</td>
                <td>${r.rank}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <br/>
    <a href="#" onclick="window.history.back()">返回</a>
</div>

</body>
</html>