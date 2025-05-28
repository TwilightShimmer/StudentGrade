<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改课程信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css"></head>
<body>

<div class="container">
    <h2>修改课程信息</h2>

    <form action="${pageContext.request.contextPath}/course/update" method="post">
        <input type="hidden" name="courseId" value="${course.courseId}">
        课程名称：<label>
        <input type="text" name="courseName" value="${course.courseName}" required>
    </label><br>
        学分：<label>
        <input type="number" name="credit" value="${course.credit}" required>
    </label><br>
        授课教师：<label>
        <input type="text" name="teacherName" value="${course.teacherName}">
    </label><br>
        <input type="submit" value="更新">
    </form>
</div>

</body>
</html>