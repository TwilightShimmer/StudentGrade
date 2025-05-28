<jsp:useBean id="grade" scope="request" type="top.zoransunburst.studentGrade.pojo.Grade"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑学生成绩</title>
</head>
<body>
<h2>编辑学生成绩</h2>
<form action="${pageContext.request.contextPath}/admin/updateGrade" method="post">
    <input type="hidden" name="gradeId" value="${grade.gradeId}">

    <div>
        <label for="studentId">学生ID：</label>
        <input type="number" id="studentId" name="studentId" value="${grade.studentId}" required>
    </div>

    <div>
        <label for="courseId">课程ID：</label>
        <input type="number" id="courseId" name="courseId" value="${grade.courseId}" required>
    </div>

    <div>
        <label for="score">成绩：</label>
        <input type="number" step="0.01" id="score" name="score" value="${grade.score}" required>
    </div>

    <button type="submit">保存</button>
    <a href="${pageContext.request.contextPath}/admin/manageStudents/${grade.courseId}">取消</a>
</form>
</body>
</html>
