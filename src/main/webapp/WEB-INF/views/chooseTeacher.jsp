<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>教师信息</title>
</head>
<body>
<h1>教师信息</h1>
<c:if test="${not empty list}">
    <table border="1">
        <thead>
        <tr>
            <th>姓名</th>
            <th>工号</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="teacher">
            <tr>
                <td>${teacher.teacherName}</td>
                <td>${teacher.teacherId}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/teacher/manageStudents/${teacher.teacherId}">管理学生成绩</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
<c:if test="${empty list}">
    <p>没有教师信息。</p>
</c:if>
</body>
</html>