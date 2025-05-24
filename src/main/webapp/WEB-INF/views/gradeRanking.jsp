<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成绩排名</title>
</head>
<body>
<h1>成绩排名 - 课程ID: ${courseId}</h1>
<c:if test="${not empty ranking}">
    <table border="1">
        <thead>
        <tr>
            <th>排名</th>
            <th>学生ID</th>
            <th>分数</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ranking}" var="rank">
            <tr>
                <td>${rank.rank}</td>
                <td>${rank.student_id}</td>
                <td>${rank.score}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
<c:if test="${empty ranking}">
    <p>没有成绩信息。</p>
</c:if>
<a href="${pageContext.request.contextPath}/grade/chooseGrade/${ranking[0].student_id}">返回</a>
</body>
</html>