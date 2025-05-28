<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生成绩</title>
</head>
<body>
<h2>添加学生成绩</h2>
<form action="${pageContext.request.contextPath}/admin/saveGrade" method="post">
    <input type="hidden" name="courseId" value="${teacherId}">

    <div>
        <label for="studentId">学生ID：</label>
        <input type="number" id="studentId" name="studentId" required>
    </div>

    <div>
        <label for="score">成绩：</label>
        <input type="number" step="0.01" id="score" name="score" required>
    </div>

    <button type="submit">提交</button>
    <a href="${pageContext.request.contextPath}/admin/manageStudents/${teacherId}">返回</a>
</form>
</body>
</html>
