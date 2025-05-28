<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加课程</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/student.css">
</head>
<body>

<div class="container">
    <h2>添加课程</h2>

    <form action="${pageContext.request.contextPath}/course/add" method="post">
        课程名称：<label>
        <input type="text" name="courseName" required>
    </label><br>
        学分：<label>
        <input type="number" name="credit" required>
    </label><br>
        授课教师：<label>
        <input type="text" name="teacherName">
    </label><br>
        <input type="submit" value="提交">
    </form>
</div>

</body>
</html>