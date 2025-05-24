<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生信息</title>
</head>
<body>
<h1>学生信息</h1>
<c:if test="${not empty list}">
    <table border="1">
        <thead>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>班级</th>
            <th>选择该学生</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="student">
            <tr>
                <td>${student.studentId}</td>
                <td>${student.studentName}</td>
                <td>${student.classId}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/grade/chooseGrade/${student.studentId}">查看成绩</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
<c:if test="${empty list}">
    <p>没有学生信息。</p>
</c:if>
</body>
</html>
