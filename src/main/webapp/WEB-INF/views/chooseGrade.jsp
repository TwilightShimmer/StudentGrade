<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>成绩信息</title>
</head>
<body>
<h1>成绩信息</h1>
<c:if test="${not empty grade}">
    <table border="1">
        <thead>
        <tr>
<%--            <th>成绩ID</th>--%>
            <th>学生ID</th>
            <th>课程ID</th>
            <th>分数</th>
            <th>排名查看</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${grade}" var="grade">
            <tr>
<%--                <td>${grade.gradeId}</td>--%>
                <td>${grade.studentId}</td>
                <td>${grade.courseId}</td>
                <td>${grade.score}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/grade/ranking/${grade.courseId}">查看排名</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
<c:if test="${empty grade}">
    <p>没有成绩信息。</p>
</c:if>
</body>
</html>