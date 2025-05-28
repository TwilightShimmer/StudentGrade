<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ page isELIgnored="false" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>成绩信息</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>成绩信息</h1>--%>
<%--<c:if test="${not empty grade}">--%>
<%--    <table border="1">--%>
<%--        <thead>--%>
<%--        <tr>--%>
<%--&lt;%&ndash;            <th>成绩ID</th>&ndash;%&gt;--%>
<%--            <th>学生ID</th>--%>
<%--            <th>课程ID</th>--%>
<%--            <th>分数</th>--%>
<%--            <th>排名查看</th>--%>
<%--        </tr>--%>
<%--        </thead>--%>
<%--        <tbody>--%>
<%--        <c:forEach items="${grade}" var="grade">--%>
<%--            <tr>--%>
<%--&lt;%&ndash;                <td>${grade.gradeId}</td>&ndash;%&gt;--%>
<%--                <td>${grade.studentId}</td>--%>
<%--                <td>${grade.courseId}</td>--%>
<%--                <td>${grade.score}</td>--%>
<%--                <td>--%>
<%--                    <a href="${pageContext.request.contextPath}/grade/ranking/${grade.courseId}">查看排名</a>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--        </tbody>--%>
<%--    </table>--%>
<%--</c:if>--%>
<%--<c:if test="${empty grade}">--%>
<%--    <p>没有成绩信息。</p>--%>
<%--</c:if>--%>
<%--</body>--%>
<%--</html>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生成绩</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
</head>
<body>

<div class="container">
    <h2>学生成绩列表</h2>

    <table class="data-table">
        <thead>
        <tr>
            <th>成绩ID</th>
            <th>学生ID</th>
            <th>课程ID</th>
            <th>得分</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${grade}" var="g">
            <tr>
                <td>${g.gradeId}</td>
                <td>${g.studentId}</td>
                <td>${g.courseId}</td>
                <td>${g.score}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <br/>
    <a href="#" onclick="window.history.back()">返回</a>
</div>

</body>
</html>